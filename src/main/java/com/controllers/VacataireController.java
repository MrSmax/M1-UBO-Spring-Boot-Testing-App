package com.controllers;

import com.dtos.DogDto;
import com.dtos.VacataireDto;
import com.services.impl.VacataireServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacataires")
public class VacataireController {

    private final VacataireServiceImpl vacataireService;

    public VacataireController(VacataireServiceImpl vacataireService) {
        this.vacataireService = vacataireService;
    }


    /**
     * <p>Get all vacataires in the system</p>
     * @return List<VacataireDto>
     */
    @GetMapping
    public List<VacataireDto> getDogs() {
        return vacataireService.getAllVacataires();
    }

    /**
     * Method to get the vacataire based on the ID
     */
    @GetMapping("/{id}")
    public VacataireDto getDog(@PathVariable Long id){
        return vacataireService.getVacataireById(id);
    }

    /**
     * Create a new Dog in the system
     */
    @PostMapping
    public VacataireDto saveDog(final @RequestBody VacataireDto vacataireDto){
        return vacataireService.saveVacataire(vacataireDto);
    }

    /**
     * Delete a dog by it's id
     */
    @DeleteMapping("/{id}")
    public Boolean deleteDog(@PathVariable Long id){
        return vacataireService.deleteVacataire(id);
    }
}
