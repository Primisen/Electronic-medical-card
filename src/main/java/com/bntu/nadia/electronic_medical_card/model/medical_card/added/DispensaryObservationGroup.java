package com.bntu.nadia.electronic_medical_card.model.medical_card.added;

import com.bntu.nadia.electronic_medical_card.model.medical_card.PersonalPage;

import javax.persistence.*;

@Entity
@Table(name = "dispensary_observation_group")
public class DispensaryObservationGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personal_part_id", referencedColumnName = "id")
    private PersonalPage personalPage;

    @Column(name = "group_name")
    private DispensaryGroup dispensaryGroup;

    public DispensaryObservationGroup() {
    }

    public DispensaryObservationGroup(DispensaryGroup dispensaryGroup) {
        this.dispensaryGroup = dispensaryGroup;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PersonalPage getPersonalPage() {
        return personalPage;
    }

    public void setPersonalPage(PersonalPage personalPage) {
        this.personalPage = personalPage;
    }

    public DispensaryGroup getDispensaryGroup() {
        return dispensaryGroup;
    }

    public void setDispensaryGroup(DispensaryGroup dispensaryGroup) {
        this.dispensaryGroup = dispensaryGroup;
    }
}
