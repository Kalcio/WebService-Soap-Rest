document.getElementById('form').addEventListener('submit', function(e){
    e.preventDefault();
    const rut = document.getElementById("rut").value;
    const dv = document.getElementById("dv").value;

    if(rut === '' || rut == 'null'){
        console.log("Rut vacio");
    } else if(dv === '' || dv == 'null'){
        console.log("dv vacio");
    } else {
        verificarRut(rut, dv);
    }
});

function verificarRut(rut, dv) {
    var a=0,b=1;
    for(;rut; rut=Math.floor(rut/10))
    b=(b+rut%10*(9-a++%6))%11;
    //return S?S-1:'k';
    var result = b?b-1:'k';
    if(dv == result) {
        console.log("Es correcto");
    } else {
        console.log("Es incorrecto");
    }
};