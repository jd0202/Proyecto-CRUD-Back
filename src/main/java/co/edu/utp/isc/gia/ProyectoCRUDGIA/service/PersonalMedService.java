package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;

import java.util.List;

public interface PersonalMedService {
    PersonalMedDTO crearPersonalMed(PersonalMedDTO personalMedDTO);

    PersonalMedDTO obtenerPersonalMedPorId(Long personalMedId);

    PersonalMedDTO obtenerPersonalMedPorCedula(String cedula);

    PersonalMedDTO editarPersonalMed(PersonalMedDTO personalMedDTO);

    String borrarPersonalMed(Long id);

    List<PersonalMedDTO> obtenerPersonalMeds();
}
