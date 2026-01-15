package com.dario.webapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/saluti")
@CrossOrigin()
public class SalutiController {
	
	@GetMapping()
	//@GetMapping("/salutami")
	public String salutami() {
		return "\"Dario\"";
	}
	
	@GetMapping(value = "/{nome}")
	public String salutaQualcuno(@PathVariable String nome) {
		String msg = "<h1>Salutami " + nome + "</h1>";
		return msg;
	}
}
