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
            <img src="img/logo.jpg" height="40" class="d-inline-block align-top" alt=""/>
            Grupo 5
        </a>
    </nav>
    <section class="w-100 p-4 d-flex justify-content-center pb-4 $blue">
        <form id="form1" runat="server">
            <div>
                <p>Ingrese su RUT y dígito verificador</p>
            </div>
            <div class="input-group mb-3">
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
                <asp:Button ID="Button1" class="btn btn-primary" runat="server" OnClick="Button1_Click" Text="Button" />
            </div>
        </form>
        <p>
            <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
        </p>
    </section>

</body>
</html>
