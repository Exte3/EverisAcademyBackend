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
	
	
	public Profesor buscarProfesor(Long id) {

		Optional<Profesor> oProfesor= profesorRepository.findById(id);
		
		if(oProfesor.isPresent()) {
			return oProfesor.get();
		}
		
		return null;
	}
	
	
	public Profesor insertarProfesor(@Valid Profesor profesor) {
		//validacion datos profesor	
		return profesorRepository.save(profesor);
	}


	public void eliminarProfesor(Long id) {
		profesorRepository.deleteById(id);
		
	}
	
}
