package com.example.sandboxv2.sandboxv2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sandboxv2.sandboxv2.entity.Enrollment;
import com.example.sandboxv2.sandboxv2.services.EnrollmentService;

@RestController
@RequestMapping("/api/enrollments")
@CrossOrigin("http://localhost:5173/")
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAEnrollments();
    }

    @GetMapping("/{enrollmentID}")
    public Enrollment getEnrollmentById(@PathVariable Long enrollmentID) {
        return enrollmentService.getEnrollmentId(enrollmentID);
    }

    @GetMapping("/byUser/{user_ID}")
    public List<Enrollment> getEnrollmentsByUserId(@PathVariable Long user_ID) {
        return enrollmentService.getEnrollmentsByUserId(user_ID);
    }

    @PostMapping
    public Enrollment saveEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.savEnrollment(enrollment);
    }

    @DeleteMapping("/{enrollmentID}")
    public void deleteEnrollment(@PathVariable Long enrollmentID) {
        enrollmentService.deleteEnrollment(enrollmentID);
    }
}
