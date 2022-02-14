package com.digitalinnovationone.padroesprojetospring.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @ManyToOne
    Endereco endereco;

}
