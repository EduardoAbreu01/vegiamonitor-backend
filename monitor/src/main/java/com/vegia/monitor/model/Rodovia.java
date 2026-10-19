package com.vegia.monitor.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_rodovias")
public class Rodovia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;             // Ex: "BR-116", "SP-330"
    private String concessionaria;   // Ex: "Motiva Rodovias"
    private Double kmInicio;
    private Double kmFim;
    private Double alturaVegetacao;  // Estimada por IA/Visão Computacional (em metros)

    @Enumerated(EnumType.STRING)
    private NivelRisco nivelRisco;   // BAIXO, MEDIO, ALTO

    private String imagemUrl;        // Link da imagem capturada no trecho
    private LocalDateTime dataUltimaAnalise;

    public Rodovia() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(String concessionaria) {
        this.concessionaria = concessionaria;
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

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public LocalDateTime getDataUltimaAnalise() {
        return dataUltimaAnalise;
    }

    public void setDataUltimaAnalise(LocalDateTime dataUltimaAnalise) {
        this.dataUltimaAnalise = dataUltimaAnalise;
    }
}