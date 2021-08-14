package com.dcc603.locadora.models;

import java.time.LocalDate;

public class Locacao {
    
    private int idFilme;
    
    private LocalDate dataLocacao;
    
    private LocalDate dataDevolucao;
    
    private Boolean isPago;
    
    private Boolean isEntregue;
    
    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

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

}
