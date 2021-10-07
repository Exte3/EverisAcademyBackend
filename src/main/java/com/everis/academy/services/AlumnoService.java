package com.everis.academy.services;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.academy.models.Alumno;
import com.everis.academy.repositories.AlumnoRepository;

@Service
public class AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	public List<Alumno> findAll() {
		return alumnoRepository.findAll();
	}
	
	public Alumno insertarAlumno(@Valid Alumno alumno) {
		return alumnoRepository.save(alumno);
	}
}