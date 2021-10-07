package com.everis.academy.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.academy.models.Asignatura;
import com.everis.academy.repositories.AsignaturaRepository;

@Service
public class AsignaturaService {

	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	public List<Asignatura> findAll() {
		return asignaturaRepository.findAll();
	}
	
	public Asignatura insertarAsignatura(@Valid Asignatura asignatura) {
		return asignaturaRepository.save(asignatura);
	}
}