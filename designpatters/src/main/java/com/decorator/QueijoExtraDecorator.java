package com.decorator;

public final class QueijoExtraDecorator extends ItemPedidoDecorator{
    public QueijoExtraDecorator(ItemPedido itemPedido){
        super(itemPedido);
    }

    @Override
    public String getDescricao(){
        return itemPedido.getDescricao()+"\nCom adicional de queijo - R$7";
    }
    @Override
    public double getPreco(){
        return itemPedido.getPreco()+ 7.00;
    }

}
