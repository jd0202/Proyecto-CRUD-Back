package co.edu.utp.isc.gia.ProyectoCRUDGIA.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PERSONALMED")
public class PersonalMedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
}