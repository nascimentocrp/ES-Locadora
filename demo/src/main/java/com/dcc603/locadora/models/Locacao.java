package com.dcc603.locadora.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "locacao")
public class Locacao {
    
    @Id
    private int id;

    @OneToOne(fetch = FetchType.EAGER)
    private Filme filme;
    
    @Column(name = "data-locacao")
    private LocalDate dataLocacao;
    
    @Column(name = "titulo")
    private LocalDate dataDevolucao;
    
    @Column(name = "titulo")
    private Boolean isPago;
    
    @Column(name = "titulo")
    private Boolean isEntregue;

    @OneToMany(mappedBy = "listaLocacoes")
    private Cliente cliente;

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Boolean getIsPago() {
        return isPago;
    }

    public void setIsPago(Boolean isPago) {
        this.isPago = isPago;
    }

    public Boolean getIsEntregue() {
        return isEntregue;
    }

    public void setIsEntregue(Boolean isEntregue) {
        this.isEntregue = isEntregue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
