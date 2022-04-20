package com.example.demo.controllers;
import com.example.demo.models.Split;
import com.example.demo.models.SplitInput;
import com.example.demo.services.SplitService;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Split")


public class SplitController {
	//@Autowired
	private Split split1 = new Split();
	SplitService SplitService;
	@GetMapping()
	public Split ObtenerSplit(){
		return split1;
	}
	@PostMapping()
	public Split guardarSplit(@RequestBody SplitInput x) {
		
		//return this.split1 = SplitService.TransformInput(x);
		String NombreCompleto = x.getNombreCompleto();
		String[] Nombres = NombreCompleto.split(" ");
		List<String> NombresList = Arrays.asList(Nombres);
		split1.setPaterno(NombresList.get(NombresList.size()-2));
		split1.setMaterno(NombresList.get(NombresList.size()-1));
		int fin = NombresList.size()-1;
		NombresList.set(fin, null);
		NombresList.set(fin-1, null);
		
		
		split1.setNombres(NombresList);
		return split1;
	}
	
}
