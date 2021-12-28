package co.edu.utp.isc.gia.ProyectoCRUDGIA.repository;

import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PacienteEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PacienteRepository extends CrudRepository<PacienteEntity, Long> {

    Optional<PacienteEntity> findByCedula(String cedula);

    boolean existsByCedula(String cedula);
}
