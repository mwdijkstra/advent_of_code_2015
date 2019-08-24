package day05;

import java.util.ArrayList;

import static genericFunctions.GenericFunctions.getTime;

public class PuzzleTwo {

    public static final boolean LOGGING = true;

    public boolean isThisStringNice(String input) {

        return containsPairTwice(input) && false;

    }

    public boolean containsPairTwice(String input) {

        char[] listOfChars = input.toCharArray();

        ArrayList<String> listOfPairs = new ArrayList<>();

        for (int i = 0; i < listOfChars.length - 1; i++) {

            String pair = "" + listOfChars[i] + listOfChars[i+1];

            listOfPairs.add(pair);

        }

        System.out.println(listOfPairs);

        if (LOGGING) {

            System.out.println(getTime() + " - Log: " + input + " contains no pair twice");

        }

        return false;

    }

}

