package com.vegia.monitor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_rocadas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rocada {

    @Id
    private String id;

    private String data;
    private String dia;
    private String equipe;
    private String local;
    private String km;
    private String servico;
    private String scoreIA;
    private String status;
}