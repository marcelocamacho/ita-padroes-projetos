package com.gof.padroes.nullObject;

public class Item {
    private String nome;
    private double valor;
    private Desconto desconto = new SemDesconto();

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
        return nome + " R$" + desconto.darDesconto(valor);
    }  

    public double precoQuantidade(int qtd){
        return desconto.darDesconto(valor) * qtd;
     
    }
}
