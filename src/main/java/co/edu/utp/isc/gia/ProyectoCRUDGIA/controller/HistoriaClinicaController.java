package co.edu.utp.isc.gia.ProyectoCRUDGIA.controller;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.HistoriaClinicaDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.HistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("historiaClinica")
public class HistoriaClinicaController {

    @Autowired
    private HistoriaClinicaService historiaClinicaService;

    @PostMapping("crearHisotriaClinica")
    public HistoriaClinicaDTO crearHistoriaClinica(@RequestBody HistoriaClinicaDTO historiaClinicaDTO){
        return historiaClinicaService.crearHistoriaClinica(historiaClinicaDTO);
    }
}
