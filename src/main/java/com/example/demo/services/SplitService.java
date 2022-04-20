package com.example.demo.services;

import com.example.demo.models.Split;
import com.example.demo.models.SplitInput;

import java.util.ArrayList;
import java.util.List;
public class SplitService {
	
	public Split TransformInput(SplitInput x) {
		
		 Split y = new Split();
		 String NombreCompleto = x.getNombreCompleto();
		 String[] Nombre = NombreCompleto.split(" ");
		 List<String> AuxList = new ArrayList<String>();
		 int Largo= Nombre.length;
		 for(int i=0;i < Largo; i = i+1) {
		
			 AuxList.add(Nombre[i]);
			
		 }
		 y.setNombres(AuxList);
		 return y;
	}

}
