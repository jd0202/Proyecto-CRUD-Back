package co.edu.utp.isc.gia.ProyectoCRUDGIA.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalMedDTO implements Serializable {
    private Long id;
    private String cedula;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private Date fechaNacimiento;
    private Long especializacionId;
}
