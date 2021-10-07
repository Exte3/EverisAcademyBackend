package com.everis.academy.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
    @GeneratedValue
    private Long id;
	private String nombre;
	private String apellido;
	private int edad;
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	private String fnacimiento;
	private String email;
	private String rut;
	private String direccion;
	private String telefono;
	private String sexo;
	private String password;
	@Transient
	private String passwordConfirmation;
    
    @Column(updatable=false)
    @CreationTimestamp
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    


	@UpdateTimestamp
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String email, String password, String passwordConfirmation) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFnacimiento() {
		return fnacimiento;
	}

	public void setFnacimiento(String nacimiento) {
		this.fnacimiento = nacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
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

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
