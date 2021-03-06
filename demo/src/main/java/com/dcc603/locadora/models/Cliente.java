package com.dcc603.locadora.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    
    @Id
    private int id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "historico")
    private List<Locacao> historico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Locacao> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Locacao> historico) {
        this.historico = historico;
    }

}
