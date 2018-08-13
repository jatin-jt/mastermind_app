package com.example.mastermind.utils;

import com.example.mastermind.model.CodePattern;
import com.example.mastermind.model.Game;

import java.util.ArrayList;

import lombok.NonNull;

public class CodePatternGenerator {

    public CodePattern generate(@NonNull final Game game) {

        //empty list
        return new CodePattern(new ArrayList<>());
    }
}
