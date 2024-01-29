package com.example.sandboxv2.sandboxv2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.sandboxv2.sandboxv2.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{
    List<Quiz> findAll();

    Optional<Quiz> findById(Long quizID);

    @Query("Select q FROM Quiz q WHERE q.course.courseID = :course_ID")
    List<Quiz> findByCourseId(@Param("course_ID")Long course_ID);
}
