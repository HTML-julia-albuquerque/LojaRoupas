package com.LojaRoupas.produtos.models;

public class ItemVenda {

    private Produto Produto;
    private int quantidade;
    private double precoUnitario;

    
    
    public ItemVenda(com.LojaRoupas.produtos.models.Produto produto, int quantidade, double precoUnitario) {
        Produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public Produto getProduto() {
        return Produto;
    }

    public void setProduto(Produto produto) {
        Produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    
}
