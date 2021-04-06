package com.bntu.nadia.electronic_medical_card.model.user;

public enum UserRole {
    PATIENT(1, "пациент"),
    MEDICAL_WORKER(2, "медработник");

    private int id;
    private String value;

    UserRole(int id, String value){
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
