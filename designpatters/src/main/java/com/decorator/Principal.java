package com.decorator;

public class Principal {
    public static void main(String[] args) {
        ItemPedido xtudo = new Hamburguer();
        ItemPedido pizza = new Pizza();

        ItemPedidoDecorator baconzinho = new BaconDecorator(xtudo);
        ItemPedidoDecorator molhinho = new MolhoEspecialDecorator(pizza);
        ItemPedidoDecorator queijinho = new QueijoExtraDecorator(molhinho);

        System.out.println("\n");
        System.out.println("PEDIDO 1:");
        System.out.println(queijinho.getDescricao());
        System.out.println("TOTAL DO PEDIDO "+queijinho.getPreco());

        System.out.println("------------------------------");

        System.out.println("PEDIDO 2:");
        System.out.println(baconzinho.getDescricao());
        System.out.println("TOTAL DO PEDIDO "+baconzinho.getPreco());
    }
}
