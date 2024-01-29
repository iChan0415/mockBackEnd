package com.example.sandboxv2.sandboxv2.dto;

public class QuizTakenDTO {
    private Long quiztknID;
    private Long quiz_score;
    private Long quiz_ID;
    private Long user_ID;


    public Long getQuiztknID() {
        return this.quiztknID;
    }

    public void setQuiztknID(Long quiztknID) {
        this.quiztknID = quiztknID;
    }

    public Long getQuiz_score() {
        return this.quiz_score;
    }

    public void setQuiz_score(Long quiz_score) {
        this.quiz_score = quiz_score;
    }

    public Long getQuiz_ID() {
        return this.quiz_ID;
    }

    public void setQuiz_ID(Long quiz_ID) {
        this.quiz_ID = quiz_ID;
    }

    public Long getUser_ID() {
        return this.user_ID;
    }

    public void setUser_ID(Long user_ID) {
        this.user_ID = user_ID;
    }

}
