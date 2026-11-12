package com.decorator;

public class Pizza extends ItemPedido{

    @Override
    public String getDescricao(){
        return "PIZZA: Preço - R$ 70 ";
    }


    @Override
    public double getPreco(){
        return 70.00;
    }
}
