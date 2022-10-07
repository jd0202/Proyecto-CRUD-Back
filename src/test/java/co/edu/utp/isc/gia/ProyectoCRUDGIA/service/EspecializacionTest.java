package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecializacionDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.EspecializacionEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.EspecializacionRepository;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl.EspecializacionImpl;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class EspecializacionTest {

    private EspecializacionRepository especializacionRepository;
    private final ModelMapper modelMapper;

    public EspecializacionTest(){
        this.especializacionRepository = Mockito.mock(EspecializacionRepository.class);
        this.modelMapper = new ModelMapper();
    }

    //EspecializacionDTO crearEspecializacion(EspecializacionDTO especialziacionDTO);
    @Test
    public void crear() {
        Long id = Long.valueOf(1);
        System.out.println("crear Especializacion");
        EspecializacionEntity especializacionEntity = new EspecializacionEntity(id,"especializacion1");
        when(especializacionRepository.save(any(EspecializacionEntity.class))).thenReturn(especializacionEntity);

        EspecializacionDTO especializacionDTO = new EspecializacionDTO(id,"especializacion1");
        EspecializacionImpl especializacionService = new EspecializacionImpl(especializacionRepository,modelMapper);
        EspecializacionDTO resultEspecializacionDTO = new EspecializacionDTO(id,"especializacion1");
        EspecializacionDTO result = especializacionService.crearEspecializacion(especializacionDTO);

        assertThat(resultEspecializacionDTO.getEspecializacion()).isEqualTo(result.getEspecializacion());
        assertThat(resultEspecializacionDTO.getId()).isEqualTo(result.getId());
        assertThat(resultEspecializacionDTO).usingRecursiveComparison().isEqualTo(result);
    }

    //EspecializacionDTO obtenerEspecializacionPorId(Long especializacionId);
    @Test
    public void obtener(){
        Long id = Long.valueOf(1);
        System.out.println("obtener Especializacion");
        EspecializacionEntity especializacionEntity = new EspecializacionEntity(id,"especializacion1");
        when(especializacionRepository.findById(any(Long.class))).thenReturn(Optional.of(especializacionEntity));

        EspecializacionImpl especializacionService = new EspecializacionImpl(especializacionRepository,modelMapper);
        EspecializacionDTO resultEspecializacionDTO = new EspecializacionDTO(id,"especializacion1");
        EspecializacionDTO result = especializacionService.obtenerEspecializacionPorId(resultEspecializacionDTO.getId());

        assertThat(resultEspecializacionDTO.getEspecializacion()).isEqualTo(result.getEspecializacion());
        assertThat(resultEspecializacionDTO.getId()).isEqualTo(result.getId());
        assertThat(resultEspecializacionDTO).usingRecursiveComparison().isEqualTo(result);
    }
    //String borrarEspecializacion(Long id);
    @Test
    public void borrar(){
        Long id = Long.valueOf(1);
        System.out.println("obtener Especializacion");
        EspecializacionEntity especializacionEntity = new EspecializacionEntity(id,"especializacion1");

        when(especializacionRepository.findById(any(Long.class))).thenReturn(Optional.of(especializacionEntity));

        EspecializacionImpl especializacionService = new EspecializacionImpl(especializacionRepository,modelMapper);
        String result = especializacionService.borrarEspecializacion(especializacionEntity.getId());

        assertThat(result).isEqualTo("especializacion delete");
    }
    //EspecializacionDTO editarEspecializacion(EspecializacionDTO especializacionDTO);
    @Test
    public void editar() {
        Long id = Long.valueOf(1);
        System.out.println("obtener Especializacion");
        EspecializacionEntity especializacionEntity = new EspecializacionEntity(id,"especializacion1");
        when(especializacionRepository.save(any(EspecializacionEntity.class))).thenReturn(especializacionEntity);
        when(especializacionRepository.findById(any(Long.class))).thenReturn(Optional.of(especializacionEntity));

        EspecializacionImpl especializacionService = new EspecializacionImpl(especializacionRepository,modelMapper);
        EspecializacionDTO resultEspecializacionDTO = new EspecializacionDTO(id,"especializacion1");
        EspecializacionDTO result = especializacionService.editarEspecializacion(resultEspecializacionDTO);

        assertThat(resultEspecializacionDTO.getEspecializacion()).isEqualTo(result.getEspecializacion());
        assertThat(resultEspecializacionDTO.getId()).isEqualTo(result.getId());
        assertThat(resultEspecializacionDTO).usingRecursiveComparison().isEqualTo(result);
    }
    //List<EspecializacionDTO> obtenerEspecializaciones();
    @Test
    public void obtener_especializaciones(){
        System.out.println("obtener Especializacion");
        List<EspecializacionEntity> especializacionEntities = new ArrayList<>();
        when(especializacionRepository.findAll()).thenReturn(especializacionEntities);

        EspecializacionImpl especializacionService = new EspecializacionImpl(especializacionRepository,modelMapper);
        List<EspecializacionDTO> resultEspecializacionDTOs = new ArrayList<>();
        List<EspecializacionDTO> result = especializacionService.obtenerEspecializaciones();

        assertThat(resultEspecializacionDTOs).usingRecursiveComparison().isEqualTo(result);
    }
}
