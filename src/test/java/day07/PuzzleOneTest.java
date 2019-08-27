package day07;

import genericFunctions.GenericFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PuzzleOneTest {

    @Test
    public void getSignalsTest() {

        PuzzleOne puzzle = new PuzzleOne();

        ArrayList<String> list = GenericFunctions.getInputFromFile("C:\\Users\\Marcel\\IdeaProjects\\adventofcode2015\\src\\main\\java\\day07\\objects\\input_example");

        // expected result
        Map<String, Integer> expectedResult = new HashMap<>();

        expectedResult.put("d", 72);
        expectedResult.put("e", 507);
        expectedResult.put("f", 492);
        expectedResult.put("g", 114);
        expectedResult.put("h", 65412);
        expectedResult.put("i", 65079);
        expectedResult.put("x", 123);
        expectedResult.put("y", 456);

        // result
        Map<String, Integer> input = new HashMap<>();
        Map<String, Integer> result = puzzle.getSignals(list);

        // compare
        result.forEach((key, value) -> assertEquals(expectedResult.get(key), value));
        expectedResult.forEach((key, value) -> assertEquals(result.get(key), value));
    }

    @Test
    public void connectWiresTestX() {

        PuzzleOne puzzle = new PuzzleOne();

        // expected result
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("x", 123);

        // result
        Map<String, Integer> input = new HashMap<>();
        Map<String, Integer> result = puzzle.connectWires(input, "123 -> x");

        // compare
        result.forEach((key, value) -> assertEquals(expectedResult.get(key), value));
        expectedResult.forEach((key, value) -> assertEquals(result.get(key), value));

    }

    @Test
    public void connectWiresTestY() {

        PuzzleOne puzzle = new PuzzleOne();

        // expected result
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("y", 456);

        // result
        Map<String, Integer> input = new HashMap<>();
        Map<String, Integer> result = puzzle.connectWires(input, "456 -> y");

        // compare
        result.forEach((key, value) -> assertEquals(expectedResult.get(key), value));
        expectedResult.forEach((key, value) -> assertEquals(result.get(key), value));

    }

    @Test
    public void connectWiresToAndTest() {

        PuzzleOne puzzle = new PuzzleOne();

        // expected result
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("x", 123);
        expectedResult.put("y", 456);
        expectedResult.put("d", 72);

        // result
        Map<String, Integer> input = new HashMap<>();
        input.put("x", 123);
        input.put("y", 456);

        Map<String, Integer> result = puzzle.connectWiresToAnd(input, "x AND y -> d");

        // compare
        result.forEach((key, value) -> assertEquals(expectedResult.get(key), value));
        expectedResult.forEach((key, value) -> assertEquals(result.get(key), value));

    }

    @Test
    public void connectWiresToOrTest() {

        PuzzleOne puzzle = new PuzzleOne();

        // expected result
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("x", 123);
        expectedResult.put("y", 456);
        expectedResult.put("e", 507);

        // result
        Map<String, Integer> input = new HashMap<>();
        input.put("x", 123);
        input.put("y", 456);

        Map<String, Integer> result = puzzle.connectWiresToOr(input, "x OR y -> e");

        // compare
        result.forEach((key, value) -> assertEquals(expectedResult.get(key), value));
        expectedResult.forEach((key, value) -> assertEquals(result.get(key), value));

    }

    @Test
    public void connectWiresToLeftShiftTest() {

        PuzzleOne puzzle = new PuzzleOne();

        // expected result
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("x", 123);
        expectedResult.put("f", 492);

        // result
        Map<String, Integer> input = new HashMap<>();
        input.put("x", 123);

        Map<String, Integer> result = puzzle.connectWiresToLeftShift(input, "x LSHIFT 2 -> f");

        // compare
        result.forEach((key, value) -> assertEquals(expectedResult.get(key), value));
        expectedResult.forEach((key, value) -> assertEquals(result.get(key), value));

    }

    @Test
    public void connectWiresToRightShiftTest() {

        PuzzleOne puzzle = new PuzzleOne();

        // expected result
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("y", 456);
        expectedResult.put("g", 114);

        // result
        Map<String, Integer> input = new HashMap<>();
        input.put("y", 456);

        Map<String, Integer> result = puzzle.connectWiresToRightShift(input, "y RSHIFT 2 -> g");

        // compare
        result.forEach((key, value) -> assertEquals(expectedResult.get(key), value));
        expectedResult.forEach((key, value) -> assertEquals(result.get(key), value));

    }

    @Test
    public void connectWiresToNotTest() {

        PuzzleOne puzzle = new PuzzleOne();

        // expected result
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("x", 123);
        expectedResult.put("y", 456);
        expectedResult.put("h", 65412);
        expectedResult.put("i", 65079);

        // result
        Map<String, Integer> input = new HashMap<>();
        input.put("x", 123);
        input.put("y", 456);

        Map<String, Integer> result = puzzle.connectWiresToNot(input, "NOT x -> h");
        puzzle.connectWiresToNot(result, "NOT y -> i");

        // compare
        result.forEach((key, value) -> assertEquals(expectedResult.get(key), value));
        expectedResult.forEach((key, value) -> assertEquals(result.get(key), value));

    }

    @Test
    public void getPuzzleAnswer() {

        // todo: controleren of het goed kan gaan met dubbele letters

        PuzzleOne puzzle = new PuzzleOne();

        ArrayList<String> list = GenericFunctions.getInputFromFile("C:\\Users\\Marcel\\IdeaProjects\\adventofcode2015\\src\\main\\java\\day07\\objects\\input");

        Map<String, Integer> result = puzzle.getSignals(list);

        System.out.println(result.get("a"));

    }

}
