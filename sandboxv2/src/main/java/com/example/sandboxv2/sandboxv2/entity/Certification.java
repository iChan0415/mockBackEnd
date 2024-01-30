package com.example.sandboxv2.sandboxv2.entity;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne; 

@Entity
public class Certification{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long certificateID;
    private String serial_no;
    private Date date_issued;
    private String certificate_file;
    private String criteria;

    @ManyToOne
    @JoinColumn(name = "quiztkn_id")
    private QuizTaken quizTaken;
    

    // @ManyToOne
    // @JoinColumn(name = "user_ID")
    // private Users users;

    // @ManyToOne
    // @JoinColumn(name = "support_ID")
    // private Support support;


    public Long getCertificateID() {
        return this.certificateID;
    }

    public void setCertificateID(Long certificateID) {
        this.certificateID = certificateID;
    }

    public String getSerial_no() {
        return this.serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public Date getDate_issued() {
        return this.date_issued;
    }

    public void setDate_issued(Date date_issued) {
        this.date_issued = date_issued;
    }

    public String getCertificate_file() {
        return this.certificate_file;
    }

    public void setCertificate_file(String certificate_file) {
        this.certificate_file = certificate_file;
    }

    public String getCriteria() {
        return this.criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }
    

    public QuizTaken getQuizTaken() {
        return this.quizTaken;
    }

    public void setQuizTaken(QuizTaken quizTaken) {
        this.quizTaken = quizTaken;
    }

}
