package com.everis.academy.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
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
	
	public Profesor insertarProfesorpass(@Valid Profesor profesor) {
		String hashed = BCrypt.hashpw(profesor.getPassword(), BCrypt.gensalt());
		profesor.setPassword(hashed);
		return profesorRepository.save(profesor);
	}
	public boolean validarProfesor(String email, String password) {
		System.out.println(email);
		Profesor profesor = profesorRepository.findByEmail(email);
		if(profesor == null) {
			System.out.println("El profesor es null");
			return false;
		}else {
			if (BCrypt.checkpw(password, profesor.getPassword())) {
				System.out.println("Password iguales");
				return true;
			}else {
				System.out.println("Password distintos");
				return false;
			}
		}
		
	}

	public void eliminarProfesor(Long id) {
		profesorRepository.deleteById(id);
		
	}


	public Profesor findByEmail(String email) {
		// TODO Auto-generated method stub
		return profesorRepository.findByEmail(email);
	}
	
}
