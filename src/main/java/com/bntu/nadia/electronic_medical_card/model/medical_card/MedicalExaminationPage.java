package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "recording_medical_examination_part")
public class MedicalExaminationPage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medical_card_id", referencedColumnName = "id")
    private MedicalCard medicalCard;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receiving_doctor_id", referencedColumnName = "id")
    private User receivingDoctor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "treatment_doctor_id", referencedColumnName = "id")
    private User treatmentDoctor;

    @Column(name = "record_date")
    private Date recordDate;

    @Column(name = "complaints")
    private String complaints;

    @Column(name = "objectively")
    private String objectively;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "survey_plan")
    private String surveyPlan;

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

    public MedicalExaminationPage() {}

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

    public User getReceivingDoctor() {
        return receivingDoctor;
    }

    public void setReceivingDoctor(User receivingDoctor) {
        this.receivingDoctor = receivingDoctor;
    }

    public User getTreatmentDoctor() {
        return treatmentDoctor;
    }

    public void setTreatmentDoctor(User treatmentDoctor) {
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

    public String getSurveyPlan() {
        return surveyPlan;
    }

    public void setSurveyPlan(String surveyPlan) {
        this.surveyPlan = surveyPlan;
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
