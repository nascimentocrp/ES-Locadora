package com.dcc603.locadora.controllers;

import com.dcc603.locadora.models.Cliente;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("locadora/")
public class ClienteController {
    

    @GetMapping("clientes/")
    public ResponseEntity<String> cadastraCliente(String nome){
        Cliente cliente = new Cliente();
        
        cliente.setNome(nome);

        return new ResponseEntity<String>(HttpStatus.OK);
    } 
}
