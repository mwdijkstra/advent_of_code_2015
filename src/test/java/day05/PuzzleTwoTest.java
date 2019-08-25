package day05;

import genericFunctions.GenericFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.regex.Pattern;

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

        Pattern pattern = Pattern.compile("(..).*\\1");

        // from the examples
        assertEquals(true, pattern.matcher("xyxy").find());
        assertEquals(true, pattern.matcher("aabcdefgaa").find());
        assertEquals(false, pattern.matcher("aaa").find());

        // the one that I was missing in my previous non-regex implementation
        assertEquals(true, pattern.matcher("rxexcbwhiywwwwnu").find());

    }

    @Test
    public void containsOneLetterBetweenRepeatTest() {

        Pattern pattern = Pattern.compile("(.).\\1");

        // from the examples
        assertEquals(true, pattern.matcher("xyx").find());
        assertEquals(true, pattern.matcher("abcdefeghi").find());
        assertEquals(true, pattern.matcher("aaa").find());

        // missing false example
        assertEquals(false, pattern.matcher("test").find());

    }

    @Test
    public void getPuzzleAnswer() {

        //get input
        ArrayList<String> list = GenericFunctions.getInputFromFile("C:\\Users\\Marcel\\IdeaProjects\\adventofcode2015\\src\\main\\java\\day05\\objects\\input");

        //do stuff
        PuzzleTwo puzzle = new PuzzleTwo();

        int count = 0;

        for (String string : list) {

            if (puzzle.isThisStringNice(string)) {

                count++;

            }

        }

        System.out.println(count);

    }

}
