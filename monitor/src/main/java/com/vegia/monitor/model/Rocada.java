package com.vegia.monitor.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_rocadas")
public class Rocada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rodovia;
    private Double kmInicio;
    private Double kmFim;
    private Double alturaVegetacao;

    @Enumerated(EnumType.STRING)
    private NivelRisco nivelRisco;

    @Enumerated(EnumType.STRING)
    private StatusRocada status;

    private LocalDate dataAgendamento;
    private LocalDate dataConclusao;

    public Rocada() {
    }

    public Rocada(Long id, String rodovia, Double kmInicio, Double kmFim, Double alturaVegetacao, NivelRisco nivelRisco, StatusRocada status, LocalDate dataAgendamento, LocalDate dataConclusao) {
        this.id = id;
        this.rodovia = rodovia;
        this.kmInicio = kmInicio;
        this.kmFim = kmFim;
        this.alturaVegetacao = alturaVegetacao;
        this.nivelRisco = nivelRisco;
        this.status = status;
        this.dataAgendamento = dataAgendamento;
        this.dataConclusao = dataConclusao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRodovia() {
        return rodovia;
    }

    public void setRodovia(String rodovia) {
        this.rodovia = rodovia;
    }

    public Double getKmInicio() {
        return kmInicio;
    }

    public void setKmInicio(Double kmInicio) {
        this.kmInicio = kmInicio;
    }

    public Double getKmFim() {
        return kmFim;
    }

    public void setKmFim(Double kmFim) {
        this.kmFim = kmFim;
    }

    public Double getAlturaVegetacao() {
        return alturaVegetacao;
    }

    public void setAlturaVegetacao(Double alturaVegetacao) {
        this.alturaVegetacao = alturaVegetacao;
    }

    public NivelRisco getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(NivelRisco nivelRisco) {
        this.nivelRisco = nivelRisco;
    }

    public StatusRocada getStatus() {
        return status;
    }

    public void setStatus(StatusRocada status) {
        this.status = status;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDate dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
}