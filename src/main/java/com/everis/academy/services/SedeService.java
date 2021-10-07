package com.everis.academy.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.academy.models.Sede;
import com.everis.academy.repositories.SedeRepository;

@Service
public class SedeService {

	@Autowired
	private SedeRepository sedeRepository;
	
	public List<Sede> findAll() {
		return sedeRepository.findAll();
	}
	
	public Sede insertarSede(@Valid Sede sede) {
		return sedeRepository.save(sede);
	}
}