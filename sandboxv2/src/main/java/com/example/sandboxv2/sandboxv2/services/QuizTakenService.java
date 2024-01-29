package com.example.sandboxv2.sandboxv2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sandboxv2.sandboxv2.entity.QuizTaken;
import com.example.sandboxv2.sandboxv2.repository.QuizTakenRepository;

@Service
public class QuizTakenService {
    @Autowired
    private QuizTakenRepository quizTakenRepository;

    public List<QuizTaken> getAllQuizTaken() {
        return quizTakenRepository.findAll();
    }

    public QuizTaken getQuizTakenId(Long quiztknID) {
        return quizTakenRepository.findById(quiztknID).orElse(null);
    }

    public List<QuizTaken> getQuizTakenByUserId(Long user_ID) {
        return quizTakenRepository.findByUserId(user_ID);
    }

    public QuizTaken savQuizTaken(QuizTaken quizTaken) {
        return quizTakenRepository.save(quizTaken);
    }

    public void deleteQuizTaken(Long quiztknID) {
        quizTakenRepository.deleteById(quiztknID);
    }
}
