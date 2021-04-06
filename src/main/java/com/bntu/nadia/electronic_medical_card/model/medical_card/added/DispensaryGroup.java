package com.bntu.nadia.electronic_medical_card.model.medical_card.added;

public enum DispensaryGroup {
    D_ONE("Д (I)"),
    D_TWO("Д (II)"),
    D_THREE("Д (III)");

    private String value;

    DispensaryGroup(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
