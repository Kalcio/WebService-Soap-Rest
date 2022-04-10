package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.Rut;
import com.example.demo.repositories.RutRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RutService {
	@Autowired
	RutRepository RutRepository;
	
	public ArrayList<Rut> ObtenerRut(){
		return (ArrayList<Rut>)RutRepository.findAll();
	}
	
	public Rut guardarRut (Rut x){
		return RutRepository.save(x);
	}
	public Rut VerifyRut(Rut x) {
		
		int RutValue = x.getRut();
		char dv = x.getVerifyCode().charAt(0);
		
		int m = 0, s = 1;
        for (; RutValue != 0; RutValue /= 10) {
            s = (s + RutValue % 10 * (9 - m++ % 6)) % 11;
        }
        if( dv == (char) (s != 0 ? s + 47 : 75)) {
        	x.setValidate(true);
        	return RutRepository.save(x);
        }
        else{
        	return x;
        }
	}
}
