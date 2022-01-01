package co.edu.utp.isc.gia.ProyectoCRUDGIA.controller;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PacienteDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
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

    @GetMapping("obtenerPacientePorCedula")
    public PacienteDTO obtenerPorCedula(@RequestParam String cedula){
        return pacienteService.obtenerPacientePorCedula(cedula);
    }

    @GetMapping("obtenerPacientePorId")
    public PacienteDTO obtenerPacientePorId(@RequestParam Long id){
        return pacienteService.obtenerPacientePorId(id);
    }

    @GetMapping("obtenerPacientes")
    public List<PacienteDTO> obtenerPacientess(){
        return pacienteService.obtenerPacientes();
    }

    @PutMapping("editarPaciente")
    public PacienteDTO editarPaciente(@RequestBody PacienteDTO pacienteDTO){
        return pacienteService.editarPaciente(pacienteDTO);
    }

    @DeleteMapping("borrarPaciente")
    public  String borrarPaciente(@RequestParam Long id){
        return pacienteService.borrarPaciente(id);
    }
}
