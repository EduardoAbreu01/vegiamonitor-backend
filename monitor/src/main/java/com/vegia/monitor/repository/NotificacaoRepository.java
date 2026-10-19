package com.vegia.monitor.repository;

import com.vegia.monitor.model.Notificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {

    // Retorna apenas as notificações que ainda não foram lidas pelo operador
    List<Notificacao> findByLidaFalse();

    // Retorna todas ordenadas da mais recente para a mais antiga
    List<Notificacao> findAllByOrderByDataHoraDesc();
}