package com.bntu.nadia.electronic_medical_card.model.medical_card.added;

public enum Gender {
    MAN("мужчина"),
    WOMAN("женщина");

    private String russianValue;

    Gender(String russianValue){
        this.russianValue = russianValue;
    }

    public String getRussianValue(){
        return russianValue;
    }
}
