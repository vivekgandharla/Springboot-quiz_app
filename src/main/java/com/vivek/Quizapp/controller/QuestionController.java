package com.vivek.Quizapp.controller;

import com.vivek.Quizapp.Question;
import com.vivek.Quizapp.service.QuestionService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();

    }
    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @PutMapping("update")
    public String updateQuestion(@RequestBody Question question) {
        return questionService.updateQuestion(question);
    }

    @DeleteMapping("delete/{id}")
    public String deleteQuestion(@PathVariable("id") Integer id) {
        questionService.deleteQuestion(id);
        return  "Question deleted successfully";
    }
}
