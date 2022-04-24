package com.example.demo.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Split;
import com.example.demo.models.SplitInput;

@Service
public class SplitService {
	
	public Split modificarSplit(SplitInput x) {
		
		Split splitAux = new Split();
		String nombreCompleto = x.getNombreCompleto();
		String[] nombres = nombreCompleto.split(" ");
		List<String> nombresList = Arrays.asList(nombres);
		splitAux.setPaterno(nombresList.get(nombresList.size()-2));
		splitAux.setMaterno(nombresList.get(nombresList.size()-1));
		int fin = nombresList.size()-1;
		nombresList.set(fin, null);
		nombresList.set(fin-1, null);
		splitAux.setNombres(nombresList);
		
		return splitAux;
	}

}

