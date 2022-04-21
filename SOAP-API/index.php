<?php

require_once "vendor/econea/nusoap/src/nusoap.php";

$namespace = "T1_Redes.alv";
$server = new soap_server();
$server->configureWSDL("Soap", $namespace);
$server->wsdl->schemaTargetNamespace = $namespace;
$stringer = 'xsd:string';

// $server->wsdl->addComplexType(
//     'nombres',
//     'complextype',
//     'struct',
//     'all',
//     '',
//     array(
//         'Nombre' => array('name' => 'Nombre', 'type'=>'xsd:string'),
//     )
// );

$server->wsdl->addComplexType('nombresSeparados','complexType','array','sequence','',
    array(
        'nombre' => array('name'=>'nombre', 'type'=>$stringer),
        'apellidoPaterno' => array('name'=>'apellidoPaterno', 'type'=>$stringer),
        'apellidoMaterno' => array('name'=>'apellidoMaterno', 'type'=>$stringer),
        )
);

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
    array('name' => $stringer),
    array('separa' => 'tns:nombresSeparados'),
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

function separarNombres($names){
    $separador = ' ';
    $separados = explode($separador, $names);

    if(count($separados)<3){
        return array('faltan datos');
    } else{
        return array_chunk($separados,3);
    }
}

$POST_DATA = file_get_contents("php://input");
$server->service($POST_DATA);
exit();