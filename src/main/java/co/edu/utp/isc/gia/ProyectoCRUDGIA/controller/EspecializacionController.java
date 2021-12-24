package co.edu.utp.isc.gia.ProyectoCRUDGIA.controller;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecialziacionDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.EspecializacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("especializacion")
public class EspecializacionController {

    @Autowired
    private EspecializacionService especializacionService;

    @PostMapping("crearEspecializacion")
    public EspecialziacionDTO crearEspecializacion(@RequestBody EspecialziacionDTO especialziacionDTO){
        return especializacionService.crearEspecializacion(especialziacionDTO);
    }
}
