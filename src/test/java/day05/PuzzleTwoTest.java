package day05;

import genericFunctions.GenericFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleTwoTest {

    @Test
    public void isThisStringNiceTest() {

        PuzzleTwo puzzle = new PuzzleTwo();

        assertEquals(true, puzzle.isThisStringNice("qjhvhtzxzqqjkmpb"));
        assertEquals(true, puzzle.isThisStringNice("xxyxx"));
        assertEquals(false, puzzle.isThisStringNice("uurcxstgmygtbstg"));
        assertEquals(false, puzzle.isThisStringNice("ieodomkazucvgmuy"));
        assertEquals(true, puzzle.isThisStringNice("rxexcbwhiywwwwnu"));

    }

    @Test
    public void containsPairTwiceTest() {

        PuzzleTwo puzzle = new PuzzleTwo();

        assertEquals(true, puzzle.containsPairTwice("xyxy"));
        assertEquals(true, puzzle.containsPairTwice("aabcdefgaa"));
        assertEquals(false, puzzle.containsPairTwice("aaa"));

    }

    @Test
    public void containsOneLetterBetweenRepeatTest() {

        PuzzleTwo puzzle = new PuzzleTwo();

        assertEquals(true, puzzle.containsOneLetterBetweenRepeat("xyx"));
        assertEquals(true, puzzle.containsOneLetterBetweenRepeat("abcdefeghi"));
        assertEquals(true, puzzle.containsOneLetterBetweenRepeat("aaa"));
        assertEquals(false, puzzle.containsOneLetterBetweenRepeat("test"));

    }

    @Test
    public void getPuzzleAnswer() {

        // todo - the answer is 51 but I still get 50

        //get input
        ArrayList<String> list = GenericFunctions.getInputFromFile("C:\\Users\\Marcel\\IdeaProjects\\adventofcode2015\\src\\main\\java\\day05\\objects\\input");

        //do stuff
        PuzzleTwo puzzle = new PuzzleTwo();

        int count = 0;

        for (String string : list) {

            if (puzzle.isThisStringNice(string)) {

                count++;

                //System.out.println(string);

            } else {

                //System.out.println(string + " is naughty");

            }

        }

        System.out.println(count);

    }

}
