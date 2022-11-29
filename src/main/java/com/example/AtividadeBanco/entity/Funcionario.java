package com.example.AtividadeBanco.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double salario;
    private String depatarmento;

    public Funcionario(Double salario, String depatarmento) {
        this.salario = salario;
        this.depatarmento = depatarmento;
    }

    public Funcionario() {
    }

    public Long getId() {
        return id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDepatarmento() {
        return depatarmento;
    }

    public void setDepatarmento(String depatarmento) {
        this.depatarmento = depatarmento;
    }
}
