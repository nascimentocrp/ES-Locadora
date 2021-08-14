package com.dcc603.locadora.repository;

import com.dcc603.locadora.models.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
    
}
