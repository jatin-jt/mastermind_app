package com.example.mastermind.model;

import lombok.Data;

@Data
public class GuessResult {
    private final int correctColorAndPosition;
    private final int correctColorOnly;
}
