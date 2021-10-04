package com.everis.academy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.academy.models.Profesor;
import com.everis.academy.services.ProfesorService;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	private ProfesorService profesorService;
	//Api lista todos los profesores api/profesores
	@GetMapping("/profesores")
	public List<Profesor> obtenerProfesores(){
		return profesorService.findAll();
	}
	//Api buscar profesor por su id api/profesores/{id}
	@GetMapping("/profesores/{id}")
	public Profesor obtenerProfesor(@PathVariable("id") Long id) {
		Profesor profesor = profesorService.buscarUsuario(id);
		if(profesor == null) {
			throw new RuntimeException("Producto no encontrado"+ id);
		}
		return profesor;
	}
	
	@CrossOrigin(origins = "http://localhost:4200") //server de Angular Front
	@PostMapping("agregar_profesor")
	public Profesor insertarProducto(@Validated @RequestBody Profesor profesor) { //recibe dato
		System.out.println("intentando insertar producto desde angular");
		//registry.addMapping("/nuevo_producto").allowedOrigins("http://localhost:4200");
	
		profesor.setId(0L);
		profesorService.insertarProfesor(profesor);
	    return profesor;
	}
	
	
	

}
