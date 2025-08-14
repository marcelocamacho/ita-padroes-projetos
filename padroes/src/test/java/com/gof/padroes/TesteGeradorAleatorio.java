package com.gof.padroes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gof.padroes.staticFactoryMethod.GeradorIntAleatorio;


public class TesteGeradorAleatorio {
    
    @Test
    public void geraPassandoMinMax(){
        int min = 20;
        int max = 60;
        GeradorIntAleatorio t = GeradorIntAleatorio.entre(min, max);
        assertTrue(Integer.class.isInstance(t.getRandom()));
        System.out.println("Aleatorio = "+t.getRandom());
        assertTrue("Erro, o aleatório é maior que o maximo", max >= t.getRandom());
        assertTrue("Erro, o aleatório é menor que o minimo", min <= t.getRandom() );
    }

    @Test
    public void geraPassandoMin(){
        int min = 20;
        int max = Integer.MAX_VALUE;
        GeradorIntAleatorio t = GeradorIntAleatorio.maiorQue(min);
        assertTrue(Integer.class.isInstance(t.getRandom()));
        System.out.println("Aleatorio = "+t.getRandom());
        assertTrue("Erro, o aleatório é maior que o maximo", max >= t.getRandom());
        assertTrue("Erro, o aleatório é menor que o minimo", min <= t.getRandom() );
    }

    @Test
    public void geraPassandoMax(){
        int min = Integer.MIN_VALUE;
        int max = 60;
        GeradorIntAleatorio t = GeradorIntAleatorio.menorQue(max);
        assertTrue(Integer.class.isInstance(t.getRandom()));
        System.out.println("Aleatorio = "+t.getRandom());
        assertTrue("Erro, o aleatório é maior que o maximo", max >= t.getRandom());
        assertTrue("Erro, o aleatório é menor que o minimo", min <= t.getRandom() );
    }
}

