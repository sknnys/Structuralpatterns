package com.decorator;

public abstract class ItemPedidoDecorator extends ItemPedido{
    protected ItemPedido itemPedido;

    public ItemPedidoDecorator(ItemPedido itemPedido){
        this.itemPedido = itemPedido;
    }

    @Override
    public String getDescricao(){
        return itemPedido.getDescricao();
    }


    @Override
    public double getPreco(){
        return itemPedido.getPreco();
    }
}
