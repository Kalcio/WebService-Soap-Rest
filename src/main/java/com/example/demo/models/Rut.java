package com.example.demo.models;

public class Rut {


	private int RutValue = 0;
	private String VerifyCode = "N";
	private boolean Validate = false;
	

	public int getRut() {
		return RutValue;
	}
	public void setRut(int Rut) {
		this.RutValue = Rut;
	}
	public String getVerifyCode() {
		return VerifyCode;
	}
	
	public void setVerifyCode(String VerifyCode) {
		this.VerifyCode = VerifyCode;
	}
	public boolean getValidate() {
		return Validate;
	}
	public void setValidate(boolean Validate) {
		this.Validate = Validate;
	}
}
