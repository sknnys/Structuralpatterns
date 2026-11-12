package com.decorator;

public class NegritoDecorator extends MensagemDecorator {

    public NegritoDecorator(Elemento elemento){
        super(elemento);
    }

    @Override
    public String imprimeTexto(){
        return "*"+elemento.imprimeTexto()+"*";
    }

}
