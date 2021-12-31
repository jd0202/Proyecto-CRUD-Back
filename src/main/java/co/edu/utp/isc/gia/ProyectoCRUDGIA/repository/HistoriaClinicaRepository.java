package co.edu.utp.isc.gia.ProyectoCRUDGIA.repository;


import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.HistoriaClinicaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HistoriaClinicaRepository extends CrudRepository<HistoriaClinicaEntity, Long> {
    List<HistoriaClinicaEntity> findByCedula(Long id);
}
