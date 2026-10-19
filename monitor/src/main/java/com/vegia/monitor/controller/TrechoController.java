package com.vegia.monitor.controller;

import com.vegia.monitor.model.Trecho;
import com.vegia.monitor.repository.TrechoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trechos")
public class TrechoController {

    private final TrechoRepository repository;

    public TrechoController(TrechoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Trecho>> listarTodos() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/lote")
    public ResponseEntity<List<Trecho>> salvarEmLote(@RequestBody List<Trecho> trechos) {
        List<Trecho> salvos = repository.saveAll(trechos);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvos);
    }
}