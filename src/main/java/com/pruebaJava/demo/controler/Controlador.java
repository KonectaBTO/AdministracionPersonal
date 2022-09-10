package com.pruebaJava.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@GetMapping("")
	public String menu() {
		return "indexPrin";
	}
}
