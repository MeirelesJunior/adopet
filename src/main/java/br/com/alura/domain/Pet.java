package br.com.alura.domain;

public class Pet {

    private String tipo;
    private String nome;
    private String raca;
    private Integer idade;
    private String cor;
    private Double peso;

    public Pet(String tipo, String nome, String raca, Integer idade, String cor, Double peso) {
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }
}
