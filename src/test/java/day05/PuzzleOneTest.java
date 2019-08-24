package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleOneTest {

    @Test
    public void getPuzzleAnswer() {

        // todo

        String input = "";
        String answer = "";

        System.out.println("Answer: " + answer);

    }

    @Test
    public void getNumberOfNiceStringsTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertEquals(1, puzzle.getNumberOfNiceStrings("ugknbfddgicrmopn"));
        assertEquals(1, puzzle.getNumberOfNiceStrings("aaa"));
        assertEquals(0, puzzle.getNumberOfNiceStrings("jchzalrnumimnmhp"));
        assertEquals(0, puzzle.getNumberOfNiceStrings("haegwjzuvuyypxyu"));
        assertEquals(0, puzzle.getNumberOfNiceStrings("dvszwmarrgswjxmb"));

    }

    @Test
    public void containsThreeVowelsTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertEquals(true, puzzle.containsThreeVowels("aei"));
        assertEquals(true, puzzle.containsThreeVowels("xazegov"));
        assertEquals(true, puzzle.containsThreeVowels("aeiouaeiouaeiou"));
        assertEquals(false, puzzle.containsThreeVowels("test"));

    }

    @Test
    public void containsOneLetterTwiceInRowTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertEquals(true, puzzle.containsOneLetterTwiceInRow("xx"));
        assertEquals(true, puzzle.containsOneLetterTwiceInRow("abcdde"));
        assertEquals(true, puzzle.containsOneLetterTwiceInRow("aabbccdd"));
        assertEquals(false, puzzle.containsOneLetterTwiceInRow("test"));

    }

}
