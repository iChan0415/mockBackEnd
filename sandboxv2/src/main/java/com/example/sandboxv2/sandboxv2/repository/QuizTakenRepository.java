package com.example.sandboxv2.sandboxv2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.sandboxv2.sandboxv2.entity.QuizTaken;

public interface QuizTakenRepository extends JpaRepository<QuizTaken, Long> {
    List<QuizTaken> findAll();
    Optional<QuizTaken> findById(Long quiztknID);

    @Query("SELECT qt FROM QuizTaken qt WHERE qt.users.userID = :user_ID")
    List<QuizTaken> findByUserId(@Param("user_ID") Long user_ID);
}
