package com.decorator;

public abstract class ItemPedido {
    protected String texto;
    protected double preco;

    public abstract String getDescricao();
    public abstract double getPreco();

}
