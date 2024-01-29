package com.example.sandboxv2.sandboxv2.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentID;
    private Date enrollmentDate;
    private String cancelled;
    private String cancellationReason;

    @ManyToOne
    @JoinColumn(name = "course_ID")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "support_ID")
    private Support support;


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

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Users getUsers() {
        return this.users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Support getSupport() {
        return this.support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

}
