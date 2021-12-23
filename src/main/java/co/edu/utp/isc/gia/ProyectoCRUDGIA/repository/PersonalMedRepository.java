package co.edu.utp.isc.gia.ProyectoCRUDGIA.repository;


import co.edu.utp.isc.gia.ProyectoCRUDGIA.entities.PersonalMedEntity;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl.PersonalMedImpl;
import org.springframework.data.repository.CrudRepository;

public interface PersonalMedRepository extends CrudRepository<PersonalMedEntity, Long>{

}
