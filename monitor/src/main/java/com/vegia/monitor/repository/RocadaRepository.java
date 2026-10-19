package com.vegia.monitor.repository;

import com.vegia.monitor.model.Rocada;
import com.vegia.monitor.model.StatusRocada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RocadaRepository extends JpaRepository<Rocada, Long> {

    // Busca roçadas filtradas por status (PENDENTE, EM_ANDAMENTO, CONCLUIDO)
    List<Rocada> findByStatus(StatusRocada status);

    // Busca roçadas pelo nome da rodovia (busca case-insensitive)
    List<Rocada> findByRodoviaContainingIgnoreCase(String rodovia);
}