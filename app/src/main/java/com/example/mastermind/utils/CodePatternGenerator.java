package com.example.mastermind.utils;

import com.example.mastermind.model.CodePattern;
import com.example.mastermind.model.Game;
import com.example.mastermind.model.Peg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import lombok.NonNull;

public class CodePatternGenerator {

    private int numColors;
    private final ArrayList<Peg> possibleChoices = new ArrayList<>(Arrays.asList(Peg.values()));

    public CodePattern generate(@NonNull final Game game) {
        numColors = game.getNumColors();
        if(!game.isEmptyPegAllowed()){
            possibleChoices.remove(Peg.EMPTY);
        }

        final ArrayList<Peg> generatedPattern = new ArrayList<>();
        for (int i = 0; i < game.getCodeSize(); i++) {
            generatedPattern.add(getPeg(game.isColorsRepeatAllowed()));
        }
        return new CodePattern(generatedPattern);
    }

    private Peg getPeg(final boolean isColorRepeatAllowed)
    {
        Random ran = new Random(System.currentTimeMillis());
        final Peg peg = possibleChoices.get(ran.nextInt(numColors+1));
        if (!isColorRepeatAllowed){
            possibleChoices.remove(peg);
        }
        return peg;
    }
}
