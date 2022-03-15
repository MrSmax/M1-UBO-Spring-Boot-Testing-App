package com.services;

import com.dtos.DogDto;
import com.dtos.VacataireDto;

import java.util.List;

public interface VacataireService {
    /**
     * Sauve a Vacataire
     */
    VacataireDto saveVacataire(VacataireDto vacataireDto);

    /**
     * Get a Vacataire by it's id
     */
    VacataireDto getVacataireById(Long vacataireId);

    /**
     * Delete a Vacataire by it's id
     */
    boolean deleteVacataire(Long vacataireId);

    /**
     * Get all the Vacataires
     */
    List<VacataireDto> getAllVacataires();
}
