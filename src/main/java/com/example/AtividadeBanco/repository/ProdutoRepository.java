package com.example.AtividadeBanco.repository;

import com.example.AtividadeBanco.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
