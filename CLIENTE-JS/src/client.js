console.log("Hello World");

this.tinysoap.createClient("/SOAP-API/SOAP-API/index.php?wsdl", function(err, client){
    if(!err)
        console.log(client);
});
