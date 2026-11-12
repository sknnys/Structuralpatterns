package com.decorator;

public class Principal {
    public static void main(String[] args) {
        Elemento mensagem = new Mensagem("Olá");
        MensagemDecorator negrito = new NegritoDecorator(mensagem);
        MensagemDecorator italico = new ItalicoDecorator(negrito);


        System.out.println(italico.imprimeTexto());

    }
}