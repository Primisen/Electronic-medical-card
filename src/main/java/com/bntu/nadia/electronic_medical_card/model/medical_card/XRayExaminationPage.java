package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.user.MedicalWorker;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "xray_examination_part")
public class XRayExaminationPage {

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

    @Column(name = "type_of_research")
    private String typeOfResearch;

    @Column(name = "dose")
    private String dose;

    public XRayExaminationPage() {}

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

    public String getTypeOfResearch() {
        return typeOfResearch;
    }

    public void setTypeOfResearch(String typeOfResearch) {
        this.typeOfResearch = typeOfResearch;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }
}
