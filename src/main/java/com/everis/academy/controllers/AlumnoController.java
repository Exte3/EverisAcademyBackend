package com.everis.academy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.everis.academy.services.AlumnoService;

@Controller
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;
}
