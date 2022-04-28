package com.example.demo.controllers;
import com.example.demo.models.Split;
import com.example.demo.models.SplitInput;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.SplitService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/Split")


public class SplitController {
	@Autowired
	SplitService splitService;
	private Split split1 = new Split();
	
	
	@GetMapping()
	public Split obtenerSplit(){
		return split1;
	}
	@PostMapping()
	public Split guardarSplit(@RequestBody SplitInput x) {
		
		split1 = splitService.modificarSplit(x);
		
		return split1;
	}
	
}
