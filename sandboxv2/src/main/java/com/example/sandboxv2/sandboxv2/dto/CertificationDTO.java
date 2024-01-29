package com.example.sandboxv2.sandboxv2.dto;

import java.sql.Date;

public class CertificationDTO {
    private Long certificateID;
    private String serial_no;
    private Date date_issued;
    private String certificate_file;
    private String criteria;
    private Long quiztken_ID;
    // private Long user_ID;
    // private Long support_ID;


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



    // public Long getCourse_ID() {
    //     return this.course_ID;
    // }

    // public void setCourse_ID(Long course_ID) {
    //     this.course_ID = course_ID;
    // }

    // public Long getUser_ID() {
    //     return this.user_ID;
    // }

    // public void setUser_ID(Long user_ID) {
    //     this.user_ID = user_ID;
    // }

    // public Long getSupport_ID() {
    //     return this.support_ID;
    // }

    // public void setSupport_ID(Long support_ID) {
    //     this.support_ID = support_ID;
    // }
    

    public Long getQuiztken_ID() {
        return this.quiztken_ID;
    }

    public void setQuiztken_ID(Long quiztken_ID) {
        this.quiztken_ID = quiztken_ID;
    }

}
