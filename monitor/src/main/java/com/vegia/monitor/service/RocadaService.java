package com.vegia.monitor.service;

import com.vegia.monitor.exception.RecursoNaoEncontradoException;
import com.vegia.monitor.model.Rocada;
import com.vegia.monitor.repository.RocadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RocadaService {

    private final RocadaRepository repository;

    public RocadaService(RocadaRepository repository) {
        this.repository = repository;
    }

    public List<Rocada> listarTodas() {
        return repository.findAll();
    }

    public List<Rocada> listarPorEquipe(String equipe) {
        return repository.findByEquipe(equipe);
    }

    public Rocada buscarPorId(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Roçada não encontrada com o ID: " + id));
    }

    public Rocada criar(Rocada rocada) {
        if (rocada.getStatus() == null) {
            rocada.setStatus("Pendente");
        }
        return repository.save(rocada);
    }

    public Rocada atualizarStatus(String id, String novoStatus) {
        Rocada rocada = buscarPorId(id);
        rocada.setStatus(novoStatus);
        return repository.save(rocada);
    }
}