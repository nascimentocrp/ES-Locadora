package com.dcc603.locadora.service.impl;

import java.util.List;
import java.util.Optional;

import com.dcc603.locadora.models.Filme;
import com.dcc603.locadora.repository.FilmeRepository;
import com.dcc603.locadora.service.IGerenciar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GerenciarFilmeImpl implements IGerenciar<Filme>{
    
    @Autowired
    FilmeRepository filmeRepository;

    public void adicionar(Filme filme){
        filmeRepository.save(filme);
    }
    
    public void excluir(Filme filme){
        filmeRepository.delete(filme);
    }

    public void editar(Filme filme){
        Optional<Filme> filmeEntity = filmeRepository.findById(filme.getId());
        if(filmeEntity.isPresent()) filmeRepository.save(filme);
    }

    public List<Filme> listar(){
        List<Filme> listaFilmes = filmeRepository.findAll();

        return listaFilmes;
    }

    public Filme pesquisar(int id){
        Optional<Filme> filme = filmeRepository.findById(id);
        if(filme.isPresent()) return filme.get();

        return null;
    }

}
