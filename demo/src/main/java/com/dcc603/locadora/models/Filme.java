package com.dcc603.locadora.models;

import java.util.List;

public class Filme {
    
    private int id;

    private String titulo;

    private List<String> genero;

    private String midia;

    private List<String> diretor;

    private Double valorLocacao;
    
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
