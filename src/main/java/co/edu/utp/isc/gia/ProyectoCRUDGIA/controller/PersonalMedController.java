package co.edu.utp.isc.gia.ProyectoCRUDGIA.controller;


import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecializacionDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PersonalMedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personalMed")
public class PersonalMedController {

    @Autowired
    private PersonalMedService personalMedService;

    @PostMapping("crearPersonalMed")
    public PersonalMedDTO crearPersonalMed(@RequestBody PersonalMedDTO personalMedDTO){
        return personalMedService.crearPersonalMed(personalMedDTO);
    }

    @GetMapping("obtenerPersonalMedPorCedula")
    public PersonalMedDTO obtenerPersonalMedPorCedula(@RequestParam String cedula){
        return personalMedService.obtenerPersonalMedPorCedula(cedula);
    }

    @GetMapping("obtenerPersonalMedPorId")
    public PersonalMedDTO obtenerPersonalMedPorId(@RequestParam Long id){
        return personalMedService.obtenerPersonalMedPorId(id);
    }

    @GetMapping("obtenerPersonalMeds")
    public List<PersonalMedDTO> obtenerPersonalMeds(){
        return personalMedService.obtenerPersonalMeds();
    }

    @PutMapping("editarPersonalMed")
    public PersonalMedDTO editarPersonalMed(@RequestBody PersonalMedDTO personalMedDTO){
        return personalMedService.editarPersonalMed(personalMedDTO);
    }

    @DeleteMapping("borrarPersonalMed")
    public String borrarPersonalMed(@RequestParam Long id){
        return personalMedService.borrarPersonalMed(id);
    }
}
