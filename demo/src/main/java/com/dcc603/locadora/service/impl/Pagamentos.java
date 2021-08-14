package com.dcc603.locadora.service.impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import com.dcc603.locadora.models.Cliente;
import com.dcc603.locadora.models.Filme;
import com.dcc603.locadora.models.Locacao;

import org.springframework.beans.factory.annotation.Autowired;


public class Pagamentos extends Cliente{
    
    private final static int DIASDELOCACAO = 7;

    @Autowired
    GerenciarClientes genrenciarClientes;

    public Double calcularDivida(Cliente cliente){
        List<Locacao> listaLocacoes = cliente.getHistorico();
        Double dividaTotal = 0.00;

        for(Locacao locacao : listaLocacoes){
            if(!locacao.getIsPago()){
                Long diasDeLocacao = locacao.getDataDevolucao().until(locacao.getDataDevolucao(), ChronoUnit.DAYS);
                Long diasDeAtraso = locacao.getDataDevolucao().until(LocalDate.now(), ChronoUnit.DAYS);
                Double dividaPorFilme = diasDeLocacao * locacao.getFilme().getValorLocacao() + 
                                                            diasDeAtraso * locacao.getFilme().getValorLocacao();
                dividaTotal += dividaPorFilme;
            }
        }
        return dividaTotal;
    }

    public void pagarLocacao(Cliente cliente){
        List<Locacao> listaLocacoes = cliente.getHistorico();

        listaLocacoes.forEach(locacao -> locacao.setIsPago(true));

        genrenciarClientes.editar(cliente);
    }

    public void criarLocacao(Cliente cliente, Filme filme){
        Locacao locacao = new Locacao();
        locacao.setCliente(cliente);
        locacao.setDataLocacao(LocalDate.now());
        locacao.setFilme(filme);
        locacao.setDataDevolucao(LocalDate.now().plusDays(DIASDELOCACAO));
        locacao.setIsEntregue(false);
        locacao.setIsPago(false);

        cliente.getHistorico().add(locacao);

        genrenciarClientes.editar(cliente);
    }
}
