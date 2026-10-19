// RocadaRepository.java
package com.vegia.monitor.repository;

import com.vegia.monitor.model.Rocada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RocadaRepository extends JpaRepository<Rocada, String> {
    List<Rocada> findByEquipe(String equipe);
}