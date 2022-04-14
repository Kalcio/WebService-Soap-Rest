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
    'separarNombres',
    array('name' => 'tns:nombres'),
    array('name' => 'tns:response'),
    $namespace,
    false,
    'rpc',
    'encoded',
    'Recibe un nombre y los separa',
);

function separarNombres($names){
    // $separador = ' ';
    // $separados = explode($separador, $names);

    // if(count($separados)<3){

    // }
    return array("Numero de Intentos");
}

$POST_DATA = file_get_contents("php://input");
$server->service($POST_DATA);
exit();