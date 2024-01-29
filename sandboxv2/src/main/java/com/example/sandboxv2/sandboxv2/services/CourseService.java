package com.example.sandboxv2.sandboxv2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sandboxv2.sandboxv2.entity.Course;
import com.example.sandboxv2.sandboxv2.repository.CourseRepository;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseId(Long courseID) {
        return courseRepository.findById(courseID).orElse(null);
    }

    public List<Course> getCourseByInstructorId(Long instructor_ID){
        return courseRepository.findByInstructorId(instructor_ID);
    }

    public Course savCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseID) {
        courseRepository.deleteById(courseID);
    }
}
