package com.decorator;

public class Hamburguer extends ItemPedido{

    @Override
    public String getDescricao() {
        return "Hamburguer: Preço - R$15 ";
    }
    @Override
    public double getPreco(){
        return 15.00;
    }

}
