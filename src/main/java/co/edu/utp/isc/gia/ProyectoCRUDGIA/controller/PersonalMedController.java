package co.edu.utp.isc.gia.ProyectoCRUDGIA.controller;


import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PersonalMedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
