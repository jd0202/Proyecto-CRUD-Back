package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.HistoriaClinicaDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PersonalMedDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.HistoriaClinicaEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.HistoriaClinicaRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.PacienteRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl.HistoriaClinicaImpl;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl.PacienteServiceImpl;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl.PersonalMedImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class HistoriaClinicaTest {

    private HistoriaClinicaRepository historiaClinicaRepository;
    private final ModelMapper modelMapper;

    public HistoriaClinicaTest() {
        this.historiaClinicaRepository = Mockito.mock(HistoriaClinicaRepository.class);
        this.modelMapper = new ModelMapper();
    }

    //HistoriaClinicaDTO crearHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO);
    @Test
    public void crear() {
        /*System.out.println("crear HistoriaClinica");
        HistoriaClinicaEntity historiaClinicaEntity = new HistoriaClinicaEntity();
        historiaClinicaEntity.setCedula("123");
        PacienteRepository pacienteRepository = Mockito.mock(PacienteRepository.class);
        when(historiaClinicaRepository.save((any(HistoriaClinicaEntity.class)))).thenReturn(historiaClinicaEntity);
        //when(pacienteRepository.obtener((any(HistoriaClinicaEntity.class)))).thenReturn(historiaClinicaEntity);

        HistoriaClinicaDTO historiaClinicaDTO = new HistoriaClinicaDTO();
        historiaClinicaEntity.setCedula("123");
        PersonalMedImpl personalMedService = new PersonalMedImpl();
        PacienteServiceImpl pacienteService = new PacienteServiceImpl();
        HistoriaClinicaImpl historiaClinicaService = new HistoriaClinicaImpl(personalMedService, pacienteService,
                historiaClinicaRepository, modelMapper);
        HistoriaClinicaDTO resulHistoriaClinicaDTO = new HistoriaClinicaDTO();
        HistoriaClinicaDTO result = historiaClinicaService.crearHistoriaClinica(historiaClinicaDTO);

        assertThat(resulHistoriaClinicaDTO.getId()).isEqualTo(result.getId());
        assertThat(resulHistoriaClinicaDTO).usingRecursiveComparison().isEqualTo(result);*/
    }

    //List<HistoriaClinicaDTO> obtenerHistoriaClinicaPorCedula(String cedula);
    @Test
    public void obtenerPorCedula() {
        /*System.out.println("crear HistoriaClinica");
        List<HistoriaClinicaEntity> historiaClinicaEntity = new ArrayList<>();
        when(historiaClinicaRepository.findByCedula((any(Long.class)))).thenReturn(historiaClinicaEntity);

        List<HistoriaClinicaDTO> historiaClinicaDTOs = new ArrayList<>();
        HistoriaClinicaDTO historiaClinicaDTO = new HistoriaClinicaDTO();
        historiaClinicaDTO.setCedula("123");
        PersonalMedImpl personalMedService = new PersonalMedImpl();
        PacienteServiceImpl pacienteService = new PacienteServiceImpl();
        HistoriaClinicaImpl historiaClinicaService = new HistoriaClinicaImpl(personalMedService, pacienteService,
                historiaClinicaRepository, modelMapper);
        List<HistoriaClinicaDTO> resulHistoriaClinicaDTOs = new ArrayList<>();
        List<HistoriaClinicaDTO> result = historiaClinicaService.obtenerHistoriaClinicaPorCedula(historiaClinicaDTO.getCedula());

        assertThat(resulHistoriaClinicaDTOs).usingRecursiveComparison().isEqualTo(result);*/
    }

    //HistoriaClinicaDTO obtenerHistoriaClinicaPorId(Long id);
    @Test
    public void obtenerPorId() {

    }

    //HistoriaClinicaDTO editarHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO);
    @Test
    public void editar() {

    }

    //String borrarHistoriaClinica(Long id);
    @Test
    public void borrar() {

    }

    //List<HistoriaClinicaDTO> obtenerHistoriasClinicas();
    @Test
    public void obtenerHistorias() {

    }
}
