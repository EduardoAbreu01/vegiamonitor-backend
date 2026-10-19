// NotificacaoController.java
package com.vegia.monitor.controller;

import com.vegia.monitor.model.Notificacao;
import com.vegia.monitor.repository.NotificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notificacoes")
@CrossOrigin(origins = "*")
public class NotificacaoController {

    @Autowired
    private NotificacaoRepository repository;

    @GetMapping
    public List<Notificacao> listarTodas() {
        return repository.findAll();
    }
}