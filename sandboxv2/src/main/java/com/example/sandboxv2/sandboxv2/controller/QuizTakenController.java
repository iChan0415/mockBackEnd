package com.example.sandboxv2.sandboxv2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sandboxv2.sandboxv2.entity.QuizTaken;
import com.example.sandboxv2.sandboxv2.services.QuizTakenService;

@RestController
@RequestMapping("/api/quizTkn")
@CrossOrigin("http://localhost:5173/")
public class QuizTakenController {
    @Autowired
    private QuizTakenService quizTakenService;

    @GetMapping
    public List<QuizTaken> getAllQuizTaken() {
        return quizTakenService.getAllQuizTaken();
    }

    @GetMapping("/{quiztknID}")
    public QuizTaken getQuizTakenById(@PathVariable Long quiztknID) {
        return quizTakenService.getQuizTakenId(quiztknID);
    }

    @GetMapping("/byUserId/{user_ID}")
    public List<QuizTaken> getQuizTakenByUserId(@PathVariable Long user_ID) {
        return quizTakenService.getQuizTakenByUserId(user_ID);
    }

    @PostMapping
    public QuizTaken saveQuizTaken(@RequestBody QuizTaken quizTaken) {
        return quizTakenService.savQuizTaken(quizTaken);
    }

    @DeleteMapping("/{quiztknID}") 
    public void deleteQuizTaken(@PathVariable Long quiztknID) {
        quizTakenService.deleteQuizTaken(quiztknID);
    }
}
