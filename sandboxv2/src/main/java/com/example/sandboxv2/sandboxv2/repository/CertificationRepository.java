package com.example.sandboxv2.sandboxv2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.sandboxv2.sandboxv2.entity.Certification;

public interface CertificationRepository extends JpaRepository<Certification, Long> {
    List<Certification> findAll();

    Optional<Certification> findById(Long certificateID);

    @Query("SELECT cr FROM Certification cr WHERE cr.quizTaken.users.userID = :user_ID")
    List<Certification> findByUserId(@Param("user_ID")Long user_ID);
}
