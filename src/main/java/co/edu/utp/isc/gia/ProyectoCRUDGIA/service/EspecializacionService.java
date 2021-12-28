package co.edu.utp.isc.gia.ProyectoCRUDGIA.service;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecialziacionDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.EspecializacionEntity;

public interface EspecializacionService {
    EspecialziacionDTO crearEspecializacion(EspecialziacionDTO especialziacionDTO);

    EspecializacionEntity obtenerEspecializacionPorId(Long especializacionId);
}
