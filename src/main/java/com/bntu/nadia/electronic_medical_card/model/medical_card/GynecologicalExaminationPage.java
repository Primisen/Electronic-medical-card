package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.user.MedicalWorker;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gynecological_examination_part")
public class GynecologicalExaminationPage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medical_card_id", referencedColumnName = "id")
    private MedicalCard medicalCard;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "health_worker_id", referencedColumnName = "id")
    private MedicalWorker medicalWorker;

    @Column(name = "record_date")
    private Date recordDate;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "cytology")
    private String cytology;

    public GynecologicalExaminationPage() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }

    public MedicalWorker getMedicalWorker() {
        return medicalWorker;
    }

    public void setMedicalWorker(MedicalWorker medicalWorker) {
        this.medicalWorker = medicalWorker;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getCytology() {
        return cytology;
    }

    public void setCytology(String cytology) {
        this.cytology = cytology;
    }
}
