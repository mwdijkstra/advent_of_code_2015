package day05;

import genericFunctions.GenericFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleOneTest {

    @Test
    public void getPuzzleAnswer() {

        //get input
        ArrayList<String> list = GenericFunctions.getInputFromFile("C:\\Users\\Marcel\\IdeaProjects\\adventofcode2015\\src\\main\\java\\day05\\objects\\input");

        //do stuff
        PuzzleOne puzzle = new PuzzleOne();

        int count = 0;

        for (String string : list) {

            if (puzzle.isThisStringNice(string)) {

                count++;

            }

        }

        System.out.println(count);

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

    @Test
    public void containsDisallowedSubstringsTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertEquals(true, puzzle.containsDisallowedSubstrings("ab"));
        assertEquals(true, puzzle.containsDisallowedSubstrings("cd"));
        assertEquals(true, puzzle.containsDisallowedSubstrings("pq"));
        assertEquals(true, puzzle.containsDisallowedSubstrings("xy"));
        assertEquals(false, puzzle.containsDisallowedSubstrings("test"));

    }

    @Test
    public void isThisStringNiceTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertEquals(true, puzzle.isThisStringNice("ugknbfddgicrmopn"));
        assertEquals(true, puzzle.isThisStringNice("aaa"));
        assertEquals(false, puzzle.isThisStringNice("jchzalrnumimnmhp"));
        assertEquals(false, puzzle.isThisStringNice("haegwjzuvuyypxyu"));
        assertEquals(false, puzzle.isThisStringNice("dvszwmarrgswjxmb"));

    }

}
