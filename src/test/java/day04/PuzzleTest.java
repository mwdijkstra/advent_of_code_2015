package day04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleTest {

    @Test
    public void getPuzzleAnswer() {

        Puzzle puzzle = new Puzzle();
        String input = "ckczppom";

        System.out.println(puzzle.getLowestNumber(input));

    }

    @Test
    public void getLowestNumberTest() {

        Puzzle puzzle = new Puzzle();

        if (puzzle.NUMBER_OF_ZEROES_INT == 6) {

            // there are no examples for puzzle two
            return;

        }

        assertEquals(609043, puzzle.getLowestNumber("abcdef"));
        assertEquals(1048970, puzzle.getLowestNumber("pqrstuv"));

    }

}