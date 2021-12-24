package co.edu.utp.isc.gia.ProyectoCRUDGIA.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacienteDTO implements Serializable {
    private Long id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String estado;
    private Date fechaNaciemiento;
    private String sexo;
}
