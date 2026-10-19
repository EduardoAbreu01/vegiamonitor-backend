package com.vegia.monitor.controller;

import com.vegia.monitor.model.Rocada;
import com.vegia.monitor.model.StatusRocada;
import com.vegia.monitor.service.RocadaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/rocadas")
public class RocadaController {

    private final RocadaService service;

    public RocadaController(RocadaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Rocada>> listar() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rocada> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Rocada> criar(@RequestBody Rocada rocada) {
        return ResponseEntity.ok(service.criar(rocada));
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Rocada> atualizarStatus(
            @PathVariable Long id,
            @RequestBody Map<String, String> payload) {

        String statusStr = payload.get("status");
        StatusRocada novoStatus = StatusRocada.valueOf(statusStr.toUpperCase());

        Rocada rocadaAtualizada = service.atualizarStatus(id, novoStatus);
        return ResponseEntity.ok(rocadaAtualizada);
    }
}