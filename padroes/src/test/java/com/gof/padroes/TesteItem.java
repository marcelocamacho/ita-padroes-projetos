package com.gof.padroes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gof.padroes.nullObject.Item;

public class TesteItem {

    @Test
    public void testSemDesconto(){
        Item i = new Item("tenis", 150.0);
        assertEquals(300.00, i.precoQuantidade(2), 0.001);
        assertEquals("tenis R$150.0", i.toString());
    }
}
