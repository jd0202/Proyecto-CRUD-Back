package co.edu.utp.isc.gia.ProyectoCRUDGIA.repository;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.dto.HistoriaClinicaDTO;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.HistoriaClinicaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HistoriaClinicaRepository extends CrudRepository<HistoriaClinicaEntity, Long> {
    List<HistoriaClinicaEntity> findByPaciente_Id(Long id);
}
