package com.dcc603.locadora.service.impl;

import java.util.List;
import java.util.Optional;

import com.dcc603.locadora.models.Funcionario;
import com.dcc603.locadora.repository.FuncionarioRepository;
import com.dcc603.locadora.service.IGerenciar;

import org.springframework.beans.factory.annotation.Autowired;

public class GerenciarPessoal implements IGerenciar<Funcionario>{

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Override
    public void adicionar(Funcionario data) {
        funcionarioRepository.save(data);
    }

    @Override
    public void excluir(Funcionario data) {
        Optional<Funcionario> funcionario = funcionarioRepository.findById(data.getId());

        if(funcionario.isPresent()) funcionarioRepository.delete(funcionario.get());      
    }

    @Override
    public void editar(Funcionario data) {
        Optional<Funcionario> funcionario = funcionarioRepository.findById(data.getId());
        if(funcionario.isPresent()) funcionarioRepository.save(data);
    }

    @Override
    public List<Funcionario> listar() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario pesquisar(int id) {
        Optional<Funcionario> funcionario = funcionarioRepository.findById(id);
       
        if(funcionario.isPresent()) return funcionario.get();

        return null;
    }
    
}
