package day02;

import day02.objects.Present;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleOneTest {

    @Test
    public void getTotalSquareFeetOfWrappingPaperTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertEquals(58, puzzle.getTotalSquareFeetOfWrappingPaper("2x3x4"));
        assertEquals(43, puzzle.getTotalSquareFeetOfWrappingPaper("1x1x10"));

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

        assertEquals(6, puzzle.getSurfaceArea("2x3x4"));
        assertEquals(1, puzzle.getSurfaceArea("1x1x10"));

    }

    @Test
    public void getPresentFromStringTest() {

        PuzzleOne puzzle = new PuzzleOne();

        assertEquals(new Present(2, 3, 4), puzzle.getPresentFromString("2x3x4"));
        assertEquals(new Present(1, 1, 10), puzzle.getPresentFromString("1x1x10"));

    }

}
