package com.dcc603.locadora.repository;

import com.dcc603.locadora.models.Locacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacaoRepository extends JpaRepository<Locacao, Integer>{
    
}
