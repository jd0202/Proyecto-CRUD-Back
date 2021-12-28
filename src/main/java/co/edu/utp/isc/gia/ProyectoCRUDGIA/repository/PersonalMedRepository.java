package co.edu.utp.isc.gia.ProyectoCRUDGIA.repository;


import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PersonalMedRepository extends CrudRepository<PersonalMedEntity, Long>{

    boolean existsByCedula(String cedula);

    Optional<PersonalMedEntity> findByCedula(String cedula);
}
