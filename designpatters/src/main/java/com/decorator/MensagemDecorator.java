package com.decorator;

public abstract class MensagemDecorator extends Elemento{
    protected Elemento elemento;

    public MensagemDecorator(Elemento elemento){
        this.elemento = elemento;
    }

    @Override
    public String imprimeTexto(){
        return elemento.imprimeTexto();
    }

}
