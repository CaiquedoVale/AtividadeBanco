package com.example.AtividadeBanco.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Usuario
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String dataNasc;
    private String email;
    private String password;
    private String cpf;
    private String rg;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Funcionario> funcionarios;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Cliente> clientes;

    public Usuario(String nome, String dataNasc, String email, String password, String cpf, String rg, List<Funcionario> funcionarios, List<Cliente> clientes) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.rg = rg;
        this.funcionarios = funcionarios;
        this.clientes = clientes;
    }

    public Usuario() {
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
