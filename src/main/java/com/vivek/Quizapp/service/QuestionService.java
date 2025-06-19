package com.vivek.Quizapp.service;

import com.vivek.Quizapp.Question;
import com.vivek.Quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Question added successfully";
    }

    public String updateQuestion(Question question) {
        questionDao.save(question);
        return "Question updated successfully";
    }

    public String deleteQuestion(Integer id) {
        questionDao.deleteById(id);
        return "Question deleted successfully";
    }
}
