// NotificacaoRepository.java
package com.vegia.monitor.repository;

import com.vegia.monitor.model.Notificacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacaoRepository extends JpaRepository<Notificacao, String> {
}