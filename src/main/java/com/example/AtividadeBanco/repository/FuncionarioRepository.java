package com.example.AtividadeBanco.repository;

import com.example.AtividadeBanco.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
