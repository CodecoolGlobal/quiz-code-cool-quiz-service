package com.codecool.quizcodecool.quizservice.controller;

import com.codecool.quizcodecool.quizservice.model.Category;
import com.codecool.quizcodecool.quizservice.service.CategoryStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CategoryController {

    @Autowired
    CategoryStorage categoryStorage;

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return categoryStorage.getAll();
    }
}
