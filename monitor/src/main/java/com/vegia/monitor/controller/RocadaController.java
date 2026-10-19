// RocadaController.java
package com.vegia.monitor.controller;

import com.vegia.monitor.model.Rocada;
import com.vegia.monitor.repository.RocadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rocadas")
@CrossOrigin(origins = "*")
public class RocadaController {

    @Autowired
    private RocadaRepository repository;

    @GetMapping
    public List<Rocada> listar(@RequestParam(required = false) String equipe) {
        if (equipe != null && !equipe.trim().isEmpty()) {
            return repository.findByEquipe(equipe);
        }
        return repository.findAll();
    }
}