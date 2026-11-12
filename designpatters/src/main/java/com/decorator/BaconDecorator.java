package com.decorator;

public class BaconDecorator extends ItemPedidoDecorator {

    public BaconDecorator(ItemPedido itemPedido){
        super(itemPedido);
    }

    @Override
    public String getDescricao(){
        return itemPedido.getDescricao()+ "\nCom adicional de Bacon - R$5";
    }


    @Override
    public double getPreco(){
        return itemPedido.getPreco() + 5.00;
    }

}
