package com.bntu.nadia.electronic_medical_card.model.medical_card.added;

public enum RiskFactorsGroup {

    SMOKING("курение"),
    USE_ALCOHOL("злоупотребление алкоголем"),
    PHYSICAL_INACTIVITY("гиподинамия"),
    STRESS("психоэмоциональные нагрузки"),
    HYPERCHOLESTEROLEMIA("гиперхолестеринемия"),
    DIABETES("сахарный диабет"),
    OVERWEIGHT("излишняя масса тела");

    private String value;

    RiskFactorsGroup(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
