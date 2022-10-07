package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecializacionDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.PacienteDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.EspecializacionEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PacienteEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.EspecializacionRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.PacienteRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl.EspecializacionImpl;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl.PacienteServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PacienteServiceTest {

    private PacienteRepository pacienteRepository;
    private final ModelMapper modelMapper;

    public PacienteServiceTest(){
        this.pacienteRepository = Mockito.mock(PacienteRepository.class);
        this.modelMapper = new ModelMapper();
    }
    //PacienteDTO crearPaciente(PacienteDTO pacienteDTO);
    @Test
    public void crear() {
        /*System.out.println("crear Paciente");
        PacienteEntity pacienteEntity = new PacienteEntity();
        when(pacienteRepository.save(any(PacienteEntity.class))).thenReturn(pacienteEntity);

        PacienteDTO pacienteDTO = new PacienteDTO();
        PacienteServiceImpl pacienteService = new PacienteServiceImpl(pacienteRepository,modelMapper);
        PacienteDTO resultpacienteDTO = new PacienteDTO();
        PacienteDTO result = pacienteService.crearPaciente(pacienteDTO);

        assertThat(resultpacienteDTO.getId()).isEqualTo(result.getId());
        assertThat(resultpacienteDTO).usingRecursiveComparison().isEqualTo(result);*/
    }

    //PacienteDTO obtenerPacientePorCedula(String cedula);
    @Test
    public void obtenerPorCedula() {

    }

    //PacienteDTO obtenerPacientePorId(Long id);
    @Test
    public void obtenerPorId() {

    }

    //PacienteDTO editarPaciente(PacienteDTO pacienteDTO);
    @Test
    public void editar() {

    }

    //String borrarPaciente(Long id);
    @Test
    public void borrar() {

    }

    //List<PacienteDTO> obtenerPacientes();
    @Test
    public void obtenerPacientes() {

    }
}
