package com.everis.academy.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="asignaturas")
public class Asignatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String detalleAsignatura;
	
	
	@Column(updatable=false)
    @CreationTimestamp
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @UpdateTimestamp
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
	public Asignatura(String nombre, String detalleAsignatura) {
		super();
		this.nombre = nombre;
		this.detalleAsignatura = detalleAsignatura;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalleAsignatura() {
		return detalleAsignatura;
	}

	public void setDetalleAsignatura(String detalleAsignatura) {
		this.detalleAsignatura = detalleAsignatura;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
