package com.example.AtividadeBanco.repository;

import com.example.AtividadeBanco.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
