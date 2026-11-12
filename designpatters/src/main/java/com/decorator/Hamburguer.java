package com.decorator;

public class Hamburguer extends ItemPedido{

    public String getDescricao() {
        return "Hamburguer: Preço - R$15 ";
    }
    public double getPreco(){
        return 15.00;
    }

}
