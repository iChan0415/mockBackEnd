package com.example.sandboxv2.sandboxv2.dto;

import java.sql.Date;

public class EnrollmentDTO {
    private Long enrollmentID;
    private Date enrollmentDate;
    private String cancelled;
    private String cancellationReason;
    private Long course_ID;
    private Long user_ID;
    private Long support_ID;


    public Long getEnrollmentID() {
        return this.enrollmentID;
    }

    public void setEnrollmentID(Long enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public Date getEnrollmentDate() {
        return this.enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getCancelled() {
        return this.cancelled;
    }

    public void setCancelled(String cancelled) {
        this.cancelled = cancelled;
    }

    public String getCancellationReason() {
        return this.cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public Long getCourse_ID() {
        return this.course_ID;
    }

    public void setCourse_ID(Long course_ID) {
        this.course_ID = course_ID;
    }

    public Long getUser_ID() {
        return this.user_ID;
    }

    public void setUser_ID(Long user_ID) {
        this.user_ID = user_ID;
    }

    public Long getSupport_ID() {
        return this.support_ID;
    }

    public void setSupport_ID(Long support_ID) {
        this.support_ID = support_ID;
    }
    


    
}
