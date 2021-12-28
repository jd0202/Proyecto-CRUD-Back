package co.edu.utp.isc.gia.ProyectoCRUDGIA.controller;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.HistoriaClinicaDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.HistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("historiaClinica")
public class HistoriaClinicaController {

    @Autowired
    private HistoriaClinicaService historiaClinicaService;

    @PostMapping("crearHistoriaClinica")
    public HistoriaClinicaDTO crearHistoriaClinica(@RequestBody HistoriaClinicaDTO historiaClinicaDTO){
        return historiaClinicaService.crearHistoriaClinica(historiaClinicaDTO);
    }

    @GetMapping("obtenerHistoriaClinicaPorCedula")
    public List<HistoriaClinicaDTO> obtenerHistoriaClinicaPorCedula(@RequestParam String cedula){
        return historiaClinicaService.obtenerHistoriaClinicaPorCedula(cedula);
    }

    @GetMapping("obtenerHistoriaClinicaPorId")
    public HistoriaClinicaDTO obtenerHistoriaClinicaPorId(@RequestParam Long id){
        return historiaClinicaService.obtenerHistoriaClinicaPorId(id);
    }

    @PutMapping("editarHistoriaClinica")
    public HistoriaClinicaDTO editarHistoriaClinica(@RequestBody HistoriaClinicaDTO historiaClinicaDTO){
        return historiaClinicaService.editarHistoriaClinica(historiaClinicaDTO);
    }

    @DeleteMapping("borrarHistoriaClinica")
    public String borrarHistoriaClinica(@RequestParam Long id){
        return historiaClinicaService.borrarHistoriaClinica(id);
    }
}
