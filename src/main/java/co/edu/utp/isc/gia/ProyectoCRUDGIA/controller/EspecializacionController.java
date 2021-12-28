package co.edu.utp.isc.gia.ProyectoCRUDGIA.controller;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.EspecializacionDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.EspecializacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("especializacion")
public class EspecializacionController {

    @Autowired
    private EspecializacionService especializacionService;

    @PostMapping("crearEspecializacion")
    public EspecializacionDTO crearEspecializacion(@RequestBody EspecializacionDTO especialziacionDTO){
        return especializacionService.crearEspecializacion(especialziacionDTO);
    }

    @DeleteMapping("borrarEspecializacion")
    public String borrarEspecializacion(@RequestParam Long id){
        return especializacionService.borrarEspecializacion(id);
    }

    @GetMapping("obtenerEspecializacionPorId")
    public EspecializacionDTO obtenerEspecializacionPorId(@RequestParam Long id){
        return especializacionService.obtenerEspecializacionPorId(id);
    }

    @PutMapping("editarEspecializacion")
    public EspecializacionDTO editarEspecializacion(@RequestBody EspecializacionDTO especializacionDTO){
        return  especializacionService.editarEspecializacion(especializacionDTO);
    }
}
