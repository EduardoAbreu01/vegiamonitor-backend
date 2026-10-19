package com.vegia.monitor.service;

import com.vegia.monitor.exception.RecursoNaoEncontradoException;
import com.vegia.monitor.model.Rocada;
import com.vegia.monitor.model.StatusRocada;
import com.vegia.monitor.repository.RocadaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    public Rocada buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Roçada não encontrada com o ID: " + id));
    }

    public Rocada criar(Rocada rocada) {
        if (rocada.getStatus() == null) {
            rocada.setStatus(StatusRocada.PENDENTE);
        }
        return repository.save(rocada);
    }

    public Rocada atualizarStatus(Long id, StatusRocada novoStatus) {
        Rocada rocada = buscarPorId(id);
        rocada.setStatus(novoStatus);

        if (novoStatus == StatusRocada.CONCLUIDO) {
            rocada.setDataConclusao(LocalDate.now());
        }

        return repository.save(rocada);
    }
}