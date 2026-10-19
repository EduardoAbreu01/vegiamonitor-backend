package com.vegia.monitor.service;

import com.vegia.monitor.exception.RecursoNaoEncontradoException;
import com.vegia.monitor.model.Notificacao;
import com.vegia.monitor.repository.NotificacaoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotificacaoService {

    private final NotificacaoRepository repository;

    public NotificacaoService(NotificacaoRepository repository) {
        this.repository = repository;
    }

    public List<Notificacao> listarTodas() {
        return repository.findAllByOrderByDataHoraDesc();
    }

    public Notificacao criar(Notificacao notificacao) {
        notificacao.setDataHora(LocalDateTime.now());
        notificacao.setLida(false);

        if (notificacao.getOrigem() == null) {
            notificacao.setOrigem("USUARIO");
        }
        if (notificacao.getTipo() == null) {
            notificacao.setTipo("SUGESTAO");
        }

        return repository.save(notificacao);
    }

    public Notificacao marcarComoLida(Long id) {
        Notificacao notificacao = repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Notificação não encontrada com ID: " + id));

        notificacao.setLida(true);
        return repository.save(notificacao);
    }
}