Instalación

Para poder ejecutar el WebService dentro de un contenedor web como puede ser TomCat se debe introducir el archivo .war dentro de la carpeta “webapps” y ejecutar tomcat, para acceder a la api mediante tomcat se debe anteponer el nombre del archivo .war y luego la anotación correspondiente a cada función. 

Ejemplo con tomcat mediante localhost.

“WebServiceREST-G5.war”

http://localhost:8080/WebServiceREST-G5/Rut

http://localhost:8080/WebServiceREST-G5/Split


Descripción y Estructuras.


Este web Service se realizó con Springboot, utilizando spring tool suite como entorno de desarrollo; Esta Api tiene como objetivo entregar información procesada de los métodos /Rut y /Split, cada uno con sus respectivos modelos y servicios, a continuación, se presentará un ejemplo de la estructura entregada y proporcionadas al servidor para ser procesadas:

/Rut

Post / Input: 

{

    "rut": "20107983",
    "verifyCode" : "7"
}


Get / Output:

{

    "validate": true,
    "verifyCode": "7",
    "rut": 20107983
}

/Split 

Post / Input: 
{

    "nombreCompleto" : "Cristobal Andres Ramirez Gonzalez"
}

Get / Output:
{

    "nombres": [
        "Cristobal",
        "Andres"
    ],
    "paterno": "Ramirez",
    "materno": "Gonzalez"
}
