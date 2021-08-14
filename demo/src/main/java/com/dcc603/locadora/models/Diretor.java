package com.dcc603.locadora.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "diretor")
public class Diretor {
    
    @Id
    private int id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "diretor")
    private Filme filme;
}
