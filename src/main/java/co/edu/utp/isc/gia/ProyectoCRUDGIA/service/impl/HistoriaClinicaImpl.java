package co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.HistoriaClinicaDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PacienteDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.EspecializacionEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.HistoriaClinicaEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PacienteEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.HistoriaClinicaRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.HistoriaClinicaService;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PacienteService;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PersonalMedService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistoriaClinicaImpl implements HistoriaClinicaService {

    @Autowired
    private PersonalMedService personalMedService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    @Autowired
    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public HistoriaClinicaDTO crearHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO) {
        if(!historiaClinicaDTO.equals(null) && historiaClinicaDTO != null) {
            PacienteEntity pacienteEntity = modelMapper.map(
                    pacienteService.obtenerPacientePorId(historiaClinicaDTO.getPaciente_Id()),PacienteEntity.class);
            PersonalMedEntity personalMedEntity =modelMapper.map(
                    personalMedService.obtenerPersonalMedPorId(historiaClinicaDTO.getPersonalMed_Id()),
                    PersonalMedEntity.class);
            HistoriaClinicaEntity historiaClinicaEntity = modelMapper.map(historiaClinicaDTO, HistoriaClinicaEntity.class);
            historiaClinicaEntity.setPacienteEntity(pacienteEntity);
            historiaClinicaEntity.setPersonalMedEntity(personalMedEntity);
            return modelMapper.map(this.historiaClinicaRepository.save(historiaClinicaEntity), HistoriaClinicaDTO.class);
        } else {
            return null;
        }
    }

    @Override
    public List<HistoriaClinicaDTO> obtenerHistoriaClinicaPorCedula(String cedula) {
        PacienteDTO pacienteDTO = pacienteService.obtenerPacientePorCedula(cedula);
        List<HistoriaClinicaEntity> historiasClinicasEntities =
                historiaClinicaRepository.findByPaciente_Id(pacienteDTO.getId());
        if (!historiasClinicasEntities.isEmpty()){
            List<HistoriaClinicaDTO> historiasClinicasDTO  = new ArrayList<>();
            historiasClinicasEntities.forEach(historiaClinicaEntity -> {
                historiasClinicasDTO.add(modelMapper.map(historiaClinicaEntity, HistoriaClinicaDTO.class));
            });
            return historiasClinicasDTO;
        }else {
            return null;
        }
    }
}
