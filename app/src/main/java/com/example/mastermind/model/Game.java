package com.example.mastermind.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Game {
    private final int difficultyLevel;
    private final int codeSize;
    private final int turns;
    private final CodePattern answerPattern;
    private final ArrayList<CodePattern> guesses;
}
