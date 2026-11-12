package com.decorator;

public abstract class ItemPedidoDecorator extends ItemPedido{
    protected ItemPedido itemPedido;

    public ItemPedidoDecorator(ItemPedido itemPedido){
        this.itemPedido = itemPedido;
    }

}
