package com.example.mastermind.utils;

import com.example.mastermind.model.CodePattern;
import com.example.mastermind.model.GuessResult;

import lombok.NonNull;

public class GuessEvaluator {

    public GuessResult evaluate(@NonNull final CodePattern answerPattern, @NonNull final CodePattern guessPattern) {

        return new GuessResult(0,0);
    }
}
