package com.example.sandboxv2.sandboxv2.repository;

import com.example.sandboxv2.sandboxv2.dto.VerificationResponse;
import com.example.sandboxv2.sandboxv2.entity.Certification;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CertificationRepository
  extends JpaRepository<Certification, Long> {
  List<Certification> findAll();

  Optional<Certification> findById(Long certificateID);

  @Query(
    "SELECT cr FROM Certification cr WHERE cr.quizTaken.users.userID = :user_ID"
  )
  List<Certification> findByUserId(@Param("user_ID") Long user_ID);

  @Query("SELECT new com.example.sandboxv2.sandboxv2.dto.VerificationResponse(cr.serial_no, cr.quizTaken.quiz.course.title, cr.quizTaken.users.full_name) FROM Certification cr WHERE cr.serial_no = :serial_no")
  List<VerificationResponse> findBySerialNumberWithDetails(@Param("serial_no") String serial_no);
  
}
