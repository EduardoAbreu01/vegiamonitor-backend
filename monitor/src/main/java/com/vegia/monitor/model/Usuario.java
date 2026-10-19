package com.vegia.monitor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    private String id;

    private String cpf;
    private String senha;
    private String cargo;         // "Operador", "Fiscal", etc.
    private String nome;
    private String equipe;        // "Equipe 2"
    private String foto;          // URL da imagem
    private String contatoGestor; // Ex: "55911111111"
}