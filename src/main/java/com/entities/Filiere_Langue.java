package com.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Filiere_Langue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomFiliereLangue;
    private String codeFiliereLanngue;

    @ManyToOne
    private Composante composante;
}
