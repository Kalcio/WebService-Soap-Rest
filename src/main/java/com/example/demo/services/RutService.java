package com.example.demo.services;


import com.example.demo.models.Rut;

import org.springframework.stereotype.Service;

@Service
public class RutService {
	
	public Rut VerifyRut(Rut x) {
		
		int RutValue = x.getRut();
		char dv = x.getVerifyCode().charAt(0);
		
		int m = 0, s = 1;
        for (; RutValue != 0; RutValue /= 10) {
            s = (s + RutValue % 10 * (9 - m++ % 6)) % 11;
        }
        if( dv == (char) (s != 0 ? s + 47 : 75)) {
        	x.setValidate(true);
        	return x;
        }
        else{
        	return x;
        }
	}
}
