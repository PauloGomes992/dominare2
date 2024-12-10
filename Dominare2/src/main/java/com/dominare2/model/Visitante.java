package com.dominare2.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Visitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String bloco;
    private String apartamento;


    public Visitante(String nome, String cpf, String telefone, String bloco,
    String apartamento) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.bloco = bloco;
    this.apartamento = apartamento;
    }

}

