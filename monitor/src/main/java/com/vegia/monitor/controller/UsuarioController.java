// UsuarioController.java
package com.vegia.monitor.controller;

import com.vegia.monitor.model.Usuario;
import com.vegia.monitor.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario loginData) {
        return repository.findByCpfAndSenha(loginData.getCpf(), loginData.getSenha())
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(401).build());
    }
}