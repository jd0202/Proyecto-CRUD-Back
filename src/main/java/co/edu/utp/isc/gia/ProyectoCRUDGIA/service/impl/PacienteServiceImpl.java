package co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PacienteDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PacienteEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.PacienteRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PacienteService;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PersonalMedService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacienteService {
    @Autowired
    private PersonalMedService personalMedService;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public PacienteDTO crearPaciente(PacienteDTO pacienteDTO) {
            if(!pacienteDTO.equals(null) && pacienteDTO != null){
                PersonalMedEntity personalMedEntity =
                        personalMedService.obtenerPersonalMedPorId(pacienteDTO.getPersonalMedId());
                PacienteEntity pacienteEntity = modelMapper.map(pacienteDTO, PacienteEntity.class);
                pacienteEntity.setPersonalMedEntity(personalMedEntity);
                return modelMapper.map(this.pacienteRepository.save(pacienteEntity),PacienteDTO.class);
            }else {
                return null;
            }
        }

    @Override
    public PacienteDTO obtenerPacientePorCedula(String cedula) {
        if (this.pacienteRepository.existsByCedula(cedula)){
            return modelMapper.map(this.pacienteRepository.findByCedula(cedula).get(),PacienteDTO.class);
        }else {
            return null;
        }
    }

    @Override
    public PacienteEntity obtenerPacientePorId(Long id) {
        Optional<PacienteEntity> pacienteEntityOptional = pacienteRepository.findById(id);
        if (pacienteEntityOptional.isPresent()){
            return pacienteEntityOptional.get();
        }else{
            return null;
        }
    }
}
