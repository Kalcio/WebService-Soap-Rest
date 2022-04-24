package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.models.Rut;
import com.example.demo.services.RutService;

@SpringBootTest
class WebServiceRestG51ApplicationTests {

	@Test
	void RutServiceTest() {
		RutService rutService = new RutService();
		Rut rut = new Rut();
		Rut rutAux = new Rut();
		rut.setRut(20107983);
		rutAux = rutService.verifyRut(rut);
		boolean validate = rutAux.getValidate();
		if(validate == true) {
			System.out.println("RutService Esta validado.");
		}
		
	}

}
