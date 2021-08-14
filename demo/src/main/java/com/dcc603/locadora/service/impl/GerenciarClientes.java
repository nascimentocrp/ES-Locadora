package com.dcc603.locadora.service.impl;

import java.util.List;
import java.util.Optional;

import com.dcc603.locadora.models.Cliente;
import com.dcc603.locadora.repository.ClienteRepository;
import com.dcc603.locadora.service.IGerenciar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GerenciarClientes implements IGerenciar<Cliente>{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public void adicionar(Cliente data) {
        clienteRepository.save(data);     
    }

    @Override
    public void excluir(Cliente data) {
        Optional<Cliente> cliente = clienteRepository.findById(data.getId());
        
        if(cliente.isPresent()) clienteRepository.delete(data);
    }

    @Override
    public void editar(Cliente data) {
        Optional<Cliente> cliente = clienteRepository.findById(data.getId());

        if(cliente.isPresent()) clienteRepository.save(data);
    }

    @Override
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente pesquisar(int id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if(cliente.isPresent()) return cliente.get();
        return null;
    }
}
