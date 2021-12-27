package co.edu.utp.isc.gia.ProyectoCRUDGIA.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoriaClinicaDTO implements Serializable {
    private Long id;
    private String cedula;
    private Date fechaIngreso;
    private Date fechaSalida;
    private String tipoConsulta;
    //anamnesis
    private String motivoConsulta;
    private String enfermedadActual;

    private String antecedentes;
    //hospitalarios, patologicos, farmacologicos, alergicos, familiares, habitos, otros

    private String revisionDeSistemas;

    //cabezaCuello, cardiopulmonar, gastrointestinal, genitourinario, osteomuscular,
    //vascularPeriferico, pielYFaneras, hematopoyetico, endocrino, neurologico

    private String examenFisico;
    //cabeza, organosDeLosSentidos, cuello, corazon, pulmones, abdomen, extremidades,

    private String diagnostico;

    private String tratamientoMedico;
}
