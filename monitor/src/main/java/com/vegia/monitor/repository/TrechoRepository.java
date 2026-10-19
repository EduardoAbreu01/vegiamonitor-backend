package com.vegia.monitor.repository;

import com.vegia.monitor.model.Trecho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrechoRepository extends JpaRepository<Trecho, String> {
}