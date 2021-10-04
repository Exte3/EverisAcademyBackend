package com.everis.academy.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.academy.models.Profesor;
import com.everis.academy.repositories.ProfesorRepository;




@Service
public class ProfesorService {
	@Autowired
	private ProfesorRepository profesorRepository;
	
	
	public List<Profesor> findAll() {
		// retorna una lista de usuarios
		return profesorRepository.findAll();
	}
	
	
	public Profesor buscarUsuario(Long id) {

		Optional<Profesor> oUsuario= profesorRepository.findById(id);
		
		if(oUsuario.isPresent()) {
			return oUsuario.get();
		}
		
		return null;
	}
	
	
	public Profesor insertarProfesor(@Valid Profesor profesor) {
		// TODO Auto-generated method stub
		return profesorRepository.save(profesor);
	}
	
}
