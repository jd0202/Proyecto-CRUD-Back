package co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecializacionDTO;
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
    public EspecializacionDTO crearEspecializacion(EspecializacionDTO especializacionDTO) {
        if(!especializacionDTO.equals(null) && especializacionDTO != null){
            EspecializacionEntity especializacionEntity = modelMapper.map(especializacionDTO,
                    EspecializacionEntity.class);
            return modelMapper.map(this.especializacionRepository.save(especializacionEntity),
                    EspecializacionDTO.class);
        }else {
            return null;
        }
    }

    @Override
    public EspecializacionDTO obtenerEspecializacionPorId(Long especializacionId) {
        Optional<EspecializacionEntity> especializacionEntityOptional =
                especializacionRepository.findById(especializacionId);
        if (especializacionEntityOptional.isPresent()){
            return modelMapper.map(especializacionEntityOptional.get(),EspecializacionDTO.class) ;
        }
        return null;
    }

    @Override
    public String borrarEspecializacion(Long id) {
        if(obtenerEspecializacionPorId(id) != null){
            this.especializacionRepository.deleteById(id);
            return  "user delete";
        } else {
            return null;
        }
    }

    @Override
    public EspecializacionDTO editarEspecializacion(EspecializacionDTO especializacionDTO) {
        if(!especializacionDTO.equals(null) && especializacionDTO != null){
            if (obtenerEspecializacionPorId(especializacionDTO.getId()) != null){
                EspecializacionEntity especializacionEntity =
                        modelMapper.map(especializacionDTO,EspecializacionEntity.class);
                return modelMapper.map(this.especializacionRepository.save(especializacionEntity), EspecializacionDTO.class);
            }else {
                return null;
            }
        } else {
            return null;
        }
    }
}
