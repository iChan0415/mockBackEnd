package com.example.sandboxv2.sandboxv2.dto;



public class VerificationResponse {

    private String course_title;
    private String serial_no;
    private String full_name;
   // private Long quiztken_ID;


    public String getCourse_title() {
        return this.course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public String getSerial_no() {
        return this.serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public String getFull_name() {
        return this.full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

  /* public Long getQuiztken_ID() {
        return this.quiztken_ID;
    }

    public void setQuiztken_ID(Long quiztken_ID) {
        this.quiztken_ID = quiztken_ID; 
    } */



    public VerificationResponse(String serial_no, String course_title, String full_name) {
        this.serial_no = serial_no;
        this.course_title = course_title;
        this.full_name = full_name;
    }
    
    
}
