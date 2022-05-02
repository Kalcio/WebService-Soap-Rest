<?php

require_once "vendor/econea/nusoap/src/nusoap.php";

$namespace = "T1_Redes.alv";
$server = new soap_server();
$server->configureWSDL("Soap", $namespace);
$server->wsdl->schemaTargetNamespace = $namespace;
$stringer = 'xsd:string';


$server->register(
    'validarRut',
    array('rut' => $stringer, 'dv' => $stringer),
    array('return' => $stringer),
    $namespace,
    false,
    'rpc',
    'encoded',
    'Recibe un rut y los separa',
);

$server->register(
    'separarNombres',
    array('name' => $stringer, 'num'),
    array('separa' => $stringer),
    $namespace,
    false,
    'rpc',
    'encoded',
    'Recibe un nombre y los separa',
);


function validarRut($rut, $dv){
    $r=(int)$rut;
    $d=(int)$dv;
    $s=1;
    for($m=0;$r!=0;$r/=10) {
        $s=($s+$r%10*(9-$m++%6))%11;
    }
    if($dv == chr($s?$s+47:75)){
        return "El rut: " . $rut . "-" . $d . " es VALIDO";
    }else {
        return "El rut: " . $rut . "-" . $d . " es INVALIDO";
    }
}

function separarNombres($names, $num){
    $separador = ' ';
    $separados = explode($separador, $names);

   if(count($separados)==4) {
       if($num==0){
            return "$separados[0]";
        }
       else if($num==1){
            return "$separados[1]";
        }
        else if($num==2){
            return "$separados[2]";
        }
        else if($num==3){
            return "$separados[3]";
        }
   }
    return "No valido";
    
}

$POST_DATA = file_get_contents("php://input");
$server->service($POST_DATA);
exit();