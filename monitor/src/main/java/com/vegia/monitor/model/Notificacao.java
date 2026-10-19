package com.vegia.monitor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_notificacoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notificacao {

    @Id
    private String id;

    private String rodovia;
    private String titulo;
    @Column(length = 1000)
    private String descricao;
    private String data;
    private String hora;
    private String tipo;
    private String icone;
    private String color;
}