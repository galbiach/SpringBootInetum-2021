package com.domain.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/home")
	public String goIndex() {
		return "Index";
	}
	
	@RequestMapping("/")
	public String getPresentacion() {
		return "Presentacion";
	}
	
	@RequestMapping("/listado")
	public String goListado(Model model) {
		List<String> alumnos = Arrays.asList("Juan", "Pedro", "José");
		
		model.addAttribute("titulo", "Listado de alumnos");
		model.addAttribute("profesor", "Gabriel Casas");
		model.addAttribute("alumnos", alumnos);
		
		return "Listado";
	}
}
