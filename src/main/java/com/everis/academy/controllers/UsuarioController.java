package com.everis.academy.controllers;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.everis.academy.services.UsuarioService;




@Controller
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
		
}
