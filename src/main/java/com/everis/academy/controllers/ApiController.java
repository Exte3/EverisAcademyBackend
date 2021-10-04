package com.everis.academy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.academy.models.Profesor;
import com.everis.academy.services.ProfesorService;
@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	private ProfesorService profesorService;
	

	
	
	
	

}
