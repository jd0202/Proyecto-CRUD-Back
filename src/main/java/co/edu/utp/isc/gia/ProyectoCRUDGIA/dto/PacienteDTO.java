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
    private String tipoDocumento;
    private String cedula;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    private String estadoCivil;
    private String grupoSanguineo;
    private Date fechaNacimiento;
    private String lugarNacimiento;
    private String religion;
    private String etnia;
    private String tipoPoblacionEspecial;
    private String ocupacion;
    private String identidadGenero;
    private String sexo;

    private Long personalMedId;
}
