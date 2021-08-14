package com.dcc603.locadora.java.com.dcc603.locadora.service;

import java.util.List;

public interface IGerenciar<T> {
    
    void adicionar(T data);
    
    void excluir(T data);

    void editar(T data);

    List<T> listar();

    T pesquisar(int id);
}
