package com.LojaRoupas.produtos.models;

import java.util.List;

public class Cliente{

    private int id;
    private String nome;
    private int telefone;
    private String email;
    private boolean aceitaPromocoes;
    private int pontosFidelidade;
    private List<Venda> historicoCompras;


    public Cliente(int id, String nome, int telefone, String email, boolean aceitaPromocoes, int pontosFidelidade,
            List<Venda> historicoCompras) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.aceitaPromocoes = aceitaPromocoes;
        this.pontosFidelidade = pontosFidelidade;
        this.historicoCompras = historicoCompras;
    }

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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAceitaPromocoes() {
        return aceitaPromocoes;
    }

    public void setAceitaPromocoes(boolean aceitaPromocoes) {
        this.aceitaPromocoes = aceitaPromocoes;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }

    public List<Venda> getHistoricoCompras() {
        return historicoCompras;
    }

    public void setHistoricoCompras(List<Venda> historicoCompras) {
        this.historicoCompras = historicoCompras;
    }

    
    
}
