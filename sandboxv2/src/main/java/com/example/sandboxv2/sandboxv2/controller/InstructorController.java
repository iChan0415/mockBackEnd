package com.example.sandboxv2.sandboxv2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sandboxv2.sandboxv2.entity.Instructor;
import com.example.sandboxv2.sandboxv2.services.InstructorService;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {
    @Autowired
    private InstructorService instructorService;

    @GetMapping
    public List<Instructor> getAllInstructor() {
        return instructorService.getAllInstructor();
    }

    @GetMapping("/{instructorID}")
    public Instructor getInstructorById(@PathVariable Long instructorID) {
        return instructorService.getInstructorById(instructorID);
    }

    @PostMapping
    public Instructor saveInstructor(@RequestBody Instructor instructor) {
        return instructorService.saveInstructor(instructor);
    }

    @DeleteMapping("/{instructorID}")
    public void deleteInsturctor(@PathVariable Long instructorID) {
        instructorService.deleteInsturctor(instructorID);
    }
}
