package com.vegia.monitor.controller;

import com.vegia.monitor.model.Rodovia;
import com.vegia.monitor.repository.RodoviaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rodovias")
public class RodoviaController {

    private final RodoviaRepository repository;

    public RodoviaController(RodoviaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Rodovia>> listarTodas() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rodovia> buscarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}