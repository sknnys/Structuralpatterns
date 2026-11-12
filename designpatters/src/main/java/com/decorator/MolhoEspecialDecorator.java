package com.decorator;

public class MolhoEspecialDecorator extends ItemPedidoDecorator {


    public MolhoEspecialDecorator(ItemPedido itemPedido) {
        super(itemPedido);
    }

    @Override
    public String getDescricao(){
        return itemPedido.getDescricao()+ "\nCom adicional de molho - R$10";
    }


    @Override
    public double getPreco(){
        return itemPedido.getPreco() + 10.00;
    }
}
