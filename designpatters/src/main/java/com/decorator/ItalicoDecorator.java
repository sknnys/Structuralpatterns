package com.decorator;

public class ItalicoDecorator extends MensagemDecorator {

    public ItalicoDecorator(Elemento elemento){
        super(elemento);
    }

    @Override
    public String imprimeTexto(){
        return "_"+elemento.imprimeTexto()+"_";
    }
}
