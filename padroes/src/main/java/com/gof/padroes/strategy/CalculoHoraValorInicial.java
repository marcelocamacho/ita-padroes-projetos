package com.gof.padroes.strategy;

public class CalculoHoraValorInicial implements Calculo{

    private int valorInicial; 
    private int limiteHorasInicial;
    private int valorHoraExcedente;
    
    public CalculoHoraValorInicial(int valorInicial, int limiteHorasInicial, int valorHoraExcedente){
        this.valorInicial = valorInicial;
        this.limiteHorasInicial = limiteHorasInicial;
        this.valorHoraExcedente = valorHoraExcedente;
    }

    @Override
    public int calcularTarifa(int qtdHora) {
       int valor = this.valorInicial;
       if(qtdHora>this.limiteHorasInicial){
        valor = valor + (qtdHora - this.limiteHorasInicial)*this.valorHoraExcedente;
       }
       return valor;
       
    }

}
