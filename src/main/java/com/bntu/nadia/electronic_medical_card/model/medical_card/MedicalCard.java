package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.user.Patient;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "medical_card")
public class MedicalCard {//пропписать методы add +  переопределить equals,hashcode

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne(mappedBy = "medicalCard")
    private Patient patient;

    @OneToMany(mappedBy = "medical_card")
    private Set<AccountingTemporaryDisabilityPage> accountingTemporaryDisabilityPage;

    @OneToMany(mappedBy = "medical_card")
    private Set<AnamnesisPage> anamnesisPage;

    @OneToMany(mappedBy = "medical_card")
    private Set<DiagnosisPage> diagnosisPage;

    @OneToMany(mappedBy = "medical_card")
    private Set<GynecologicalExaminationPage> gynecologicalExaminationPage;

    @OneToOne(mappedBy = "medical_card")
    private PersonalPage personalPage;

    @OneToMany(mappedBy = "medical_card")
    private Set<PreventiveExaminationPage> preventiveExaminationPage;

    @OneToMany(mappedBy = "medical_card")
    private Set<RecordingMedicalExaminationPage> recordingMedicalExaminationPage;

    @OneToMany(mappedBy = "medical_card")
    private Set<VaccinationPage> vaccinationPage;

    @OneToMany(mappedBy = "medical_card")
    private Set<XRayExaminationPage> xRayExaminationPage;

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

    public Set<AccountingTemporaryDisabilityPage> getAccountingTemporaryDisabilityPage() {
        return accountingTemporaryDisabilityPage;
    }

    public void addAccountingTemporaryDisabilityPage(AccountingTemporaryDisabilityPage accountingTemporaryDisabilityPage) {

        if (this.accountingTemporaryDisabilityPage == null) {
            this.accountingTemporaryDisabilityPage = new HashSet<>();
        }

        this.accountingTemporaryDisabilityPage.add(accountingTemporaryDisabilityPage);
    }

    public void setAccountingTemporaryDisabilityPage(Set<AccountingTemporaryDisabilityPage> accountingTemporaryDisabilityPage) {
        this.accountingTemporaryDisabilityPage = accountingTemporaryDisabilityPage;
    }

    public Set<AnamnesisPage> getAnamnesisPage() {
        return anamnesisPage;
    }

    public void setAnamnesisPage(Set<AnamnesisPage> anamnesisPage) {
        this.anamnesisPage = anamnesisPage;
    }

    public Set<DiagnosisPage> getDiagnosisPage() {
        return diagnosisPage;
    }

    public void setDiagnosisPage(Set<DiagnosisPage> diagnosisPage) {
        this.diagnosisPage = diagnosisPage;
    }

    public Set<GynecologicalExaminationPage> getGynecologicalExaminationPage() {
        return gynecologicalExaminationPage;
    }

    public void setGynecologicalExaminationPage(Set<GynecologicalExaminationPage> gynecologicalExaminationPage) {
        this.gynecologicalExaminationPage = gynecologicalExaminationPage;
    }

    public PersonalPage getPersonalPage() {
        return personalPage;
    }

    public void setPersonalPage(PersonalPage personalPage) {
        this.personalPage = personalPage;
    }

    public Set<PreventiveExaminationPage> getPreventiveExaminationPage() {
        return preventiveExaminationPage;
    }

    public void setPreventiveExaminationPage(Set<PreventiveExaminationPage> preventiveExaminationPage) {
        this.preventiveExaminationPage = preventiveExaminationPage;
    }

    public Set<RecordingMedicalExaminationPage> getRecordingMedicalExaminationPage() {
        return recordingMedicalExaminationPage;
    }

    public void setRecordingMedicalExaminationPage(Set<RecordingMedicalExaminationPage> recordingMedicalExaminationPage) {
        this.recordingMedicalExaminationPage = recordingMedicalExaminationPage;
    }

    public Set<VaccinationPage> getVaccinationPage() {
        return vaccinationPage;
    }

    public void setVaccinationPage(Set<VaccinationPage> vaccinationPage) {
        this.vaccinationPage = vaccinationPage;
    }

    public Set<XRayExaminationPage> getXRayExaminationPage() {
        return xRayExaminationPage;
    }

    public void setXRayExaminationPage(Set<XRayExaminationPage> xRayExaminationPage) {
        this.xRayExaminationPage = xRayExaminationPage;
    }
}
