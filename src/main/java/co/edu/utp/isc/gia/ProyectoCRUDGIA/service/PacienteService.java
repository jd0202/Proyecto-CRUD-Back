package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PacienteDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PacienteEntity;

public interface PacienteService {
    PacienteDTO crearPacienteMed(PacienteDTO pacienteDTO);

    PacienteDTO obtenerPorCedula(String cedula);
}
