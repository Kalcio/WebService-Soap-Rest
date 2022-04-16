package com.example.demo.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Rut;
import com.example.demo.services.RutService;
@RestController
@RequestMapping("/Rut")
public class RutController {
	@Autowired
	RutService RutService;
	
	private Rut rut1;
	@GetMapping()
	public Rut ObtenerRut(){
		return rut1;
	}
	@PostMapping()
	public Rut guardarRut(@RequestBody Rut x) {
		this.RutService.VerifyRut(x);
		return this.rut1 = x;
	}
	
}
