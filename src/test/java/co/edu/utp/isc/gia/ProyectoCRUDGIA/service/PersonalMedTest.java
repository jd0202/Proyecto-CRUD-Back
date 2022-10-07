package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecializacionDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.EspecializacionEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.EspecializacionRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.PersonalMedRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl.EspecializacionImpl;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl.PersonalMedImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;

import java.util.Date;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PersonalMedTest {

    private PersonalMedRepository personalMedRepository;
    private final ModelMapper modelMapper;
    private EspecializacionEntity especializacionEntity;
    private EspecializacionRepository especializacionRepository;

    public PersonalMedTest(){
        this.personalMedRepository = Mockito.mock(PersonalMedRepository.class);
        this.modelMapper = new ModelMapper();
        this.especializacionEntity = new EspecializacionEntity(Long.valueOf(1),"especializacion1");
        this.especializacionRepository = Mockito.mock(EspecializacionRepository.class);
    }
    //PersonalMedDTO crearPersonalMed(PersonalMedDTO personalMedDTO);
    @Test
    public void crear() {
        Long id = Long.valueOf(1);
        Date fechaNacimiento = new Date();
        System.out.println("crear PersonalMed");
        PersonalMedEntity personalMedEntity = new PersonalMedEntity(id, "cedula" ,"nombre1",
                "nombre2", "apellido1", "apellido2", "telefono", fechaNacimiento,
                especializacionEntity);
        when(personalMedRepository.save(any(PersonalMedEntity.class))).thenReturn(personalMedEntity);

        when(especializacionRepository.findById(any(Long.class))).thenReturn(Optional.of(especializacionEntity));

        PersonalMedDTO personalMedDTO = new PersonalMedDTO(id, "cedula" ,"nombre1", "nombre2",
                "apellido1", "apellido2", "telefono", fechaNacimiento, id);
        EspecializacionImpl especializacionService = new EspecializacionImpl(especializacionRepository, modelMapper);
        PersonalMedImpl personalMedService = new PersonalMedImpl(personalMedRepository, especializacionService,
                modelMapper);
        PersonalMedDTO resultPersonalMedDTO = new PersonalMedDTO(id, "cedula" ,"nombre1",
                "nombre2", "apellido1", "apellido2", "telefono", fechaNacimiento, id);
        PersonalMedDTO result = personalMedService.crearPersonalMed(personalMedDTO);

        assertThat(resultPersonalMedDTO.getId()).isEqualTo(result.getId());
        assertThat(resultPersonalMedDTO).usingRecursiveComparison().isEqualTo(result);
    }

    //PersonalMedDTO obtenerPersonalMedPorId(Long personalMedId);
    @Test
    public void obtenerporId() {
        System.out.println("obtener PersonalMed Id");
        Long id = Long.valueOf(1);
        Date fechaNacimiento = new Date();
        PersonalMedEntity personalMedEntity = new PersonalMedEntity(id, "cedula" ,"nombre1",
                "nombre2", "apellido1", "apellido2", "telefono", fechaNacimiento,
                especializacionEntity);
        when(personalMedRepository.findById(any(Long.class))).thenReturn(Optional.of(personalMedEntity));
        when(especializacionRepository.findById(any(Long.class))).thenReturn(Optional.of(especializacionEntity));


        EspecializacionImpl especializacionService = new EspecializacionImpl(especializacionRepository, modelMapper);
        PersonalMedImpl personalMedService = new PersonalMedImpl(personalMedRepository, especializacionService,
                modelMapper);
        PersonalMedDTO resultPersonalMedDTO = new PersonalMedDTO(id, "cedula" ,"nombre1",
                "nombre2", "apellido1", "apellido2", "telefono", fechaNacimiento,
                id);
        PersonalMedDTO result = personalMedService.obtenerPersonalMedPorId(resultPersonalMedDTO.getId());

        assertThat(resultPersonalMedDTO.getId()).isEqualTo(result.getId());
        assertThat(resultPersonalMedDTO).usingRecursiveComparison().isEqualTo(result);

    }

    //PersonalMedDTO obtenerPersonalMedPorCedula(String cedula);
    @Test
    public void obtenerPorCedula() {
        System.out.println("obtener PersonalMed cedula");
        Long id = Long.valueOf(1);
        Date fechaNacimiento = new Date();
        PersonalMedEntity personalMedEntity = new PersonalMedEntity(id, "cedula" ,"nombre1",
                "nombre2", "apellido1", "apellido2", "telefono", fechaNacimiento,
                especializacionEntity);
        when(personalMedRepository.existsByCedula(any(String.class))).thenReturn(Boolean.TRUE);
        when(personalMedRepository.findByCedula(any(String.class))).thenReturn(Optional.of(personalMedEntity));
        when(especializacionRepository.findById(any(Long.class))).thenReturn(Optional.of(especializacionEntity));


        EspecializacionImpl especializacionService = new EspecializacionImpl(especializacionRepository, modelMapper);
        PersonalMedImpl personalMedService = new PersonalMedImpl(personalMedRepository, especializacionService,
                modelMapper);
        PersonalMedDTO resultPersonalMedDTO = new PersonalMedDTO(id, "cedula" ,"nombre1",
                "nombre2", "apellido1", "apellido2", "telefono", fechaNacimiento,
                id);
        PersonalMedDTO result = personalMedService.obtenerPersonalMedPorCedula(resultPersonalMedDTO.getCedula());

        assertThat(resultPersonalMedDTO.getId()).isEqualTo(result.getId());
        assertThat(resultPersonalMedDTO).usingRecursiveComparison().isEqualTo(result);

    }

    //PersonalMedDTO editarPersonalMed(PersonalMedDTO personalMedDTO);
    @Test
    public void editar() {

    }

    //String borrarPersonalMed(Long id);
    @Test
    public void borrar() {

    }

    //List<PersonalMedDTO> obtenerPersonalMeds();
    @Test
    public void obtenerPersonalMeds() {

    }
}
