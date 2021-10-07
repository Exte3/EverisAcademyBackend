package com.everis.academy.services;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.academy.models.Administrador;
import com.everis.academy.repositories.AdministradorRepository;

@Service
public class AdministradorService {
	
	@Autowired
	private AdministradorRepository administradorRepository;
	
	
	public List<Administrador> findAll() {
		return administradorRepository.findAll();
	}
	
	public Administrador insertarAdmin(@Valid Administrador admin) {
		return administradorRepository.save(admin);
	}

}