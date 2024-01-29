package com.example.sandboxv2.sandboxv2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class QuizTaken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quiztknID;
    private Long quiz_score;

    @ManyToOne
    @JoinColumn(name = "quiz_ID")
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    private Users users;


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

    public Quiz getQuiz() {
        return this.quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public Users getUsers() {
        return this.users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

}
