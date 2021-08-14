package com.dcc603.locadora.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "filme")
public class Filme {
    
    @Id
    private int id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "genero")
    private List<String> genero;//TODO @many to one

    @Column(name = "midia")
    private String midia;

    @Column(name = "diretor")
    private List<String> diretor;//TODO @many to one

    @Column(name = "valor-locacao")
    private Double valorLocacao;
    
    @Column(name = "tempo-locacao")
    private int tempoLocacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getGenero() {
        return genero;
    }

    public void setGenero(List<String> genero) {
        this.genero = genero;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

    public List<String> getDiretor() {
        return diretor;
    }

    public void setDiretor(List<String> diretor) {
        this.diretor = diretor;
    }

    public Double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(Double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public int getTempoLocacao() {
        return tempoLocacao;
    }

    public void setTempoLocacao(int tempoLocacao) {
        this.tempoLocacao = tempoLocacao;
    }
}
