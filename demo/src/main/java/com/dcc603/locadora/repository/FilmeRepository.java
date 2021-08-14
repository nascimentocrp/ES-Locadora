package com.dcc603.locadora.repository;

import com.dcc603.locadora.models.Filme;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Integer>{
    
}
