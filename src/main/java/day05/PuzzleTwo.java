package day05;

import java.util.regex.Pattern;

public class PuzzleTwo {

    public boolean isThisStringNice(String input) {

        // contains a pair of letters twice
        Pattern patternOne = Pattern.compile("(..).*\\1");

        // contains one letter between repeat
        Pattern patternTwo = Pattern.compile("(.).\\1");

        return patternOne.matcher(input).find() && patternTwo.matcher(input).find();

    }

}

