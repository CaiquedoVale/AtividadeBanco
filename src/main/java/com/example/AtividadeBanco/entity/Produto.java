package com.example.AtividadeBanco.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Double precoIndividual;
    private Double precoTotal;
    private Integer quantidade;

    public Produto(String nome, Double precoIndividual, Double precoTotal, Integer quantidade) {
        this.nome = nome;
        this.precoIndividual = precoIndividual;
        this.precoTotal = precoTotal;
        this.quantidade = quantidade;
    }

    public Produto() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoIndividual() {
        return precoIndividual;
    }

    public void setPrecoIndividual(Double precoIndividual) {
        this.precoIndividual = precoIndividual;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
