package com.vegia.monitor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_trechos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trecho {

    @Id
    private String id;

    private String rodovia;
    private String estado;
    private Integer limiteAlturaVegetacao;

    @Embedded
    private SituacaoAtual situacaoAtual;

    @Embedded
    private Equipes equipes;

    @ElementCollection
    @CollectionTable(
            name = "tb_trecho_detalhes_km",
            joinColumns = @JoinColumn(name = "trecho_id")
    )
    private List<DetalheKm> detalhesKms = new ArrayList<>();
}