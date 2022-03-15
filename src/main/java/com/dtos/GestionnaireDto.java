package com.dtos;

import lombok.Data;

@Data
public class GestionnaireDto {

    private Long id;
    private String login;
    private String motDePasse;
    private String nomUsuel;
    private String prenom;
    private String mail;
}
