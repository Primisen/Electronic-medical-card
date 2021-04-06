package com.bntu.nadia.electronic_medical_card.model.medical_card.added;

import com.bntu.nadia.electronic_medical_card.model.medical_card.AnamnesisPage;

import javax.persistence.*;

@Entity
@Table(name = "risk_factors")
public class RiskFactors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "anamnesis_part_id", referencedColumnName = "id")
    private AnamnesisPage anamnesisPage;

    @Column(name = "risk_factors_group")
    private RiskFactorsGroup riskFactorsGroup;

    public RiskFactors() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AnamnesisPage getAnamnesisPage() {
        return anamnesisPage;
    }

    public void setAnamnesisPage(AnamnesisPage anamnesisPage) {
        this.anamnesisPage = anamnesisPage;
    }

    public RiskFactorsGroup getRiskFactorsGroup() {
        return riskFactorsGroup;
    }

    public void setRiskFactorsGroup(RiskFactorsGroup riskFactorsGroup) {
        this.riskFactorsGroup = riskFactorsGroup;
    }


}
