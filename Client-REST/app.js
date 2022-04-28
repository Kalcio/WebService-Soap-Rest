var url;
fetch('config.json')
.then(data => data.json())
.then(data => {
    url = data.url;
})
//-.-.-.-.- Rut -.-.-.-.-.-.-

var contenidoRut = document.querySelector('#contenidoRut')
var errorRut = document.querySelector('#errorRut')

        
function jsonRutGet(){
    console.log('-.-<Se llamo a la función jsonRutGet()>-.-')
    writeTextLog ('-.-<Se llamo a la función jsonRutGet()>-.-')
    fetch(url + 'Rut')
    .then(data => data.json())
    .then(data => {
        console.log('Informacion por pantalla: ' + ' Rut:'+ data.rut + ' Digito Verificador:' + data.verifyCode + ' Validate:' +data.validate)
        writeTextLog ('Informacion por pantalla: ' + ' Rut:'+ data.rut + ' Digito Verificador:' + data.verifyCode + ' Validate:' +data.validate)
        contenidoRut.innerHTML = `
        <div class="alert alert-info text-light bg-dark" role="alert">
        <p>el rut que se encuentra ahora mismo en el WS es : ${data.rut}</p>
        <p>El digito Verificador es: ${data.verifyCode}</p>
        <p>El Rut Se ecuentra validado: ${data.validate}</p>
        </div>
        `
    })
}


var formularioRut = document.getElementById('formularioRut');

formularioRut.addEventListener('submit',function(e){
    e.preventDefault();                          //evita que se envie el formulario vacio
    var datos = new FormData(formularioRut)        
    var rut = datos.get('InputRut')
    var verifyCode = rut.charAt(rut.length -1);
    var verifyCodeTarget = ['1','2','3','4','5','6','7','8','9','0','k','K'];
    min=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","u","v",
    "w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N",
    "O","P","Q","R","S","U","V","W","X","Y","Z"];

    if(rut.includes('-') && contains(verifyCode,verifyCodeTarget) && !contains(rut,min) && rut.length == 9 || rut.length == 10){
        console.log('El Formato de los Datos de Rut Es correcto, y se envio para su evaluacio...')
        writeTextLog('El Formato de los Datos de Rut Es correcto, y se envio para su evaluacio...')
        rut = rut.slice(0, -2)

        const jsonRutPost = new Request(url + 'Rut', {
            method: 'POST',
            headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
            },
            body: JSON.stringify({rut: rut, verifyCode: verifyCode})
        });
        console.log('Respuesta/GET WS Metodo Rut:')
        writeTextLog('Respuesta/GET WS Metodo Rut:')
        fetch(jsonRutPost)
        .then(response => {
            if (!response.ok) throw Error(response.status);
            return response;
        })
        .then(response => {console.log("Se Envio Correctamente el metodo POST")
        writeTextLog("Se Envio Correctamente el metodo POST")
        errorRut.innerHTML=`<div class="alert alert-success text-light bg-dark" role="alert"> Se Envio Correctamente el metodo POST</div>
        `
        jsonRutGet();
        })
        .catch(error => console.log(error));
    }
    else{
        console.log("El Rut debe tener un formato valido");
        writeTextLog("El Rut debe tener un formato valido");
        errorRut.innerHTML=`<div class="alert alert-danger text-light bg-dark" role="alert"> El Rut debe tener un formato valido</div>`
    }
    
})

//-.-.-.- AUX FUNCTION -.-.-.-.-.

function contains(target, pattern){
    var value = 0;
    pattern.forEach(function(word){
      value = value + target.includes(word);
    });
    return (value === 1)
}

//-.-.-.-.- SAVE LOG -.-.-.-.-.-.-

