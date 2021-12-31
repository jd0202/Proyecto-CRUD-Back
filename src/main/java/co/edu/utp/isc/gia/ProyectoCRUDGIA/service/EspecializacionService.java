package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecializacionDTO;

import java.util.List;

public interface EspecializacionService {
    EspecializacionDTO crearEspecializacion(EspecializacionDTO especialziacionDTO);

    EspecializacionDTO obtenerEspecializacionPorId(Long especializacionId);

    String borrarEspecializacion(Long id);

    EspecializacionDTO editarEspecializacion(EspecializacionDTO especializacionDTO);

    List<EspecializacionDTO> obtenerEspecializaciones();
}
