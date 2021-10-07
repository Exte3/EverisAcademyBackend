package com.everis.academy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.everis.academy.services.SedeService;

@Controller
public class SedeController {

	@Autowired
	private SedeService sedeService;
	
}
