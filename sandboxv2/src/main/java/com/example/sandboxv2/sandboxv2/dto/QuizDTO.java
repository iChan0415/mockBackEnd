package com.example.sandboxv2.sandboxv2.dto;

import java.sql.Date;

public class QuizDTO {
    private Long quizID;
    private String title;
    private String description;
    private String file;
    private String image;
    private Date start_date;
    private Date end_date;
    private Long target_score;
    private Long course_ID;


    public Long getQuizID() {
        return this.quizID;
    }

    public void setQuizID(Long quizID) {
        this.quizID = quizID;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFile() {
        return this.file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getStart_date() {
        return this.start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return this.end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Long getTarget_score() {
        return this.target_score;
    }

    public void setTarget_score(Long target_score) {
        this.target_score = target_score;
    }

    public Long getCourse_ID() {
        return this.course_ID;
    }

    public void setCourse_ID(Long course_ID) {
        this.course_ID = course_ID;
    }

}
