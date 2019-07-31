package day02;

import day02.objects.Present;
import genericFunctions.GenericFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleOneTest {

    @Test
    public void getTotalSquareFeetOfWrappingPaperTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertEquals(58, puzzle.getSquareFeetOfWrappingPaper("2x3x4"));
        assertEquals(43, puzzle.getSquareFeetOfWrappingPaper("1x1x10"));

    }

    @Test
    public void getSurfaceAreaTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertEquals(52, puzzle.getSurfaceArea("2x3x4"));
        assertEquals(42, puzzle.getSurfaceArea("1x1x10"));

    }

    @Test
    public void getSlackTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertEquals(6, puzzle.getSlack("2x3x4"));
        assertEquals(1, puzzle.getSlack("1x1x10"));

    }

    @Test
    public void getPresentFromStringTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertThat(new Present(2, 3, 4), samePropertyValuesAs(puzzle.getPresentFromString("2x3x4")));
        assertThat(new Present(1, 1, 10), samePropertyValuesAs(puzzle.getPresentFromString("1x1x10")));

    }

    @Test
    public void getPuzzleAnswer() {

        //get input
        ArrayList<String> list = GenericFunctions.getInputFromFile("C:\\Users\\Marcel\\IdeaProjects\\adventofcode2015\\src\\main\\java\\day02\\objects\\input");

        //do stuff
        PuzzleOne puzzle = new PuzzleOne();

        int answer = 0;

        for (String string : list) {

            answer = answer + puzzle.getSquareFeetOfWrappingPaper(string);

        }

        //print answer
        System.out.println(answer);

    }

}
