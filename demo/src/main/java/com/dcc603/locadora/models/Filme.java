package com.dcc603.locadora.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
@Entity
@Table(name = "filme")
public class Filme {
    
    @Id
    private int id;

    @Column(name = "titulo")
    private String titulo;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "genero")
    private List<Genero> genero;

    @Column(name = "midia")
    private String midia;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "diretor")
    private List<Diretor> diretor;

    @Column(name = "valor-locacao")
    private Double valorLocacao;
    
    @Column(name = "tempo-locacao")
    private int tempoLocacao;

    @OneToOne(mappedBy = "filme")
    private Locacao locacao;

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

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
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

    public List<Genero> getGenero() {
        return genero;
    }

    public void setGenero(List<Genero> genero) {
        this.genero = genero;
    }

    public List<Diretor> getDiretor() {
        return diretor;
    }

    public void setDiretor(List<Diretor> diretor) {
        this.diretor = diretor;
    }
}
