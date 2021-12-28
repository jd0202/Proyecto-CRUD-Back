package co.edu.utp.isc.gia.ProyectoCRUDGIA.controller;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PacienteDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PacienteEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("crearPaciente")
    public PacienteDTO crearPaciente(@RequestBody PacienteDTO pacienteDTO){
        return pacienteService.crearPaciente(pacienteDTO);
    }

    @GetMapping("obtenerPorCedula")
    public PacienteDTO obtenerPorCedula(@RequestParam String cedula){
        return pacienteService.obtenerPorCedula(cedula);
    }
}
