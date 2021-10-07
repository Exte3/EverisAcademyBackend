package com.everis.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.academy.models.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

}