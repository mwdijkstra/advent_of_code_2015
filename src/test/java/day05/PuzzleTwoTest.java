package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleTwoTest {

    @Test
    public void isThisStringNiceTest() {

        PuzzleTwo puzzle = new PuzzleTwo();

        assertEquals(true, puzzle.isThisStringNice("qjhvhtzxzqqjkmpb"));
        assertEquals(true, puzzle.isThisStringNice("xxyxx"));
        assertEquals(false, puzzle.isThisStringNice("uurcxstgmygtbstg"));
        assertEquals(false, puzzle.isThisStringNice("ieodomkazucvgmuy"));

    }

    @Test
    public void containsPairTwiceTest() {

        PuzzleTwo puzzle = new PuzzleTwo();

        assertEquals(true, puzzle.containsPairTwice("xyxy"));
        assertEquals(true, puzzle.containsPairTwice("aabcdefgaa"));
        assertEquals(false, puzzle.containsPairTwice("aaa"));

    }














    @Test
    public void getPuzzleAnswer() {

        System.out.println();

    }

}
