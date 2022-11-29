package com.example.AtividadeBanco.repository;

import com.example.AtividadeBanco.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
