package com.everis.academy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.everis.academy.services.AsignaturaService;

@Controller
public class AsignaturaController {

	@Autowired
	private AsignaturaService asignaturaService;
	
}
