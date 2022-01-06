package co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl;


import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecializacionDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PacienteDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.EspecializacionEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PacienteEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.PersonalMedRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.EspecializacionService;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PersonalMedService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
            EspecializacionEntity especializacionEntity = modelMapper.map(
                    especializacionService.obtenerEspecializacionPorId(personalMedDTO.getEspecializacionId()
                    ), EspecializacionEntity.class);
            if(especializacionEntity != null){
                PersonalMedEntity personalMedEntity = modelMapper.map(personalMedDTO, PersonalMedEntity.class);
                personalMedEntity.setEspecializacionEntity(especializacionEntity);
                return modelMapper.map(this.personalMedRepository.save(personalMedEntity),PersonalMedDTO.class);
            }else{
                return null;
            }
        }else {
            return null;
        }
    }

    @Override
    public PersonalMedDTO obtenerPersonalMedPorId(Long personalMedId) {
        Optional<PersonalMedEntity> personalMedEntityOptional = personalMedRepository.findById(personalMedId);
        if (personalMedEntityOptional.isPresent()){
            return modelMapper.map(personalMedEntityOptional.get(),PersonalMedDTO.class);
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

    @Override
    public PersonalMedDTO editarPersonalMed(PersonalMedDTO personalMedDTO) {
        if (!personalMedDTO.equals(null) && personalMedDTO != null) {
            if (obtenerPersonalMedPorId(personalMedDTO.getId()) != null) {
                if(especializacionService.obtenerEspecializacionPorId(personalMedDTO.getEspecializacionId()) != null){
                    EspecializacionEntity especializacionEntity = modelMapper.map(
                            especializacionService.obtenerEspecializacionPorId(personalMedDTO.getEspecializacionId()
                            ), EspecializacionEntity.class);
                    PersonalMedEntity personalMedEntity = modelMapper.map(personalMedDTO, PersonalMedEntity.class);
                    personalMedEntity.setEspecializacionEntity(especializacionEntity);
                    return modelMapper.map(this.personalMedRepository.save(personalMedEntity), PersonalMedDTO.class);
                }else{
                    return null;
                }
            } else {
                return null;
            }
        }else{
            return null;
        }
    }

    @Override
    public String borrarPersonalMed(Long id) {
        if(obtenerPersonalMedPorId(id) != null){
            personalMedRepository.deleteById(id);
            return "PersonalMed delete";
        }else {
            return null;
        }
    }

    @Override
    public List<PersonalMedDTO> obtenerPersonalMeds() {
        Iterable<PersonalMedEntity> personalMedEntities = this.personalMedRepository.findAll();
        List<PersonalMedDTO> personalMedDTOS = new ArrayList<>();
        personalMedEntities.forEach(personalMedEntity -> {
            personalMedDTOS.add(modelMapper.map(personalMedEntity, PersonalMedDTO.class));
        });
        return  personalMedDTOS;
    }
}
