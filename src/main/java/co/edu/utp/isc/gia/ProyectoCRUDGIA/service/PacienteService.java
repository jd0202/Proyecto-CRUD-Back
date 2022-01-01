package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PacienteDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PacienteEntity;

import java.util.List;

public interface PacienteService {
    PacienteDTO crearPaciente(PacienteDTO pacienteDTO);

    PacienteDTO obtenerPacientePorCedula(String cedula);

    PacienteDTO obtenerPacientePorId(Long id);

    PacienteDTO editarPaciente(PacienteDTO pacienteDTO);

    String borrarPaciente(Long id);

    List<PacienteDTO> obtenerPacientes();
}
