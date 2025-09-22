package com.LojaRoupas.produtos.models;

public class Produto {

    private int id;


    private String nome;
    private int tamanho;
    private String cor;
    private int qtd;
    private float preco;

    public Produto(String nome, int tamanho, String cor, int qtd, float preco) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.qtd = qtd;
        this.preco = preco;
    } // Construtor do produto parametrizado, eu acho ...

    

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

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    


    
}