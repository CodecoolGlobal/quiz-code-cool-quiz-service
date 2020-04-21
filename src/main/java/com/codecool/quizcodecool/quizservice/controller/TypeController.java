package com.codecool.quizcodecool.quizservice.controller;

import com.codecool.quizcodecool.quizservice.model.Type;
import com.codecool.quizcodecool.quizservice.service.TypeStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.EnumSet;

@RestController
public class TypeController {

    @Autowired
    TypeStorage typeStorage;

    @GetMapping("/types")
    public EnumSet<Type> getCategories() {
        return typeStorage.getAll();
    }
}
