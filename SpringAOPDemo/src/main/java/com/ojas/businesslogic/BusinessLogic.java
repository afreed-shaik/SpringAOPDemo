package com.ojas.businesslogic;

import org.springframework.stereotype.Component;

@Component
public class BusinessLogic {
	
	public void saveEmployee() {
		System.out.println("Employee save");
		//Arithmetic Exception
		int num = 10 / 0;
	}
}
