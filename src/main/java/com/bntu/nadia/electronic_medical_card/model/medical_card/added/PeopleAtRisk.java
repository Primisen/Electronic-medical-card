package com.bntu.nadia.electronic_medical_card.model.medical_card.added;

import com.bntu.nadia.electronic_medical_card.model.user.Patient;

import javax.persistence.*;

@Entity
@Table(name = "people_at_risk")
public class PeopleAtRisk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;//шо с этим делац я не понимаю

    @Column(name = "risk_factors_group")
    private RiskFactorsGroup riskFactorsGroup;

    public PeopleAtRisk () {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public RiskFactorsGroup getRiskFactorsGroup() {
        return riskFactorsGroup;
    }

    public void setRiskFactorsGroup(RiskFactorsGroup riskFactorsGroup) {
        this.riskFactorsGroup = riskFactorsGroup;
    }
}
