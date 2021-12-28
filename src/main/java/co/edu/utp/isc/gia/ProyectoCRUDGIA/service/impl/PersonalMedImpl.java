package co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl;


import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.EspecializacionEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.PersonalMedRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.EspecializacionService;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PersonalMedService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonalMedImpl implements PersonalMedService {

    @Autowired
    private PersonalMedRepository personalMedRepository;

    @Autowired
    private EspecializacionService especializacionService;

    @Autowired
    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public PersonalMedDTO crearPersonalMed(PersonalMedDTO personalMedDTO) {
        if(!personalMedDTO.equals(null) && personalMedDTO != null){
            EspecializacionEntity especializacionEntity =
                    especializacionService.obtenerEspecializacionPorId(personalMedDTO.getEspecializacionId());
            PersonalMedEntity personalMedEntity = modelMapper.map(personalMedDTO, PersonalMedEntity.class);
            personalMedEntity.setEspecializacionEntity(especializacionEntity);

            return modelMapper.map(this.personalMedRepository.save(personalMedEntity),PersonalMedDTO.class);
        }else {
            return null;
        }
    }

    @Override
    public PersonalMedEntity obtenerPersonalMedPorId(Long personalMedId) {
        Optional<PersonalMedEntity> personalMedEntityOptional = personalMedRepository.findById(personalMedId);
        if (personalMedEntityOptional.isPresent()){
            return personalMedEntityOptional.get();
        }else{
            return null;
        }
    }

    @Override
    public PersonalMedDTO obtenerPersonalMedPorCedula(String cedula) {
        if (this.personalMedRepository.existsByCedula(cedula)){
            return modelMapper.map(this.personalMedRepository.findByCedula(cedula).get(),PersonalMedDTO.class);
        }
        return null;
    }
}
