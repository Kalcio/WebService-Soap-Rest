package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Split;
import com.example.demo.services.SplitService;

@RestController
@RequestMapping("/Split")
public class SplitController {
	@Autowired
	SplitService SplitService;
	
	@GetMapping()
	public ArrayList<Split> ObtenerSplit(){
		return SplitService.ObtenerSplit();
	}
	@PostMapping()
	public Split guardarSplit(@RequestBody Split x) {
		return this.SplitService.guardarSplit(x);
	}
	
}
