package com.example.demo.models;

public class Rut {


	private int rutValue = 0;
	private String verifyCode = "N";
	private boolean validate = false;
	

	public int getRut() {
		return rutValue;
	}
	public void setRut(int rut) {
		this.rutValue = rut;
	}
	public String getVerifyCode() {
		return verifyCode;
	}
	
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	public boolean getValidate() {
		return validate;
	}
	public void setValidate(boolean validate) {
		this.validate = validate;
	}
}
