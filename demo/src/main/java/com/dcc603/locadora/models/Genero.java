package com.dcc603.locadora.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero {
    
    @Id
    private int id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "genero")
    private Filme filme;
}
