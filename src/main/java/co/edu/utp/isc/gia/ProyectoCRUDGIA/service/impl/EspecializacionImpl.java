package co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecialziacionDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.EspecializacionEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.EspecializacionRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.EspecializacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspecializacionImpl implements EspecializacionService {

    @Autowired
    private EspecializacionRepository especializacionRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EspecialziacionDTO crearEspecializacion(EspecialziacionDTO especialziacionDTO) {
        if(!especialziacionDTO.equals(null) && especialziacionDTO != null){
            EspecializacionEntity especializacionEntity = modelMapper.map(especialziacionDTO,
                    EspecializacionEntity.class);
            return modelMapper.map(this.especializacionRepository.save(especializacionEntity),
                    EspecialziacionDTO.class);
        }else {
            return null;
        }
    }
}
