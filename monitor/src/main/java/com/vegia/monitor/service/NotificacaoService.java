package com.vegia.monitor.service;

import com.vegia.monitor.exception.RecursoNaoEncontradoException;
import com.vegia.monitor.model.Notificacao;
import com.vegia.monitor.repository.NotificacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacaoService {

    private final NotificacaoRepository repository;

    public NotificacaoService(NotificacaoRepository repository) {
        this.repository = repository;
    }

    public List<Notificacao> listarTodas() {
        return repository.findAll();
    }

    public Notificacao buscarPorId(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Notificação não encontrada com ID: " + id));
    }

    public Notificacao criar(Notificacao notificacao) {
        if (notificacao.getTipo() == null) {
            notificacao.setTipo("Informativo");
        }
        return repository.save(notificacao);
    }
}