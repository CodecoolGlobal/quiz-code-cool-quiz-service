package com.codecool.quizcodecool.quizservice.repository;

import com.codecool.quizcodecool.quizservice.model.Question;
import com.codecool.quizcodecool.quizservice.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer>, JpaSpecificationExecutor {

    @Query("SELECT distinct q.type from Question q")
    List<Type> findTypes();
}
