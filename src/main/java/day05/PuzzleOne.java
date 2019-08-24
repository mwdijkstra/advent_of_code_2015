package day05;

import static genericFunctions.GenericFunctions.getTime;

public class PuzzleOne {

    public static final String VOWELS = "aeiou";
    public static final int MIN_AMOUNT_OF_VOWELS = 3;
    public static final boolean LOGGING = true;

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

            System.out.println(getTime() + " - Log: " + input + " contains " + count + " vowels.");

        }

        return (count >= MIN_AMOUNT_OF_VOWELS);

    }

    public boolean containsOneLetterTwiceInRow(String input) {

        // generieke functie voor search string.tochararray voor patroon? of paartjes voor deze twee? en char override voor eerste?

        return false;

    }

    // pair-by-pair twice in a row
    // pair-by-pair disallowed substrings

}
