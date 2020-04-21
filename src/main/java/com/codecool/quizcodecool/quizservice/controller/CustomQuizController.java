package com.codecool.quizcodecool.quizservice.controller;

import com.codecool.quizcodecool.quizservice.model.CustomQuiz;
import com.codecool.quizcodecool.quizservice.model.Question;
import com.codecool.quizcodecool.quizservice.model.QuizBody;
import com.codecool.quizcodecool.quizservice.service.CustomQuizStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customquizzes")
public class CustomQuizController {

    @Autowired
    CustomQuizStorage customQuizStorage;

    @GetMapping("/{id}")
    public List<Question> getQuestionsForCustomQuiz(@PathVariable int id) {
        return customQuizStorage.getQuestionsForCustomQuizById(id);
    }

    @GetMapping("")
    public List<CustomQuiz> getCustomQuizzes() {
        return customQuizStorage.getAll();
    }

    @PostMapping("")
    public void saveNewQuiz(@RequestBody QuizBody quizBody) {
        customQuizStorage.addQuizBody(quizBody);
    }
}
