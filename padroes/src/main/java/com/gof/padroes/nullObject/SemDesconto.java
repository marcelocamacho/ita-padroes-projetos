package com.gof.padroes.nullObject;

public class SemDesconto implements Desconto{

    @Override
    public double darDesconto(double valorOriginal) {
        return valorOriginal;
    }

}
