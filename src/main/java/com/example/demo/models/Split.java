package com.example.demo.models;

import java.util.List;

public class Split {

	private long id;
	
    private List<String> Nombres;
	private String Paterno;
	private String Materno;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public List<String> getNombres() {
		return Nombres;
	}
	
	public void setNombres(List<String> nombres) {
		this.Nombres = nombres;
	}
	
	public String getPaterno() {
		return Paterno;
	}
	
	public void setPaterno(String paterno) {
		this.Paterno = paterno;
	}
	
	public String getMaterno() {
		return Materno;
	}
	
	public void setMaterno(String materno) {
		this.Materno = materno;
	}
	
}
