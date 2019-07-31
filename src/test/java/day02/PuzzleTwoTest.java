package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static genericFunctions.GenericFunctions.getInputFromFile;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleTwoTest {

    @Test
    public void getTotalFeetOfRibbon() {

        PuzzleTwo puzzle = new PuzzleTwo();

        assertEquals(34, puzzle.getTotalFeetOfRibbon("2x3x4"));
        assertEquals(14, puzzle.getTotalFeetOfRibbon("1x1x10"));

    }

    @Test
    public void getRibbonToWrapTest() {

        PuzzleTwo puzzle = new PuzzleTwo();

        assertEquals(10, puzzle.getRibbonToWrap("2x3x4"));
        assertEquals(4, puzzle.getRibbonToWrap("1x1x10"));

    }

    @Test
    public void getRibbonForBowTest() {

        PuzzleTwo puzzle = new PuzzleTwo();

        assertEquals(24, puzzle.getRibbonForBow("2x3x4"));
        assertEquals(10, puzzle.getRibbonForBow("1x1x10"));

    }

    @Test
    public void getPuzzleAnswer() {

        //get input
        ArrayList<String> list = getInputFromFile("C:\\Users\\Marcel\\IdeaProjects\\adventofcode2015\\src\\main\\java\\day02\\objects\\input");

        //do stuff
        PuzzleTwo puzzle = new PuzzleTwo();

        int answer = 0;

        for (String string : list) {

            answer = answer + puzzle.getTotalFeetOfRibbon(string);

        }

        //print answer
        System.out.println(answer);

    }

}
