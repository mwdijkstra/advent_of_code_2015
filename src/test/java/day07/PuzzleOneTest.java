package day07;

import genericFunctions.GenericFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.samePropertyValuesAs;

//todo: ik check hier de inhoud niet

public class PuzzleOneTest {

    @Test
    public void getSignalsTest() {

        PuzzleOne puzzle = new PuzzleOne();

        ArrayList<String> list = GenericFunctions.getInputFromFile("C:\\Users\\Marcel\\IdeaProjects\\adventofcode2015\\src\\main\\java\\day07\\objects\\input_example");

        Map<String, Integer> expectedResult = new HashMap<>();

        expectedResult.put("d", 72);
        expectedResult.put("e", 507);
        expectedResult.put("f", 492);
        expectedResult.put("g", 114);
        expectedResult.put("h", 65412);
        expectedResult.put("i", 65079);
        expectedResult.put("x", 123);
        expectedResult.put("y", 456);

        assertThat(expectedResult, samePropertyValuesAs(puzzle.getSignals(list)));

    }

    @Test
    public void connectWiresTestX() {

        PuzzleOne puzzle = new PuzzleOne();

        Map<String, Integer> emptyInput = new HashMap<>();

        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("x", 123);

        assertThat(expectedResult, samePropertyValuesAs(puzzle.connectWires(emptyInput, "123 -> x")));

    }

    @Test
    public void connectWiresTestY() {

        PuzzleOne puzzle = new PuzzleOne();

        Map<String, Integer> emptyInput = new HashMap<>();

        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("y", 456);

        assertThat(expectedResult, samePropertyValuesAs(puzzle.connectWires(emptyInput, "456 -> y")));

    }

    @Test
    public void connectWiresToAndTest() {

        PuzzleOne puzzle = new PuzzleOne();

        Map<String, Integer> emptyInput = new HashMap<>();

        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("d", 72);

        assertThat(expectedResult, samePropertyValuesAs(puzzle.connectWiresToAnd(emptyInput, "x AND y -> d")));

    }

}
