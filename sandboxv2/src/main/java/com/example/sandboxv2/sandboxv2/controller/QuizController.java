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

import com.example.sandboxv2.sandboxv2.entity.Quiz;
import com.example.sandboxv2.sandboxv2.services.QuizService;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {
    @Autowired
    public QuizService quizService;

    @GetMapping
    public List<Quiz> getAllQuiz() {
        return quizService.getAllQuiz();
    }

    @GetMapping("/{quizID}")
    public Quiz getQuizById(@PathVariable Long quizID) {
        return quizService.getQuizId(quizID);
    }

    @GetMapping("/byCourse/{course_ID}")
    public List<Quiz> getQuizByCourseId(@PathVariable Long course_ID) {
        return quizService.getQuizByCourseId(course_ID);
    }

    @PostMapping
    public Quiz saveQuiz(@RequestBody Quiz quiz) {
        return quizService.saveQuiz(quiz);
    }

    @DeleteMapping("/{quizID}")
    public void deleteQuiz(@PathVariable Long quizID) {
        quizService.deleteQuiz(quizID);
    }
}
