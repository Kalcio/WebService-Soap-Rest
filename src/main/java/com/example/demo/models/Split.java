package com.example.demo.models;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="SplitTable")
public class Split {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(unique = true,nullable = false)
	private long id;
	
	@ElementCollection // 1
    @CollectionTable(name = "NombresTable", joinColumns = @JoinColumn(name = "id")) // 2
    @Column(name = "Nombres") // 3
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
