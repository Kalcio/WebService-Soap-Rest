package com.example.demo.services;


import com.example.demo.models.Rut;

import org.springframework.stereotype.Service;

@Service
public class RutService {
	
	public Rut verifyRut(Rut x) {
		
		int rutValue = x.getRut();
		char dv = x.getVerifyCode().charAt(0);
		if(dv == 'k') {
			dv = 'K';
		}
		int m = 0;
		int s = 1;
        for (; rutValue != 0; rutValue /= 10) {
            s = (s + rutValue % 10 * (9 - m++ % 6)) % 11;
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
