package com.codecool.quizcodecool.quizservice.service;

import com.codecool.quizcodecool.quizservice.model.Type;
import org.springframework.stereotype.Service;

import java.util.EnumSet;

@Service
public class TypeStorage {

    public EnumSet<Type> getAll() {
        return EnumSet.allOf( Type.class);
    }
}
