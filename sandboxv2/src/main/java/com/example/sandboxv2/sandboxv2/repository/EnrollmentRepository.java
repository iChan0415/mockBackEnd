package com.example.sandboxv2.sandboxv2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.sandboxv2.sandboxv2.entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long>{
    List<Enrollment> findAll();

    Optional<Enrollment> findById(Long enrollmentID);

    @Query("SELECT e FROM Enrollment e WHERE e.users.userID = :user_ID")
    List<Enrollment> findByUserId(@Param("user_ID") Long user_ID);
}
