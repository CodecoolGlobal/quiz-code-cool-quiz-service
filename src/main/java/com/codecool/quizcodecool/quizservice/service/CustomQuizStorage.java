package com.codecool.quizcodecool.quizservice.service;

import com.codecool.quizcodecool.quizservice.model.CustomQuiz;
import com.codecool.quizcodecool.quizservice.model.Question;
import com.codecool.quizcodecool.quizservice.model.QuizBody;
import com.codecool.quizcodecool.quizservice.repository.CustomQuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomQuizStorage {

    @Autowired
    CustomQuizRepository customQuizRepository;

    @Autowired
    QuestionStorage questionStorage;

    public List<CustomQuiz> getAll() {
        return customQuizRepository.findAll();
    }

    public void add(CustomQuiz customQuiz) {
        customQuizRepository.save(customQuiz);
    }

    public void addQuizBody(QuizBody quizBody) {
        String name = quizBody.getName();
        int[] questionIds = quizBody.getQuestionIds();
        List<Question> questionList = Arrays.stream(questionIds).mapToObj(e -> questionStorage.find(e)).collect(Collectors.toList());
        CustomQuiz customQuiz = CustomQuiz.builder()
                .name(name)
                .questions(questionList)
                .build();
        add(customQuiz);
    }

    public List<Question> getQuestionsForCustomQuizById(int id) {
        return customQuizRepository.getOne(id).getQuestions();
    }
}
