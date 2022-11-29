package com.example.AtividadeBanco.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cliente
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idPedido;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Produto> prod;

    public Cliente(List<Produto> prod) {
        this.prod = prod;
    }

    public Cliente() {
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public List<Produto> getProd() {
        return prod;
    }

    public void setProd(List<Produto> prod) {
        this.prod = prod;
    }
}
