package com.example.demo.controllers;
import com.example.demo.models.Split;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Split")


public class SplitController {
	//@Autowired
	private Split split1;
	@GetMapping()
	public Split ObtenerSplit(){
		return split1;
	}
	@PostMapping()
	public Split guardarSplit(@RequestBody Split x) {
		
		
		return this.split1 = x;
	}
	
}
