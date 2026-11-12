package com.decorator;

public abstract class ItemPedidoDecorator extends ItemPedido{
    protected ItemPedido itemPedido;

    public ItemPedidoDecorator(ItemPedido itemPedido){
        if (itemPedido == null) {
            throw new IllegalArgumentException("O pedido a ser decorado não pode ser nulo.");
        }
        this.itemPedido = itemPedido;
    }

}
