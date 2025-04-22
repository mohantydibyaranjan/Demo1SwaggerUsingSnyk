package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@Autowired
	private PersonController controller;
	@GetMapping("/roshan")
	public String getMsg() {
		return controller.getMsg();
		
	}

}
