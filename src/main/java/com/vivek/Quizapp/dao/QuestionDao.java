package com.vivek.Quizapp.dao;

import com.vivek.Quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {

    List<Question> findByCategory(String category);

//    List<Question> findByQuestion(String question);

    void deleteById(Integer id);
}