package com.bntu.nadia.electronic_medical_card.model.medical_card.added;

import javax.persistence.*;

@Entity
@Table(name = "questionnaire")
public class Questionnaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "question_id")
    private PreventiveExaminationQuestion preventiveExaminationQuestion;

    @Column(name = "answer")
    private boolean answer;

    @Column(name = "other")
    private String other;

    public Questionnaire() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PreventiveExaminationQuestion getPreventiveExaminationQuestion() {
        return preventiveExaminationQuestion;
    }

    public void setPreventiveExaminationQuestion(PreventiveExaminationQuestion preventiveExaminationQuestion) {
        this.preventiveExaminationQuestion = preventiveExaminationQuestion;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
