package com.example.sandboxv2.sandboxv2.dto;

import java.sql.Date;

public class CourseDTO {
    private Long courseID;
    private String title;
    private String description;
    private String criteria;
    private String file;
    private String image;
    private Date start_date;
    private Date end_date;
    private Long instructor_ID;


    public Long getCourseID() {
        return this.courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
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

    public String getCriteria() {
        return this.criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
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

    public Long getInstructorID() {
        return this.instructor_ID;
    }

    public void setInstructorID(Long instructor_ID) {
        this.instructor_ID = instructor_ID;
    }

}
