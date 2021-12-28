package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PacienteDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PacienteEntity;

public interface PacienteService {
    PacienteDTO crearPaciente(PacienteDTO pacienteDTO);

    PacienteDTO obtenerPacientePorCedula(String cedula);

    PacienteEntity obtenerPacientePorId(Long id);
}
