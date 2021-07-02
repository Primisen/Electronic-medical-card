package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vaccination_part")
public class VaccinationPage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medical_card_id", referencedColumnName = "id")
    private MedicalCard medicalCard;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "health_worker_id", referencedColumnName = "id")
    private User medicalWorker;

    @Column(name = "record_date")
    private Date recordDate;

    @Column(name = "vaccination_name")
    private String vaccinationName;

    @Column(name = "dose")
    private String dose;

    @Column(name = "name_of_drug")
    private String drugName;

    @Column(name = "series")
    private String series;

    @Column(name = "local_reaction")
    private String localReaction;

    @Column(name = "general_reaction")
    private String generalReaction;

    public VaccinationPage() {}

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

    public User getMedicalWorker() {
        return medicalWorker;
    }

    public void setMedicalWorker(User medicalWorker) {
        this.medicalWorker = medicalWorker;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getVaccinationName() {
        return vaccinationName;
    }

    public void setVaccinationName(String vaccinationName) {
        this.vaccinationName = vaccinationName;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getLocalReaction() {
        return localReaction;
    }

    public void setLocalReaction(String localReaction) {
        this.localReaction = localReaction;
    }

    public String getGeneralReaction() {
        return generalReaction;
    }

    public void setGeneralReaction(String generalReaction) {
        this.generalReaction = generalReaction;
    }
}
