using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ClienteSOAP
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            WebServiceSOAP1.Soap ws = new WebServiceSOAP1.Soap();
            var result = ws.validarRut(Rut.Text, DV.Text);
            Label1.Text = result;
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            WebServiceSOAP1.Soap ws = new WebServiceSOAP1.Soap();
            string result0 = ws.separarNombres(Nombres.Text, 0);
            Label2.Text = result0;
            string result1 = ws.separarNombres(Nombres.Text, 1);
            Label3.Text = result1;
            string result2 = ws.separarNombres(Nombres.Text, 2);
            Label4.Text = result2;
            string result3 = ws.separarNombres(Nombres.Text, 3);
            Label5.Text = result3;
        }
    }
}