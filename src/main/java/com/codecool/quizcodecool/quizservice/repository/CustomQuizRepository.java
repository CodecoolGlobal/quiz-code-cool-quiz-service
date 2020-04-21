package com.codecool.quizcodecool.quizservice.repository;

import com.codecool.quizcodecool.quizservice.model.CustomQuiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomQuizRepository extends JpaRepository<CustomQuiz, Integer> {
}
