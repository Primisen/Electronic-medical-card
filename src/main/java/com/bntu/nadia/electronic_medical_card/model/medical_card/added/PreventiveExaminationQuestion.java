package com.bntu.nadia.electronic_medical_card.model.medical_card.added;

public enum PreventiveExaminationQuestion {
    FIRST_QUESTION (1, "Изменились ли за последние месяцы цвет и размеры пигментных (родимых)пятен?"),
    SECOND_QUESTION (2, "Есть ли на коже, губах, слизистой полости рта и языка язвы, трещины, разрастания, уплотнение и шелушение?"),
    THIRD_QUESTION (3, "Имеются ли затруднения при проглатывании жидкой или твердой пищи?"),
    FOURTH_QUESTION (4, "Отмечаете ли в настоящее время общую слабость, ухудшение аппетита, нарастающее похудение, постоянные отрыжки и рвоты, чувство тяжести и боли в поджелудочной области, запоры, поносы?"),
    FIFTH_QUESTION (5, "Отмечается ли примесь крови в моче, кале или дегтеобразный стул?"),
    SIX_QUESTION (6, "Есть ли в настоящее время кашель, кровохаркание, боли в грудной клетке, осиплость голоса?"),
    SEVENTH_QUESTION (7, "Имеются ли уплотнения в молочных (грудных) железах, язвы, трещины в области соска, кровянистые выделения из соска?"),
    EIGHTH_QUESTION (8, "Имеются ли кровянистые выделения из влагалища, не связанные с месячными?"),
    NINTH_QUESTION (9, "Другие жалобы.");

     private int id;
     private String question;

     PreventiveExaminationQuestion(int id, String question){
         this.id = id;
         this.question = question;
     }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }
}
