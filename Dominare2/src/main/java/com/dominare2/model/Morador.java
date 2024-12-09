package com.dominare2.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Morador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String nascimento;
    private String cpf;
    private String telefone;
    private String bloco;
    private String apartamento;
    private String relacao;


    public Morador(String nome, String nascimento, String cpf, String telefone, String bloco,
    String apartamento, String relacao) {
    this.nome = nome;
    this.nascimento = nascimento;
    this.cpf = cpf;
    this.telefone = telefone;
    this.bloco = bloco;
    this.apartamento = apartamento;
    this.relacao = relacao;
    }

}

