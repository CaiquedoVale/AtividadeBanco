package com.example.AtividadeBanco.controller;


import com.example.AtividadeBanco.entity.Usuario;
import com.example.AtividadeBanco.repository.ClienteRepository;
import com.example.AtividadeBanco.repository.FuncionarioRepository;
import com.example.AtividadeBanco.repository.ProdutoRepository;
import com.example.AtividadeBanco.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value = "/usuario/v1/")
public class Controller
{
    @Autowired
    private UsuarioRepository usuarioR;
    @Autowired
    private ClienteRepository clienteR;
    @Autowired
    private ProdutoRepository produtoR;
    @Autowired
    private FuncionarioRepository funcionarioR;

    @PostMapping
    @ResponseBody
    public Usuario create(@RequestBody Usuario user)
    {
        Usuario usuarioSalvo = usuarioR.save(user);
        return usuarioSalvo;
    }

    @GetMapping("{id}")
    @ResponseBody
    public Optional<Usuario> getUsuarioById(@PathVariable Long id){
        Optional<Usuario> usuarioReturned = usuarioR.findById(id);
        return usuarioReturned;
    }

}