function download(strData, strFileName, strMimeType) {
    var D = document,
        A = arguments,
        a = D.createElement("a"),
        d = A[0],
        n = A[1],
        t = A[2] || "text/plain";

    //build download link:
    a.href = "data:" + strMimeType + "charset=utf-8," + escape(strData);


    if (window.MSBlobBuilder) { // IE10
        var bb = new MSBlobBuilder();
        bb.append(strData);
        return navigator.msSaveBlob(bb, strFileName);
    } /* end if(window.MSBlobBuilder) */



    if ('download' in a) { //FF20, CH19
        a.setAttribute("download", n);
        a.innerHTML = "downloading...";
        D.body.appendChild(a);
        setTimeout(function() {
            var e = D.createEvent("MouseEvents");
            e.initMouseEvent("click", true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);
            a.dispatchEvent(e);
            D.body.removeChild(a);
        }, 66);
        return true;
    }; /* end if('download' in a) */



    //do iframe dataURL download: (older W3)
    var f = D.createElement("iframe");
    D.body.appendChild(f);
    f.src = "data:" + (A[2] ? A[2] : "application/octet-stream") + (window.btoa ? ";base64" : "") + "," + (window.btoa ? window.btoa : escape)(strData);
    setTimeout(function() {
        D.body.removeChild(f);
    }, 333);
    return true;
}
var textLog;
function callDownload(){
    download(textLog , 'ConsoleLog.log', 'text/plain');
}
function writeTextLog(text){
    textLog =  textLog + '\n' + '['+ new Date().toLocaleString() + '] ' + text + '\n';
}

//-.-.-.-.- Split -.-.-.-.-.-.-

var contenidoSplit = document.querySelector('#contenidoSplit')
var errorSplit = document.querySelector('#errorSplit')

function jsonSplitGet(){
    
    fetch(url + 'Split')
    .then(data => data.json())
    .then(data => {
        var nombres = data.nombres;
        data.nombres.forEach(element => {
            contenidoSplit.innerHTML = `${element}`
        });
        console.log('Nombres: ' + data.nombres + ' Apellido Paterno: ' + data.paterno + ' Apellido Materno: ' + data.materno)
        writeTextLog('Nombres: ' + data.nombres + ' Apellido Paterno: ' + data.paterno + ' Apellido Materno: ' + data.materno)
        contenidoSplit.innerHTML = ` <div class="alert alert-info text-light bg-dark" role="alert">`
        
        + `<p>Los Nombres Registrados son ${data.nombres}<p>` +
        `<p>Apellido Paterno : ${data.paterno}</p>
        <p>Apellido Materno: ${data.materno}</p>
        </div>
        `
    })
}

var formularioSplit = document.getElementById('formularioSplit');


formularioSplit.addEventListener('submit',function(e){
    e.preventDefault();                          //evita que se envie el formulario vacio
    var datos = new FormData(formularioSplit)        
    var InputSplit = datos.get('InputSplit')
    var iChars = "@#$%^&*()+=-]\\[\';,!/}|\"{:<>?";
    countSplit = (InputSplit.match(/ /g) || []).length;

    if(InputSplit.includes(' ') && countSplit >= 2 ) {    
        console.log('El Formato de los Datos de Split Es correcto, y se envio para su evaluacio...')
        writeTextLog('El Formato de los Datos de Split Es correcto, y se envio para su evaluacio...')
        const jsonSplitPost = new Request(url + 'Split', {
            method: 'POST',
            headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
            },
            body: JSON.stringify({nombreCompleto: InputSplit})
        });
        console.log('Respuesta/GET WS Metodo Split:')
        writeTextLog('Respuesta/GET WS Metodo Split:')
        fetch(jsonSplitPost)
        .then(response => {
            if (!response.ok) throw Error(response.status);
            return response;
        })
        .then(response => {console.log("Se Envio Correctamente el metodo POST")
        writeTextLog("Se Envio Correctamente el metodo POST")
        errorSplit.innerHTML=`<div class="alert alert-success text-light bg-dark" role="alert"> Se Envio Correctamente el metodo POST</div>
        `
        jsonSplitGet();
        })
        .catch(error => console.log(error));
    }
    else{
        console.log("El nombre debe tener un formato valido");
        writeTextLog("El nombre debe tener un formato valido");
        errorSplit.innerHTML=`<div class="alert alert-danger text-light bg-dark" role="alert"> El nombre debe tener un formato valido </div>`
    }
    
})