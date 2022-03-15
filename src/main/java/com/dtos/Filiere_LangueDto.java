package com.dtos;
import com.entities.Composante;
import com.entities.Cours;
import lombok.Data;

@Data
public class Filiere_LangueDto {

    private Long id;
    private Composante composante;
    private String nomFiliereLangue;
    private String codeFiliereLanngue;
}
