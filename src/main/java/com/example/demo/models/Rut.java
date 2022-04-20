package com.example.demo.models;

public class Rut {


	private int Rut = 0;
	private String VerifyCode = "N";
	private boolean Validate = false;
	

	public int getRut() {
		return Rut;
	}
	public void setRut(int Rut) {
		this.Rut = Rut;
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
