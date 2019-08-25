package day05;

import java.util.ArrayList;

import static genericFunctions.GenericFunctions.getTime;

public class PuzzleTwo {

    public static final boolean LOGGING = false;

    public boolean isThisStringNice(String input) {

        return containsPairTwice(input) && containsOneLetterBetweenRepeat(input);

    }

    public boolean containsPairTwice(String input) {

        // todo: dit moet beter kunnen

        char[] listOfChars = input.toCharArray();

        ArrayList<String> uniqueListOfPairs = new ArrayList<>();

        for (int i = 0; i < listOfChars.length - 1; i++) {

            String pair = "" + listOfChars[i] + listOfChars[i+1];

            if (!uniqueListOfPairs.contains(pair)) {

                uniqueListOfPairs.add(pair);

            } else if (listOfChars[i-1] == listOfChars[i] && listOfChars[i+1] == listOfChars[i])  {

                // uitzondering, niets doen?

            } else {

                if (LOGGING) {

                    System.out.println(getTime() + " - Log: " + input + " contains this pair twice " + pair);

                }

                return true;

            }

        }

        if (LOGGING) {

            System.out.println(getTime() + " - Log: " + input + " contains no pair twice");

        }

        return false;

    }

    public boolean containsOneLetterBetweenRepeat(String input) {

        char[] listOfChars = input.toCharArray();

        for (int i = 2; i < listOfChars.length; i++) {

            if (listOfChars[i] == listOfChars[i-2]) {

                if (LOGGING) {

                    System.out.println(getTime() + " - Log: " + input + " contains this repeated letter with one letter in between " + listOfChars[i-2] + listOfChars[i-1] + listOfChars[i]);

                }

                return true;

            }

        }

        if (LOGGING) {

            System.out.println(getTime() + " - Log: " + input + " contains no repeated letter with one letter in between");

        }

        return false;

    }

}

