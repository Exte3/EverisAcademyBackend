package com.everis.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.academy.models.Asignatura;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {

}
