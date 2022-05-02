<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="ClienteSOAP.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>T1 Redes - G5</title>
    <link type="text/css" href="Content/bootstrap.min.css" rel="stylesheet" />
    <script type="text/javascript" src="Scripts/bootstrap.min.js"></script>
</head>
<body>
    <nav class="navbar navbar-light bg-light">
        <a class="navbar-brand" href="#">
            <img src="img/logo.jpg" height="40" class="d-inline-block align-top" alt="" aria-dropeffect="popup"/>
            Grupo 5
        </a>
    </nav>
    <section class="w-100 p-4 d-flex justify-content-center pb-4 ">
        <form id="form1" runat="server">
            <section class="row bg-secondary text-center ">
                <section class="Contenido col order-1">
            <div>
                <p>Ingrese su RUT y dígito verificador</p>
            </div>
            <div class="input-group mb-3 justify-content-center">
                <div class="col-md-3">
                    <asp:TextBox ID="Rut" class="form-control" placeholder="Rut" runat="server"></asp:TextBox>
                </div>
                <span class="input-group-text">
                -</span>
                <div class="col-md-2">
                    <asp:TextBox ID="DV" class="form-control" name="dv" placeholder="DV" runat="server"></asp:TextBox>
                </div>              
            </div>
            <div class="col-12">
                <asp:Button ID="Button1" class="btn btn-primary" runat="server" OnClick="Button1_Click" OnClientClick="mostrarTexto2()" Text="Ingrese rut" style="margin-bottom: 5px" />
            </div>
                <div id="RespuestaRut" class="bg-white" style="margin-top: 10px; display:none; ">
                <p>
            <asp:Label ID="Label1" runat="server" Text="Label" ></asp:Label>
        </p>
                </div>
            </section>
                </section>
            <div class="NombresContent row bg-secondary text-center" style="margin-top: 10px">
            <div>
                <p>Ingrese su nombre y apellidos</p>
            </div>
            <div class="input-group mb-3 justify-content-center">
                <div class="col-md-3">
                    <asp:TextBox ID="Nombres" class="form-control" placeholder="Nombre y apellidos" runat="server"></asp:TextBox>
                </div>

            </div>
            <div class="col-12">

                <asp:Button ID="Button2" runat="server"  class="btn btn-primary" OnClick="Button2_Click" OnClientClick="mostrarTexto()"  Text="Ingresar nombre" style="margin-bottom: 5px" />

            </div>
                 <div class"container">
         <div id="RespuestaNombres" class="bg-white" style="margin-top: 10px; display:none;" >
      
        <p style="margin-right: 3px">
            Nombres:   
            <asp:Label ID="Label2" runat="server" Text="Label" ></asp:Label>
        </p>
       
        <p style="margin-right: 3px">
            Nombres:
            <asp:Label ID="Label3" runat="server" Text="Label"></asp:Label>
        </p>
        <p style="margin-right: 3px">
            Apellido Paterno:
            <asp:Label ID="Label4" runat="server" Text="Label" ></asp:Label>
        </p>
        <p style="margin-right: 3px">
            Apellido Materno:
            <asp:Label ID="Label5" runat="server" Text="Label"></asp:Label>
        </p>
        </div> 

           </div>
        </form>
          
    </section>
 
     </div>
    <script type="text/javascript">
        function mostrarTexto() {
            document.getElementById('RespuestaNombres').style.display = 'block';
        }
        function mostrarTexto2() {
            document.getElementById('RespuestaRut').style.display = 'block';
           
        }
        </script>
</body>
</html>
