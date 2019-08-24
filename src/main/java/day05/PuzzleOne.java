package day05;

import static genericFunctions.GenericFunctions.getTime;

public class PuzzleOne {

    public static final String VOWELS = "aeiou";
    public static final int MIN_AMOUNT_OF_VOWELS = 3;
    public static final boolean LOGGING = false;

    public int getNumberOfNiceStrings(String input) {

        return 0;

    }

    public boolean containsThreeVowels(String input) {

        int count = 0;

        for (char c : input.toCharArray()) {

            for (char ch : VOWELS.toCharArray()) {

                if (c == ch) {

                    count++;

                    break;

                }

            }

        }

        if (LOGGING) {

            System.out.println(getTime() + " - Log: " + input + " contains " + count + " vowel(s).");

        }

        return (count >= MIN_AMOUNT_OF_VOWELS);

    }

    public boolean containsOneLetterTwiceInRow(String input) {

        char previousChar = Character.MIN_VALUE;

        for (char c : input.toCharArray()) {

            if (c == previousChar) {

                if (LOGGING) {

                    System.out.println(getTime() + " - Log: " + input + " contains the same letter twice in a row: " + previousChar + c);

                }

                return true;

            }

            previousChar = c;

        }

        if (LOGGING) {

            System.out.println(getTime() + " - Log: " + input + " does not contain the same letter in a row twice");

        }

        return false;

    }

    public boolean containsDisallowedSubstrings(String input) {

        char previousChar = Character.MIN_VALUE;

        for (char c : input.toCharArray()) {

            String string = "" + previousChar + c;

            if (string.matches("ab|cd|pq|xy")) {

                if (LOGGING) {

                    System.out.println(getTime() + " - Log: " + input + " contains the disallowed substring " + string);

                }

                return true;

            }

            previousChar = c;

        }

        if (LOGGING) {

            System.out.println(getTime() + " - Log: " + input + " does not contain a disallowed substring");

        }

        return false;

    }

    public boolean isThisStringNice(String input) {

        return (containsThreeVowels(input) && containsOneLetterTwiceInRow(input) && !containsDisallowedSubstrings(input));

    }
}
