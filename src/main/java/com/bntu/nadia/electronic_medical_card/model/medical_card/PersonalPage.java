package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.added.Address;
import com.bntu.nadia.electronic_medical_card.model.medical_card.added.DispensaryGroup;
import com.bntu.nadia.electronic_medical_card.model.medical_card.added.Gender;
import com.bntu.nadia.electronic_medical_card.model.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "personal_part")
public class PersonalPage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medical_card_id", referencedColumnName = "id")
    private MedicalCard medicalCard;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "gender")
    private Gender gender;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address homeAddress;

    @Column(name = "work_place")
    private String workPlace;

    @Column(name = "position")
    private String position;

    @Column(name = "dispensary_observation_group")
    private DispensaryGroup dispensaryGroup;

    @Column(name = "disease")
    private String disease;

    @Column(name = "information_about_burdened_allergic_anamnesis")
    private String burdenedAllergicAnamnesis;

    @Column(name = "information_about_transferred_viral_hepatitis")
    private String transferredViralHepatitis;

    @Column(name = "elderly_and_senile_people_living_alone")
    private boolean elderlyAndSenilePeopleLivingAlone;

    @Column(name = "privileged_group")
    private String privilegedGroup;

    @OneToOne
    @JoinColumn(name = "observing_person_id", referencedColumnName = "id")
    private User observingPerson;

    public PersonalPage() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public DispensaryGroup getDispensaryGroup() {
        return dispensaryGroup;
    }

    public void setDispensaryGroup(DispensaryGroup dispensaryGroup) {
        this.dispensaryGroup = dispensaryGroup;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getBurdenedAllergicAnamnesis() {
        return burdenedAllergicAnamnesis;
    }

    public void setBurdenedAllergicAnamnesis(String burdenedAllergicAnamnesis) {
        this.burdenedAllergicAnamnesis = burdenedAllergicAnamnesis;
    }

    public String getTransferredViralHepatitis() {
        return transferredViralHepatitis;
    }

    public void setTransferredViralHepatitis(String transferredViralHepatitis) {
        this.transferredViralHepatitis = transferredViralHepatitis;
    }

    public boolean isElderlyAndSenilePeopleLivingAlone() {
        return elderlyAndSenilePeopleLivingAlone;
    }

    public void setElderlyAndSenilePeopleLivingAlone(boolean elderlyAndSenilePeopleLivingAlone) {
        this.elderlyAndSenilePeopleLivingAlone = elderlyAndSenilePeopleLivingAlone;
    }

    public String getPrivilegedGroup() {
        return privilegedGroup;
    }

    public void setPrivilegedGroup(String privilegedGroup) {
        this.privilegedGroup = privilegedGroup;
    }

    public User getObservingPerson() {
        return observingPerson;
    }

    public void setObservingPerson(User observingPerson) {
        this.observingPerson = observingPerson;
    }
}
