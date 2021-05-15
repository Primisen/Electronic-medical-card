package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "medical_card")
public class MedicalCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User patient;

    @OneToMany(mappedBy = "medicalCard")
    private List<TemporaryDisabilityPage> temporaryDisabilityPage;

    @OneToMany(mappedBy = "medicalCard")
    private List<AnamnesisPage> anamnesisPage;

    @OneToMany(mappedBy = "medicalCard")
    private List<DiagnosisPage> diagnosisPage;

    @OneToMany(mappedBy = "medicalCard")
    private List<GynecologicalPage> gynecologicalPage;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "personal_part_id", referencedColumnName = "id")
    private PersonalPage personalPage;

    @OneToMany(mappedBy = "medicalCard")
    private List<PreventiveExaminationPage> preventiveExaminationPage;

    @OneToMany(mappedBy = "medicalCard")
    private List<MedicalExaminationPage> medicalExaminationPage;

    @OneToMany(mappedBy = "medicalCard")
    private List<VaccinationPage> vaccinationPage;

    @OneToMany(mappedBy = "medicalCard")
    private List<XRayPage> xRayPage;

    public MedicalCard() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }

    public List<TemporaryDisabilityPage> getAccountingTemporaryDisabilityPage() {
        return temporaryDisabilityPage;
    }

    public void setAccountingTemporaryDisabilityPage(List<TemporaryDisabilityPage> temporaryDisabilityPage) {
        this.temporaryDisabilityPage = temporaryDisabilityPage;
    }

    public void addAccountingTemporaryDisabilityPage(TemporaryDisabilityPage temporaryDisabilityPage) {

        if (this.temporaryDisabilityPage == null) {
            this.temporaryDisabilityPage = new ArrayList<>();
        }

        this.temporaryDisabilityPage.add(temporaryDisabilityPage);
    }

    public List<AnamnesisPage> getAnamnesisPage() {
        return anamnesisPage;
    }

    public void setAnamnesisPage(List<AnamnesisPage> anamnesisPage) {
        this.anamnesisPage = anamnesisPage;
    }

    public void addAnamnesisPage(AnamnesisPage anamnesisPage) {

        if (this.anamnesisPage == null) {
            this.anamnesisPage = new ArrayList<>();
        }

        this.anamnesisPage.add(anamnesisPage);
    }

    public List<DiagnosisPage> getDiagnosisPage() {
        return diagnosisPage;
    }

    public void setDiagnosisPage(List<DiagnosisPage> diagnosisPage) {
        this.diagnosisPage = diagnosisPage;
    }

    public void addDiagnosisPage(DiagnosisPage diagnosisPage) {

        if (this.diagnosisPage == null) {
            this.diagnosisPage = new ArrayList<>();
        }

        this.diagnosisPage.add(diagnosisPage);
    }

    public List<GynecologicalPage> getGynecologicalExaminationPage() {
        return gynecologicalPage;
    }

    public void setGynecologicalExaminationPage(List<GynecologicalPage> gynecologicalPage) {
        this.gynecologicalPage = gynecologicalPage;
    }

    public void addGynecologicalExaminationPage(GynecologicalPage gynecologicalPage) {

        if (this.gynecologicalPage == null) {
            this.gynecologicalPage = new ArrayList<>();
        }

        this.gynecologicalPage.add(gynecologicalPage);
    }

    public PersonalPage getPersonalPage() {
        return personalPage;
    }

    public void setPersonalPage(PersonalPage personalPage) {
        this.personalPage = personalPage;
    }

    public List<PreventiveExaminationPage> getPreventiveExaminationPage() {
        return preventiveExaminationPage;
    }

    public void setPreventiveExaminationPage(List<PreventiveExaminationPage> preventiveExaminationPage) {
        this.preventiveExaminationPage = preventiveExaminationPage;
    }

    public void addPreventiveExaminationPage(PreventiveExaminationPage preventiveExaminationPage) {

        if (this.preventiveExaminationPage == null) {
            this.preventiveExaminationPage = new ArrayList<>();
        }

        this.preventiveExaminationPage.add(preventiveExaminationPage);
    }

    public List<MedicalExaminationPage> getRecordingMedicalExaminationPage() {
        return medicalExaminationPage;
    }

    public void setRecordingMedicalExaminationPage(List<MedicalExaminationPage> medicalExaminationPage) {
        this.medicalExaminationPage = medicalExaminationPage;
    }

    public void addRecordingMedicalExaminationPage(MedicalExaminationPage medicalExaminationPage) {

        if (this.medicalExaminationPage == null) {
            this.medicalExaminationPage = new ArrayList<>();
        }

        this.medicalExaminationPage.add(medicalExaminationPage);
    }

    public List<VaccinationPage> getVaccinationPage() {
        return vaccinationPage;
    }

    public void setVaccinationPage(List<VaccinationPage> vaccinationPage) {
        this.vaccinationPage = vaccinationPage;
    }

    public void addVaccinationPage(VaccinationPage vaccinationPage) {

        if (this.vaccinationPage == null) {
            this.vaccinationPage = new ArrayList<>();
        }

        this.vaccinationPage.add(vaccinationPage);
    }

    public List<XRayPage> getXRayExaminationPage() {
        return xRayPage;
    }

    public void setXRayExaminationPage(List<XRayPage> xRayPage) {
        this.xRayPage = xRayPage;
    }

    public void addXRayExaminationPage(XRayPage xRayPage) {

        if (this.xRayPage == null) {
            this.xRayPage = new ArrayList<>();
        }

        this.xRayPage.add(xRayPage);
    }
}
