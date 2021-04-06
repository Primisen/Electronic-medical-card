package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.user.Patient;

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

    @OneToOne(mappedBy = "medicalCard")
    private Patient patient;

    @OneToMany(mappedBy = "medical_card")
    private List<AccountingTemporaryDisabilityPage> accountingTemporaryDisabilityPage;

    @OneToMany(mappedBy = "medical_card")
    private List<AnamnesisPage> anamnesisPage;

    @OneToMany(mappedBy = "medical_card")
    private List<DiagnosisPage> diagnosisPage;

    @OneToMany(mappedBy = "medical_card")
    private List<GynecologicalExaminationPage> gynecologicalExaminationPage;

    @OneToOne(mappedBy = "medical_card")
    private PersonalPage personalPage;

    @OneToMany(mappedBy = "medical_card")
    private List<PreventiveExaminationPage> preventiveExaminationPage;

    @OneToMany(mappedBy = "medical_card")
    private List<RecordingMedicalExaminationPage> recordingMedicalExaminationPage;

    @OneToMany(mappedBy = "medical_card")
    private List<VaccinationPage> vaccinationPage;

    @OneToMany(mappedBy = "medical_card")
    private List<XRayExaminationPage> xRayExaminationPage;

    public MedicalCard() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<AccountingTemporaryDisabilityPage> getAccountingTemporaryDisabilityPage() {
        return accountingTemporaryDisabilityPage;
    }

    public void setAccountingTemporaryDisabilityPage(List<AccountingTemporaryDisabilityPage> accountingTemporaryDisabilityPage) {
        this.accountingTemporaryDisabilityPage = accountingTemporaryDisabilityPage;
    }

    public void addAccountingTemporaryDisabilityPage(AccountingTemporaryDisabilityPage accountingTemporaryDisabilityPage) {

        if (this.accountingTemporaryDisabilityPage == null) {
            this.accountingTemporaryDisabilityPage = new ArrayList<>();
        }

        this.accountingTemporaryDisabilityPage.add(accountingTemporaryDisabilityPage);
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

    public List<GynecologicalExaminationPage> getGynecologicalExaminationPage() {
        return gynecologicalExaminationPage;
    }

    public void setGynecologicalExaminationPage(List<GynecologicalExaminationPage> gynecologicalExaminationPage) {
        this.gynecologicalExaminationPage = gynecologicalExaminationPage;
    }

    public void addGynecologicalExaminationPage(GynecologicalExaminationPage gynecologicalExaminationPage) {

        if (this.gynecologicalExaminationPage == null) {
            this.gynecologicalExaminationPage = new ArrayList<>();
        }

        this.gynecologicalExaminationPage.add(gynecologicalExaminationPage);
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

    public List<RecordingMedicalExaminationPage> getRecordingMedicalExaminationPage() {
        return recordingMedicalExaminationPage;
    }

    public void setRecordingMedicalExaminationPage(List<RecordingMedicalExaminationPage> recordingMedicalExaminationPage) {
        this.recordingMedicalExaminationPage = recordingMedicalExaminationPage;
    }

    public void addRecordingMedicalExaminationPage(RecordingMedicalExaminationPage recordingMedicalExaminationPage) {

        if (this.recordingMedicalExaminationPage == null) {
            this.recordingMedicalExaminationPage = new ArrayList<>();
        }

        this.recordingMedicalExaminationPage.add(recordingMedicalExaminationPage);
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

    public List<XRayExaminationPage> getXRayExaminationPage() {
        return xRayExaminationPage;
    }

    public void setXRayExaminationPage(List<XRayExaminationPage> xRayExaminationPage) {
        this.xRayExaminationPage = xRayExaminationPage;
    }

    public void addXRayExaminationPage(XRayExaminationPage xRayExaminationPage) {

        if (this.xRayExaminationPage == null) {
            this.xRayExaminationPage = new ArrayList<>();
        }

        this.xRayExaminationPage.add(xRayExaminationPage);
    }
}
