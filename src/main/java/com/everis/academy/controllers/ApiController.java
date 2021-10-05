package com.everis.academy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	//Api lista todos los profesores http://localhost:8080/api/profesores
	@GetMapping("/profesores")
	public List<Profesor> obtenerProfesores(){
		System.out.println("lista profesores");
		return profesorService.findAll();
	}
	
	//Api buscar profesor por su id http://localhost:8080/api/profesores/{id}
	@GetMapping("/profesores/{id}")
	public Profesor obtenerProfesor(@PathVariable("id") Long id) {
		Profesor profesor = profesorService.buscarProfesor(id);
		if(profesor == null) {
			throw new RuntimeException("Producto no encontrado"+ id);
		}
		return profesor;
	}
	
	
	//Api buscar profesor por su id http://localhost:8080/api/eliminar_profesor/{id}
	@CrossOrigin(origins = "http://localhost:4200") //server de Angular Front
	@DeleteMapping("eliminar_profesor/{id}")
	public String eliminarProfesor(@PathVariable("id") Long id) {
		System.out.println("pasa a eliminar");
		Profesor profesor = profesorService.buscarProfesor(id);
		if(profesor == null) {
			throw new RuntimeException("Profesor no encontrado"+ id);
		}
		profesorService.eliminarProfesor(id);
		return "Producto eliminado" + id;
		
	}
	
	
	//Api agregar profesor  http://localhost:8080/api/agregar_profesor
	@CrossOrigin(origins = "http://localhost:4200") //server de Angular Front
	@PostMapping("agregar_profesor")
	public Profesor insertarProfesor(@Validated @RequestBody Profesor profesor) { //recibe dato
		System.out.println("intentando insertar producto desde angular");
		profesor.setId(0L);
		profesorService.insertarProfesor(profesor);
	    return profesor;
	}
	
	
	//Api modificar profesor http://localhost:8080/api/actualizar_profesor
	@CrossOrigin(origins = "http://localhost:4200")//server de Angular Front
	@PutMapping("actualizar_profesor") 
	public Profesor actualizarProfesor(@Validated @RequestBody Profesor profesor) { //recibe dato
		profesorService.insertarProfesor(profesor);
	    return profesor;
	}
	
	

}
