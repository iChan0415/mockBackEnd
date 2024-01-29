package com.example.sandboxv2.sandboxv2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sandboxv2.sandboxv2.entity.Enrollment;
import com.example.sandboxv2.sandboxv2.repository.EnrollmentRepository;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Enrollment> getAEnrollments() {
        return enrollmentRepository.findAll();
    }

    public Enrollment getEnrollmentId(Long enrollmentID) {
        return enrollmentRepository.findById(enrollmentID).orElse(null);
    }

    public List<Enrollment> getEnrollmentsByUserId(Long user_ID) {
        return enrollmentRepository.findByUserId(user_ID);
    }

    public Enrollment savEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public void deleteEnrollment(Long enrollmentID) {
        enrollmentRepository.deleteById(enrollmentID);
    }
}
