package com.bntu.nadia.electronic_medical_card.service.spring;

public interface EmailService {
    void sendMessage(String to, String subject, String text);
}
