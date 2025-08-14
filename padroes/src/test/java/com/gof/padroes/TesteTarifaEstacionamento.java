package com.gof.padroes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gof.padroes.strategy.CalculoDiaria;
import com.gof.padroes.strategy.CalculoHora;
import com.gof.padroes.strategy.CalculoHoraValorInicial;
import com.gof.padroes.strategy.TarifaEstacionamento;

public class TesteTarifaEstacionamento {
    
    @Test
    public void tarifaFixaPorHora(){
        TarifaEstacionamento t = new TarifaEstacionamento(3, new CalculoHora(4));
        int valor = t.valor();

        assertEquals(12, valor);
    }

    @Test
    public void tarifaComValorInicialDepoisFixaPorHora(){
        TarifaEstacionamento t = new TarifaEstacionamento(5, new CalculoHoraValorInicial(5,3,2));
        int valor = t.valor();

        assertEquals(9, valor);
    }



    @Test
    public void tarifaComValorIniciaDentroDoLimite(){
        TarifaEstacionamento t = new TarifaEstacionamento(2, new CalculoHoraValorInicial(5,3,2));
        int valor = t.valor();

        assertEquals(5, valor);
    }

    @Test
    public void tarifaDiaria(){
        TarifaEstacionamento t = new TarifaEstacionamento(50, new CalculoDiaria(20));
        int valor = t.valor();

        assertEquals(60, valor);
    }

    @Test
    public void tarifaDiariaMenorQueUmDia(){
        TarifaEstacionamento t = new TarifaEstacionamento(8, new CalculoDiaria(20));
        int valor = t.valor();

        assertEquals(20, valor);
    }


}

