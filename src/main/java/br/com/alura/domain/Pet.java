package br.com.alura.domain;

public class Pet {

    private Long id;
    private String tipo;
    private String nome;
    private String raca;
    private Integer idade;
    private String cor;
    private Double peso;

    public Pet(){}

    public Pet(String tipo, String nome, String raca, Integer idade, String cor, Double peso) {
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }


    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }
}
