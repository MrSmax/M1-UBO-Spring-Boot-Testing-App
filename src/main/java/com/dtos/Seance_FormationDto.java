package com.dtos;

import com.entities.Creneau;
import com.entities.Vacataire;
import lombok.Data;

@Data
public class Seance_FormationDto {

    private Long id;
    private Boolean estEffectue;
    private Long dureeEffective;
    private Boolean valide;
    private String commentaire;
    private Creneau creneau;
    private Vacataire vacataire;
}
