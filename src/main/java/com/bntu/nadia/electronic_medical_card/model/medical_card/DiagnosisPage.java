package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.user.MedicalWorker;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "diagnosis_part")
public class DiagnosisPage {

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

    @Column(name = "diagnosis_name")
    private String diagnosisName;

    @Column(name = "newly_diagnosed")
    private String newlyDiagnosed;

    public DiagnosisPage() {
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

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public String getNewlyDiagnosed() {
        return newlyDiagnosed;
    }

    public void setNewlyDiagnosed(String newlyDiagnosed) {
        this.newlyDiagnosed = newlyDiagnosed;
    }
}
