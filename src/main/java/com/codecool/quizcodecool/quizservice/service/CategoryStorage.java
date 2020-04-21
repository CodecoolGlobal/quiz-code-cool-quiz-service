package com.codecool.quizcodecool.quizservice.service;

import com.codecool.quizcodecool.quizservice.model.Category;
import com.codecool.quizcodecool.quizservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryStorage {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public void add(Category category) {
        categoryRepository.save(category);
    }

    public Category getById(int id) {
        return categoryRepository.getOne(id);
    }
}

