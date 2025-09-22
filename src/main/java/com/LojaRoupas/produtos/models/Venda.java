package com.LojaRoupas.produtos.models;

import java.time.LocalDate;
import java.util.List;

public class Venda {
    
    private int id;
    private LocalDate data;
    private FormaPagamento formaPagamento;
    private List<ItemVenda> produtos;
    private double valorTotal;
    private Atendente atendente;


    public Venda(int id, LocalDate data, FormaPagamento formaPagamento, List<ItemVenda> produtos, double valorTotal,
            Atendente atendente) {
        this.id = id;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
        this.atendente = atendente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public List<ItemVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ItemVenda> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    

}
