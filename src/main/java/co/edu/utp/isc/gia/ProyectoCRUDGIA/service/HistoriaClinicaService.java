package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.HistoriaClinicaDTO;

import java.util.List;

public interface HistoriaClinicaService {
    HistoriaClinicaDTO crearHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO);

    List<HistoriaClinicaDTO> obtenerHistoriaClinicaPorCedula(String cedula);
}
