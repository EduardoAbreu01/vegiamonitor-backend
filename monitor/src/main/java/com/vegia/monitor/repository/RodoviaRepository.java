package com.vegia.monitor.repository;

import com.vegia.monitor.model.NivelRisco;
import com.vegia.monitor.model.Rodovia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RodoviaRepository extends JpaRepository<Rodovia, Long> {

    // Permite pesquisar rodovias pelo nome (para a barra de busca do app)
    List<Rodovia> findByNomeContainingIgnoreCase(String nome);

    // Filtra rodovias por nível de risco (ex: listar apenas trechos com risco ALTO)
    List<Rodovia> findByNivelRisco(NivelRisco nivelRisco);
}