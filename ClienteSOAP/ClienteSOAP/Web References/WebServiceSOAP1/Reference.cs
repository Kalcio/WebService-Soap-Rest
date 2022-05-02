﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

// 
// Microsoft.VSDesigner generó automáticamente este código fuente, versión=4.0.30319.42000.
// 
#pragma warning disable 1591

namespace ClienteSOAP.WebServiceSOAP1 {
    using System;
    using System.Web.Services;
    using System.Diagnostics;
    using System.Web.Services.Protocols;
    using System.Xml.Serialization;
    using System.ComponentModel;
    
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.8.4084.0")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Web.Services.WebServiceBindingAttribute(Name="SoapBinding", Namespace="T1_Redes.alv")]
    public partial class Soap : System.Web.Services.Protocols.SoapHttpClientProtocol {
        
        private System.Threading.SendOrPostCallback validarRutOperationCompleted;
        
        private System.Threading.SendOrPostCallback separarNombresOperationCompleted;
        
        private bool useDefaultCredentialsSetExplicitly;
        
        /// <remarks/>
        public Soap() {
            this.Url = global::ClienteSOAP.Properties.Settings.Default.ClienteSOAP_WebServiceSOAP1_Soap;
            if ((this.IsLocalFileSystemWebService(this.Url) == true)) {
                this.UseDefaultCredentials = true;
                this.useDefaultCredentialsSetExplicitly = false;
            }
            else {
                this.useDefaultCredentialsSetExplicitly = true;
            }
        }
        
        public new string Url {
            get {
                return base.Url;
            }
            set {
                if ((((this.IsLocalFileSystemWebService(base.Url) == true) 
                            && (this.useDefaultCredentialsSetExplicitly == false)) 
                            && (this.IsLocalFileSystemWebService(value) == false))) {
                    base.UseDefaultCredentials = false;
                }
                base.Url = value;
            }
        }
        
        public new bool UseDefaultCredentials {
            get {
                return base.UseDefaultCredentials;
            }
            set {
                base.UseDefaultCredentials = value;
                this.useDefaultCredentialsSetExplicitly = true;
            }
        }
        
        /// <remarks/>
        public event validarRutCompletedEventHandler validarRutCompleted;
        
        /// <remarks/>
        public event separarNombresCompletedEventHandler separarNombresCompleted;
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("http://localhost/T1-Redes-ClienteSoap/SOAP-API/index.php/validarRut", RequestNamespace="T1_Redes.alv", ResponseNamespace="T1_Redes.alv")]
        [return: System.Xml.Serialization.SoapElementAttribute("return")]
        public string validarRut(string rut, string dv) {
            object[] results = this.Invoke("validarRut", new object[] {
                        rut,
                        dv});
            return ((string)(results[0]));
        }
        
        /// <remarks/>
        public void validarRutAsync(string rut, string dv) {
            this.validarRutAsync(rut, dv, null);
        }
        
        /// <remarks/>
        public void validarRutAsync(string rut, string dv, object userState) {
            if ((this.validarRutOperationCompleted == null)) {
                this.validarRutOperationCompleted = new System.Threading.SendOrPostCallback(this.OnvalidarRutOperationCompleted);
            }
            this.InvokeAsync("validarRut", new object[] {
                        rut,
                        dv}, this.validarRutOperationCompleted, userState);
        }
        
        private void OnvalidarRutOperationCompleted(object arg) {
            if ((this.validarRutCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.validarRutCompleted(this, new validarRutCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("http://localhost/T1-Redes-ClienteSoap/SOAP-API/index.php/separarNombres", RequestNamespace="T1_Redes.alv", ResponseNamespace="T1_Redes.alv")]
        [return: System.Xml.Serialization.SoapElementAttribute("separa")]
        public string separarNombres(string name, int num) {
            object[] results = this.Invoke("separarNombres", new object[] {
                        name,
                        num});
            return ((string)(results[0]));
        }
        
        /// <remarks/>
        public void separarNombresAsync(string name) {
            this.separarNombresAsync(name, null);
        }
        
        /// <remarks/>
        public void separarNombresAsync(string name, object userState) {
            if ((this.separarNombresOperationCompleted == null)) {
                this.separarNombresOperationCompleted = new System.Threading.SendOrPostCallback(this.OnsepararNombresOperationCompleted);
            }
            this.InvokeAsync("separarNombres", new object[] {
                        name}, this.separarNombresOperationCompleted, userState);
        }
        
        private void OnsepararNombresOperationCompleted(object arg) {
            if ((this.separarNombresCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.separarNombresCompleted(this, new separarNombresCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        public new void CancelAsync(object userState) {
            base.CancelAsync(userState);
        }
        
        private bool IsLocalFileSystemWebService(string url) {
            if (((url == null) 
                        || (url == string.Empty))) {
                return false;
            }
            System.Uri wsUri = new System.Uri(url);
            if (((wsUri.Port >= 1024) 
                        && (string.Compare(wsUri.Host, "localHost", System.StringComparison.OrdinalIgnoreCase) == 0))) {
                return true;
            }
            return false;
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.8.4084.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="T1_Redes.alv")]
    public partial class nombresSeparados {
        
        private string nombreField;
        
        private string apellidoPaternoField;
        
        private string apellidoMaternoField;
        
        /// <remarks/>
        public string nombre {
            get {
                return this.nombreField;
            }
            set {
                this.nombreField = value;
            }
        }
        
        /// <remarks/>
        public string apellidoPaterno {
            get {
                return this.apellidoPaternoField;
            }
            set {
                this.apellidoPaternoField = value;
            }
        }
        
        /// <remarks/>
        public string apellidoMaterno {
            get {
                return this.apellidoMaternoField;
            }
            set {
                this.apellidoMaternoField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.8.4084.0")]
    public delegate void validarRutCompletedEventHandler(object sender, validarRutCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.8.4084.0")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class validarRutCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal validarRutCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public string Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((string)(this.results[0]));
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.8.4084.0")]
    public delegate void separarNombresCompletedEventHandler(object sender, separarNombresCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.8.4084.0")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class separarNombresCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal separarNombresCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public nombresSeparados Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((nombresSeparados)(this.results[0]));
            }
        }
    }
}

#pragma warning restore 1591