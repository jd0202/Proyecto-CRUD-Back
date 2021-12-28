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
@Table(name = "HISTORIACLINICA")
public class HistoriaClinicaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_Id", foreignKey = @ForeignKey(name = "paciente_Id"))
    private PacienteEntity pacienteEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personalMed_Id", foreignKey = @ForeignKey(name = "personalMed_Id"))
    private PersonalMedEntity personalMedEntity;

    /*
    id_paciente
    id_medico
    generar historia
     */
}
