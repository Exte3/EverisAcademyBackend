package com.everis.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.academy.models.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}