package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "anamnesis_part")
public class AnamnesisPage {

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

    @Column(name = "risk")
    private String riskFactors;

    @Column(name = "record_date")
    private Date recordDate;

    @Column(name = "past_illnesses")
    private String pastIllnesses;

    @Column(name = "operations")
    private String operations;

    @Column(name = "heredity")
    private String heredity;

    @Column(name = "drug_allergy")
    private String drugAllergy;

    @Column(name = "harmful_and_hazardous_working_conditions")
    private String harmfulAndHazardousWorkingConditions;

    @Column(name = "brief_information_about_the_main_disease")
    private String briefInformationAboutTheMainDisease;

    @Column(name = "other_information")
    private String otherInformation;

    @Column(name = "date_of_registration_on_d")
    private Date dateOfRegistrationOnDispensaryGroup;

    @Column(name = "addition_to_anamnesis")
    private String additionToAnamnesis;

    public AnamnesisPage() {
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

    public User getMedicalWorker() {
        return medicalWorker;
    }

    public void setMedicalWorker(User medicalWorker) {
        this.medicalWorker = medicalWorker;
    }

    public String getRiskFactors() {
        return riskFactors;
    }

    public void setRiskFactors(String riskFactors) {
        this.riskFactors = riskFactors;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getPastIllnesses() {
        return pastIllnesses;
    }

    public void setPastIllnesses(String pastIllnesses) {
        this.pastIllnesses = pastIllnesses;
    }

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }

    public String getHeredity() {
        return heredity;
    }

    public void setHeredity(String heredity) {
        this.heredity = heredity;
    }

    public String getDrugAllergy() {
        return drugAllergy;
    }

    public void setDrugAllergy(String drugAllergy) {
        this.drugAllergy = drugAllergy;
    }

    public String getHarmfulAndHazardousWorkingConditions() {
        return harmfulAndHazardousWorkingConditions;
    }

    public void setHarmfulAndHazardousWorkingConditions(String harmfulAndHazardousWorkingConditions) {
        this.harmfulAndHazardousWorkingConditions = harmfulAndHazardousWorkingConditions;
    }

    public String getBriefInformationAboutTheMainDisease() {
        return briefInformationAboutTheMainDisease;
    }

    public void setBriefInformationAboutTheMainDisease(String briefInformationAboutTheMainDisease) {
        this.briefInformationAboutTheMainDisease = briefInformationAboutTheMainDisease;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    public Date getDateOfRegistrationOnDispensaryGroup() {
        return dateOfRegistrationOnDispensaryGroup;
    }

    public void setDateOfRegistrationOnDispensaryGroup(Date dateOfRegistrationOnDispensaryGroup) {
        this.dateOfRegistrationOnDispensaryGroup = dateOfRegistrationOnDispensaryGroup;
    }

    public String getAdditionToAnamnesis() {
        return additionToAnamnesis;
    }

    public void setAdditionToAnamnesis(String additionToAnamnesis) {
        this.additionToAnamnesis = additionToAnamnesis;
    }
}
