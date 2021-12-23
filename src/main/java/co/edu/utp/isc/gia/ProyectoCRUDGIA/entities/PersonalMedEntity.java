package co.edu.utp.isc.gia.ProyectoCRUDGIA.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PERSONALMED")
public class PersonalMedEntity {
    @Id

    private Long cedula;
    private String nombre;
    private String apellido;
    private String telefono;
}