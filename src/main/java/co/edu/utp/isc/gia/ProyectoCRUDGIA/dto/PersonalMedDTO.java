package co.edu.utp.isc.gia.ProyectoCRUDGIA.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalMedDTO implements Serializable {
    private Long id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
}
