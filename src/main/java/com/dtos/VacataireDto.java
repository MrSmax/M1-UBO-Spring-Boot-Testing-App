package com.dtos;
import com.entities.Cours;
import lombok.Data;
@Data
public class VacataireDto {

    private Long id;
    private String login;
    private String motDePasse;
    private String nomUsuel;
    private String prenom;
    private String mail;
    private Cours cour;
}
