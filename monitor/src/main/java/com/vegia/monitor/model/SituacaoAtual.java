package com.vegia.monitor.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SituacaoAtual {

    private Integer score;
    private String status;
    private String corStatus;
    private String corTextoStatus;
}