package com.everis.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.academy.models.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long>{

}
