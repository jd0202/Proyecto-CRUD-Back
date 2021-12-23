package co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl;


import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.PersonalMedRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PersonalMedService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalMedImpl implements PersonalMedService {

    @Autowired
    private PersonalMedRepository personalMedRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PersonalMedDTO crearPersonalMed(PersonalMedDTO personalMedDTO) {
        if(!personalMedDTO.equals(null) && personalMedDTO != null){
            PersonalMedEntity personalMedEntity = modelMapper.map(personalMedDTO, PersonalMedEntity.class);
            return modelMapper.map(this.personalMedRepository.save(personalMedEntity),PersonalMedDTO.class);
        }else {
            return null;
        }
    }
}
