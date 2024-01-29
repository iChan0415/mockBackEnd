package com.example.sandboxv2.sandboxv2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.sandboxv2.sandboxv2.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
    List<Course> findAll();

    Optional<Course> findById(Long courseId);

    @Query("Select c FROM Course c WHERE c.instructor.instructorID = :instructor_ID")
    List<Course> findByInstructorId(@Param("instructor_ID")Long instructor_ID);
}
