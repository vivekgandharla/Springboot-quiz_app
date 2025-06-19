package com.vivek.Quizapp.controller;

import com.vivek.Quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {
//    http://localhost:8080/quiz/create?category=Java&numQ=5&title=JQuiz

    @Autowired
    QuizService quizService;;

    @PostMapping("create")
    public ResponseEntity<String>createQuiz(@RequestParam String category,@RequestParam int numQ, @RequestParam String title){
        return  quizService.createQuiz(category, numQ, title);
    }

}
