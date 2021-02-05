package com.springboot.horarioInterceptor.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping({"/", "/index"})
	public String index(Model model) {
		
		model.addAttribute("titulo", "Bienvenido al horario de atencion de clientes");
		return "index";
	}
	
	@GetMapping("/cerrado")
	public String cerrado(Model model) {
		
		StringBuilder mensaje = new StringBuilder("Cerrado, por favor visitenos desde las");
		mensaje.append("apertura");
		mensaje.append(" y las ");
		mensaje.append("cierre");
		mensaje.append(" hrs. Gracias. ");
		
		model.addAttribute("titulo", "fuera del servicio de atencion");
		model.addAttribute("mensaje", mensaje);
		
		return "cerrado";
	}
}
