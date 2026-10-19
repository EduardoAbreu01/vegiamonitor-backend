// TrechoController.java
package com.vegia.monitor.controller;

import com.vegia.monitor.model.Trecho;
import com.vegia.monitor.repository.TrechoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/trechos", "/rodovias"})
@CrossOrigin(origins = "*")
public class TrechoController {

    @Autowired
    private TrechoRepository repository;

    @GetMapping
    public List<Trecho> listarTrechos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Trecho buscarPorId(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }
}