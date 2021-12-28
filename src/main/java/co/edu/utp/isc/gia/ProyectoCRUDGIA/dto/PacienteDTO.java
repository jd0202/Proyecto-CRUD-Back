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
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String estadoCivil;
    private String grupoSanguinop;
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
