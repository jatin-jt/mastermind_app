package com.example.mastermind.utils;

import com.example.mastermind.model.CodePattern;
import com.example.mastermind.model.GuessResult;
import com.example.mastermind.model.Peg;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.NonNull;

public class GuessEvaluator {

    public GuessResult evaluate(@NonNull final CodePattern answerPattern, @NonNull final CodePattern guessPattern) {
        final HashMap<Peg, Integer> countMap = new HashMap<>();
        final ArrayList<Peg> pattern = answerPattern.getPattern();
        final ArrayList<Peg> guess = guessPattern.getPattern();

        for (int i = 0; i < pattern.size(); i++) {
            if (countMap.containsKey(pattern.get(i))) {
                Integer oldValue = countMap.remove(pattern.get(i));
                countMap.put(pattern.get(i), oldValue + 1);
            } else {
                countMap.put(pattern.get(i), 1);
            }
        }
        int common = 0, equal = 0;
        for (int i = 0; i < pattern.size(); i++) {
            if (countMap.containsKey(guess.get(i))) {
                common++;
                Integer oldValue = countMap.remove(guess.get(i));
                oldValue--;
                if (!oldValue.equals(0)) {
                    countMap.put(guess.get(i), oldValue);
                }
            }

            if (pattern.get(i).equals(guess.get(i))) {
                equal++;
            }
        }
        return new GuessResult(equal, common - equal);
    }
}
