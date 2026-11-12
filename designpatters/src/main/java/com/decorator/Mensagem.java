package com.decorator;

public class Mensagem extends Elemento{
    public Mensagem(String texto){
        this.texto = texto;
    }


    public String imprimeTexto(){
        return texto;

    }
}
