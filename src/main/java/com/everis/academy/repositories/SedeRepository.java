package com.everis.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.academy.models.Sede;

@Repository
public interface SedeRepository  extends JpaRepository<Sede, Long>{

}
