<?php

require_once "vendor/econea/nusoap/src/nusoap.php";

$namespace = "T1_Redes.alv";
$server = new soap_server();
$server->configureWSDL("Soap", $namespace);
$server->wsdl->schemaTargetNamespace = $namespace;

$server->wsdl->addComplexType(
    'nombres',
    'complextype',
    'struct',
    'all',
    '',
    array(
        'Nombre' => array('name' => 'Nombre', 'type'=>'xsd:string'),
    )
);

$server->register(
    'validarRut',
    array('rut' => 'xsd:string', 'dv' => 'xsd:string'),
    array('return' => 'xsd:string'),
    $namespace,
    false,
    'rpc',
    'encoded',
    'Recibe un nombre y los separa',
);

// $server->register(
//     'separarNombres',
//     array('name' => 'tns:nombres'),
//     array('nombre' => 'tns:nombre', 'apellido1' => 'tns:apellido1', 'apellido2' => 'tns:apellidos2'),
//     $namespace,
//     false,
//     'rpc',
//     'encoded',
//     'Recibe un nombre y los separa',
// );


function validarRut($rut, $dv){
    $r=(int)$rut;
    $d=(int)$dv;
    $s=1;
     for($m=0;$r!=0;$r/=10)
        $s=($s+$r%10*(9-$m++%6))%11;
     if($dv == chr($s?$s+47:75)){
         $negativo = "El rut: " . $rut . "-" . $dv . " es VALIDO";
        return $negativo;
     }else {
        $positivo = "El rut: " . $rut . "-" . $dv . " es INVALIDO";
        return $positivo;
     }
}

// function separarNombres($names){
//     $separador = ' ';
//     $separados = explode($separador, $names);

//     if(count($separados)<3){
//         return array("Error con los datos");
//     }
// }

$POST_DATA = file_get_contents("php://input");
$server->service($POST_DATA);
exit();