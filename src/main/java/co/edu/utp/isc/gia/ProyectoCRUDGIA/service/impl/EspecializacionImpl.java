package co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecialziacionDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.EspecializacionEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.EspecializacionRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.EspecializacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EspecializacionImpl implements EspecializacionService {

    @Autowired
    private EspecializacionRepository especializacionRepository;

    @Autowired
    private ModelMapper modelMapper = new ModelMapper();

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

    @Override
    public EspecializacionEntity obtenerEspecializacionPorId(Long especializacionId) {
        Optional<EspecializacionEntity> especializacionEntityOptional = especializacionRepository.findById(especializacionId);
        if (especializacionEntityOptional.isPresent()){
            return especializacionEntityOptional.get();
        }
        return null;
    }
}
