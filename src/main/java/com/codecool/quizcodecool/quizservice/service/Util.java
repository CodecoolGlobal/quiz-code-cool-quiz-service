package com.codecool.quizcodecool.quizservice.service;

import com.codecool.quizcodecool.quizservice.model.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class Util {

    public List<Question> getRandomQuestionsFromList(List<Question> list, String numOfNeededItems) {

        if (numOfNeededItems == null) {
            return list;
        }
        if (list.size() == 0 ||
            Integer.parseInt(numOfNeededItems) == 0 ||
            Integer.parseInt(numOfNeededItems) > list.size()) {
            return null;
        }


        Random rand = new Random();

        List<Question> copyList = new ArrayList<>(list);
        List<Question> newList = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(numOfNeededItems); i++) {

            int randomIndex = rand.nextInt(copyList.size());
            newList.add(copyList.get(randomIndex));
            copyList.remove(randomIndex);
        }
        return newList;
    }

}
