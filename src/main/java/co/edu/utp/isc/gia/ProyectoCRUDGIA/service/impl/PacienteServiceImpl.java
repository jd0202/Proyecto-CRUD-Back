package co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PacienteDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PacienteEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.PacienteRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.PersonalMedRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PacienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PacienteDTO crearPacienteMed(PacienteDTO pacienteDTO) {
            if(!pacienteDTO.equals(null) && pacienteDTO != null){
                PacienteEntity pacienteEntity = modelMapper.map(pacienteDTO, PacienteEntity.class);
                return modelMapper.map(this.pacienteRepository.save(pacienteEntity),PacienteDTO.class);
            }else {
                return null;
            }
        }
}
