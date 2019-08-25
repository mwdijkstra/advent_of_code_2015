package day05;

import java.util.regex.Pattern;

public class PuzzleTwo {

    public boolean isThisStringNice(String input) {

        // contains a pair of letters twice
        Pattern patternOne = Pattern.compile("(..).*\\1");
        boolean ruleOne = patternOne.matcher(input).find();

        // contains one letter between repeat
        Pattern patternTwo = Pattern.compile("(.).\\1");
        boolean ruleTwo = patternTwo.matcher(input).find();

        return ruleOne && ruleTwo;

    }

}

