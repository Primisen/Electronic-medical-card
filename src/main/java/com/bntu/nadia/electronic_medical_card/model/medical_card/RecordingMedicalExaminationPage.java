package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.user.MedicalWorker;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "recording_medical_examination_part")
public class RecordingMedicalExaminationPage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medical_card_id", referencedColumnName = "id")
    private MedicalCard medicalCard;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receiving_doctor_id", referencedColumnName = "id")
    private MedicalWorker receivingDoctor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "treatment_doctor_id", referencedColumnName = "id")
    private MedicalWorker treatmentDoctor;

    @Column(name = "record_date")
    private Date recordDate;

    @Column(name = "complaints")
    private String complaints;

    @Column(name = "objectively")
    private String objectively;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "survey_plan")
    private String survey_plan;

    @Column(name = "treatment")
    private String treatment;

    @Column(name = "pulse")
    private String pulse;

    @Column(name = "heart_rate")
    private String heartRate;

    @Column(name = "bh")
    private String bh;

    @Column(name = "ad")
    private String ad;

    public RecordingMedicalExaminationPage() {}

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

    public MedicalWorker getReceivingDoctor() {
        return receivingDoctor;
    }

    public void setReceivingDoctor(MedicalWorker receivingDoctor) {
        this.receivingDoctor = receivingDoctor;
    }

    public MedicalWorker getTreatmentDoctor() {
        return treatmentDoctor;
    }

    public void setTreatmentDoctor(MedicalWorker treatmentDoctor) {
        this.treatmentDoctor = treatmentDoctor;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public String getObjectively() {
        return objectively;
    }

    public void setObjectively(String objectively) {
        this.objectively = objectively;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSurvey_plan() {
        return survey_plan;
    }

    public void setSurvey_plan(String survey_plan) {
        this.survey_plan = survey_plan;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
