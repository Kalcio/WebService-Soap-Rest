package com.example.demo.models;

public class Rut {

	private long id;
	private int Rut = 0;
	private String VerifyCode = "N";
	private boolean Validate = false;
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

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
