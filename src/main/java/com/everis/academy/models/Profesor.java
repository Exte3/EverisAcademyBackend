package com.everis.academy.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="profesores")
public class Profesor extends Usuario{
	private String grado_academico;
	private String asignaturas;
	private String disponibilidad;
	private int anos_experiencia;
	private String curriculum;
	private String especialidad;
	
	public String getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(String curriculum) {
		this.curriculum = curriculum;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Column(updatable=false)
    @CreationTimestamp
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date inicio_contrato;

	public Profesor(String grado_academico, String disponibilidad) {
		super();
		this.grado_academico = grado_academico;
		this.disponibilidad = disponibilidad;
	}
	
	public Profesor(String nombre, String email, String password, String passwordconf, String grado_academico) {
		super();
		this.setNombre(nombre);
		this.setEmail(email);
		this.setPassword(password);
		this.setPasswordConfirmation(passwordconf);
		this.grado_academico= grado_academico;
	}
	
	public Profesor() {
		super();
	}

	public String getGrado_academico() {
		return grado_academico;
	}

	public void setGrado_academico(String grado_academico) {
		this.grado_academico = grado_academico;
	}

	public String getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String asignaturas) {
		this.asignaturas = asignaturas;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getAnos_experiencia() {
		return anos_experiencia;
	}

	public void setAnos_experiencia(int anos_experiencia) {
		this.anos_experiencia = anos_experiencia;
	}

	public Date getInicio_contrato() {
		return inicio_contrato;
	}

	public void setInicio_contrato(Date inicio_contrato) {
		this.inicio_contrato = inicio_contrato;
	}
	
	
	
}
