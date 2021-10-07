package com.everis.academy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.academy.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
}
