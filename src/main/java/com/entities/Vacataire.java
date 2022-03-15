package com.entities;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Vacataire extends Utilisateur{

    @ManyToOne
    private Cours cour;

}
