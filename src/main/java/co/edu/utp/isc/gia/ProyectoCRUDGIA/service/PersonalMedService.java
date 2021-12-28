package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;

public interface PersonalMedService {
    PersonalMedDTO crearPersonalMed(PersonalMedDTO personalMedDTO);

    PersonalMedEntity obtenerPersonalMedPorId(Long personalMedId);

    PersonalMedDTO obtenerPersonalMedPorCedula(String cedula);
}
