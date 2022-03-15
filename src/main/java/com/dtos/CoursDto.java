package com.dtos;

import com.entities.Filiere_Langue;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CoursDto {
    private Long id;
    private String intitule;
    private List<Filiere_Langue> courFilieres= new ArrayList<>();

}
