package day06;

import genericFunctions.GenericFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleTwoTest {

//    @Test
//    public void increaseBrightnessTest() {
//
//        PuzzleTwo puzzle = new PuzzleTwo();
//        int[][] grid = puzzle.getStartingGrid();
//
//        assertEquals(1, puzzle.increaseBrightness(grid, "turn on 0,0 through 0,0"));
//        assertEquals(2000000, puzzle.increaseBrightness(grid, "toggle 0,0 through 999,999"));
//        assertEquals(0, puzzle.increaseBrightness(grid, "turn off 0,0 through 999,999"));
//
//    }

    @Test
    public void getPuzzleAnswer() {

        PuzzleTwo puzzle = new PuzzleTwo();
        int[][] grid = puzzle.getStartingGrid();

        ArrayList<String> list = GenericFunctions.getInputFromFile("C:\\Users\\Marcel\\IdeaProjects\\adventofcode2015\\src\\main\\java\\day06\\objects\\input");

        for (String instruction : list) {

            grid = puzzle.increaseBrightness(grid, instruction);

        }

        System.out.println(puzzle.countTheGrid(grid));

    }

}
