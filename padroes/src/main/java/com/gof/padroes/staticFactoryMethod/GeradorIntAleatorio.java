package com.gof.padroes.staticFactoryMethod;

public class GeradorIntAleatorio {

    private int MAX;
    private int MIN;
    private int radomNum;


    private GeradorIntAleatorio(int min, int max){
        this.MIN = Math.min(min,max);
        this.MAX = Math.max(min,max);
        this.radomNum = (int) (Math.random()*( (double) this.MAX- (double) this.MIN)+ (double) this.MIN);
    }

    public static GeradorIntAleatorio entre(int min, int max){
        return new GeradorIntAleatorio(min, max);
    }

    public static GeradorIntAleatorio maiorQue(int min){
        return new GeradorIntAleatorio(min, Integer.MAX_VALUE);
    }

    public static GeradorIntAleatorio menorQue(int max){
        return new GeradorIntAleatorio(Integer.MIN_VALUE, max);
    }
    public int getRandom(){
        return this.radomNum;
    }
}
