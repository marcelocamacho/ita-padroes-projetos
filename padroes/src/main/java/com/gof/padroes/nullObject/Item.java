package com.gof.padroes.nullObject;

public class Item {
    private String nome;
    private double valor;
    private Desconto desconto;

    public Item(String nome, double valor, Desconto desc){
        super();
        this.nome = nome;
        this.valor = valor;
        this.desconto = desc;
    }

    public Item(String nome, double valor){
        super();
        this.nome = nome;
        this.valor = valor;
    }

    public String toString(){
        if(desconto != null)
            return nome + " R$" + desconto.darDesconto(valor);
        else    
            return nome + " R$" + valor;
    }

    public double precoQuantidade(int qtd){
        if(desconto != null)
            return desconto.darDesconto(valor) * qtd;
        else
            return valor * qtd;
    }
}
