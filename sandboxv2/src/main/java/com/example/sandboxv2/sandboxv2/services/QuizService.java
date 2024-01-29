package com.example.sandboxv2.sandboxv2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sandboxv2.sandboxv2.entity.Quiz;
import com.example.sandboxv2.sandboxv2.repository.QuizRepository;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public List<Quiz> getAllQuiz() {
        return quizRepository.findAll();
    }

    public Quiz getQuizId(Long quizID) {
        return quizRepository.findById(quizID).orElse(null);
    }

    public List<Quiz> getQuizByCourseId(Long course_ID){
        return quizRepository.findByCourseId(course_ID);
    }

    public Quiz saveQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public void deleteQuiz(Long quizID) {
        quizRepository.deleteById(quizID);
    }
}

