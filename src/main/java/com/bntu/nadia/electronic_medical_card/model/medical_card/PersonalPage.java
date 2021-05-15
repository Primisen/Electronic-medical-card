package com.bntu.nadia.electronic_medical_card.model.medical_card;

import com.bntu.nadia.electronic_medical_card.model.medical_card.added.Address;
import com.bntu.nadia.electronic_medical_card.model.medical_card.added.DispensaryObservationGroup;
import com.bntu.nadia.electronic_medical_card.model.medical_card.added.PhoneNumber;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "personal_part")
public class PersonalPage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne(mappedBy = "personalPage")
    private MedicalCard medicalCard;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private Calendar dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(mappedBy = "personalPage")
    private List<PhoneNumber> phoneNumbers;

    @Column(name = "work_place")
    private String workPlace;

    @Column(name = "position")
    private String position;

    @OneToMany(mappedBy = "personalPage")
    private List<DispensaryObservationGroup> dispensaryObservationGroup;

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

//    @OneToOne
//    @JoinColumn(name = "observing_person", referencedColumnName = "id")
    @Column(name = "observing_person")
    private String observingPersonData;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        if (phoneNumbers == null) {
            phoneNumbers = new ArrayList<>();
        }
        phoneNumbers.add(phoneNumber);
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

    public List<DispensaryObservationGroup> getDispensaryObservationGroup() {
        return dispensaryObservationGroup;
    }

    public void setDispensaryObservationGroup(List<DispensaryObservationGroup> dispensaryObservationGroup) {
        this.dispensaryObservationGroup = dispensaryObservationGroup;
    }

    public void addDispensaryObservationGroup(DispensaryObservationGroup dispensaryObservationGroup) {

        if (this.dispensaryObservationGroup == null) {
            this.dispensaryObservationGroup = new ArrayList<>();
        }

        this.dispensaryObservationGroup.add(dispensaryObservationGroup);
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

    public String getObservingPersonData() {
        return observingPersonData;
    }

    public void setObservingPersonData(String observingPersonData) {
        this.observingPersonData = observingPersonData;
    }
}
