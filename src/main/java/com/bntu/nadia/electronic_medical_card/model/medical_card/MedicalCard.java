package com.bntu.nadia.electronic_medical_card.model.medical_card;

public class MedicalCard {

    private AccountingTemporaryDisabilityPage accountingTemporaryDisabilityPage;
    private AnamnesisPage anamnesisPage;
    private DiagnosisPage diagnosisPage;
    private GynecologicalExaminationPage gynecologicalExaminationPage;
    private PersonalPage personalPage;
    private PreventiveExaminationPage preventiveExaminationPage;
    private RecordingMedicalExaminationPage recordingMedicalExaminationPage;
    private XRayExaminationPage xRayExaminationPage;

    public MedicalCard(){}

    public AccountingTemporaryDisabilityPage getAccountingTemporaryDisabilityPage() {
        return accountingTemporaryDisabilityPage;
    }

    public void setAccountingTemporaryDisabilityPage(AccountingTemporaryDisabilityPage accountingTemporaryDisabilityPage) {
        this.accountingTemporaryDisabilityPage = accountingTemporaryDisabilityPage;
    }

    public AnamnesisPage getAnamnesisPage() {
        return anamnesisPage;
    }

    public void setAnamnesisPage(AnamnesisPage anamnesisPage) {
        this.anamnesisPage = anamnesisPage;
    }

    public DiagnosisPage getDiagnosisPage() {
        return diagnosisPage;
    }

    public void setDiagnosisPage(DiagnosisPage diagnosisPage) {
        this.diagnosisPage = diagnosisPage;
    }

    public GynecologicalExaminationPage getGynecologicalExaminationPage() {
        return gynecologicalExaminationPage;
    }

    public void setGynecologicalExaminationPage(GynecologicalExaminationPage gynecologicalExaminationPage) {
        this.gynecologicalExaminationPage = gynecologicalExaminationPage;
    }

    public PersonalPage getPersonalPage() {
        return personalPage;
    }

    public void setPersonalPage(PersonalPage personalPage) {
        this.personalPage = personalPage;
    }

    public PreventiveExaminationPage getPreventiveExaminationPage() {
        return preventiveExaminationPage;
    }

    public void setPreventiveExaminationPage(PreventiveExaminationPage preventiveExaminationPage) {
        this.preventiveExaminationPage = preventiveExaminationPage;
    }

    public RecordingMedicalExaminationPage getRecordingMedicalExaminationPage() {
        return recordingMedicalExaminationPage;
    }

    public void setRecordingMedicalExaminationPage(RecordingMedicalExaminationPage recordingMedicalExaminationPage) {
        this.recordingMedicalExaminationPage = recordingMedicalExaminationPage;
    }

    public XRayExaminationPage getXRayExaminationPage() {
        return xRayExaminationPage;
    }

    public void setXRayExaminationPage(XRayExaminationPage xRayExaminationPage) {
        this.xRayExaminationPage = xRayExaminationPage;
    }
}
