package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.added.Questionnaire;
import com.bntu.nadia.electronic_medical_card.model.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "preventive_examination_part")
public class PreventiveExaminationPage {

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "questionnaire_id")
    private Questionnaire questionnaire;

    @Column(name = "record_date")
    private Date recordDate;

    @Column(name = "leather")
    private String leather;

    @Column(name = "lip")
    private String lip;

    @Column(name = "tongue_and_oral_mucosa")
    private String tongueAndOralMucosa;

    @Column(name = "esophagus")
    private String esophagus;

    @Column(name = "stomach")
    private String stomach;

    @Column(name = "rectum")
    private String rectum;

    @Column(name = "lungs")
    private String lungs;

    @Column(name = "breast")
    private String breast;

    @Column(name = "uterus")
    private String uterus;

    @Column(name = "other")
    private String other;

    public PreventiveExaminationPage(){}

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

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getLeather() {
        return leather;
    }

    public void setLeather(String leather) {
        this.leather = leather;
    }

    public String getLip() {
        return lip;
    }

    public void setLip(String lip) {
        this.lip = lip;
    }

    public String getTongueAndOralMucosa() {
        return tongueAndOralMucosa;
    }

    public void setTongueAndOralMucosa(String tongueAndOralMucosa) {
        this.tongueAndOralMucosa = tongueAndOralMucosa;
    }

    public String getEsophagus() {
        return esophagus;
    }

    public void setEsophagus(String esophagus) {
        this.esophagus = esophagus;
    }

    public String getStomach() {
        return stomach;
    }

    public void setStomach(String stomach) {
        this.stomach = stomach;
    }

    public String getRectum() {
        return rectum;
    }

    public void setRectum(String rectum) {
        this.rectum = rectum;
    }

    public String getLungs() {
        return lungs;
    }

    public void setLungs(String lungs) {
        this.lungs = lungs;
    }

    public String getBreast() {
        return breast;
    }

    public void setBreast(String breast) {
        this.breast = breast;
    }

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
