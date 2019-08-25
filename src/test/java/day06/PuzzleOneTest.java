package day06;

import genericFunctions.GenericFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleOneTest {

    @Test
    public void updateGridTest() {

        PuzzleOne puzzle = new PuzzleOne();
        int[][] grid = new int[1000][1000];

        assertEquals(1000000, puzzle.countTheGrid(puzzle.updateGrid("turn on 0,0 through 999,999", grid)));
        assertEquals(999000, puzzle.countTheGrid(puzzle.updateGrid("toggle 0,0 through 999,0", grid)));
        assertEquals(998996, puzzle.countTheGrid(puzzle.updateGrid("turn off 499,499 through 500,500", grid)));

    }

    @Test
    public void getCoordinatesTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertEquals(
                Arrays.toString(new int[] {1,2,3,4}),
                Arrays.toString(puzzle.getCoordinates("turn on 1,2 through 3,4")));

        assertEquals(
                Arrays.toString(new int[] {10,20,30,40}),
                Arrays.toString(puzzle.getCoordinates("toggle 10,20 through 30,40")));

        assertEquals(
                Arrays.toString(new int[] {100,200,300,400}),
                Arrays.toString(puzzle.getCoordinates("turn off 100,200 through 300,400")));

    }

    @Test
    public void getPuzzleAnswer() {

        //get input
        ArrayList<String> list = GenericFunctions.getInputFromFile("C:\\Users\\Marcel\\IdeaProjects\\adventofcode2015\\src\\main\\java\\day06\\objects\\input");

        //do stuff
        PuzzleOne puzzle = new PuzzleOne();
        int[][] grid = new int[1000][1000];

        for (String instruction : list) {

            grid = puzzle.updateGrid(instruction, grid);

        }

        System.out.println(puzzle.countTheGrid(grid));

    }
}
