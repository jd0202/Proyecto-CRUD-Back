package co.edu.utp.isc.gia.ProyectoCRUDGIA.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PACIENTE")
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personalMedId", foreignKey = @ForeignKey(name = "personalMedId"))
    private PersonalMedEntity personalMedEntity;
}
