package com.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Seance_Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean estEffectue;
    private Long dureeEffective;
    private Boolean valide;
    private String commentaire;

    @ManyToOne
    private Creneau creneau;
}
