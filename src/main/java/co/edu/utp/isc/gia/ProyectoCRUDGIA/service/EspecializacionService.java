package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecializacionDTO;

public interface EspecializacionService {
    EspecializacionDTO crearEspecializacion(EspecializacionDTO especialziacionDTO);

    EspecializacionDTO obtenerEspecializacionPorId(Long especializacionId);

    String borrarEspecializacion(Long id);

    EspecializacionDTO editarEspecializacion(EspecializacionDTO especializacionDTO);
}
