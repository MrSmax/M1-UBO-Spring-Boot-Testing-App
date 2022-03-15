package com.dtos;
import com.entities.Cours;
import com.entities.Type;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreneauDto {
    private Long id;
    private LocalDate dateHeure;
    private Long duree;
    private Type type;
    private Cours cour;

}
