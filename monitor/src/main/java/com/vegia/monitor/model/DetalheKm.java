package com.vegia.monitor.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalheKm {

    private Integer km;
    private Integer alturaVegetacao;
    private Integer nivel;
}