package com.dtos;

import com.entities.Composante;
import lombok.Data;

@Data
public class ResponsableDto {

    private Long id;
    private String login;
    private String motDePasse;
    private String nomUsuel;
    private String prenom;
    private String mail;
    private Composante composante;
}
