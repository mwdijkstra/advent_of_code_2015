package day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PuzzleOne {

    public static final boolean LOGGING = false;

    // todo: connectWiresToGate

    public Map<String, Integer> getSignals(ArrayList<String> circuit) {

        Map<String, Integer> resultingSignals = new HashMap<>();

        for (String instruction : circuit) {

            System.out.println(instruction);

            switch (instruction.replaceAll("[^A-Z]", "")) {

                case "AND":
                    resultingSignals = connectWiresToAnd(resultingSignals, instruction);
                    break;

                case "OR":
                    resultingSignals = connectWiresToOr(resultingSignals, instruction);
                    break;

                case "RSHIFT":
                    resultingSignals = connectWiresToRightShift(resultingSignals, instruction);
                    break;

                case "LSHIFT":
                    resultingSignals = connectWiresToLeftShift(resultingSignals, instruction);
                    break;

                case "NOT":
                    resultingSignals = connectWiresToNot(resultingSignals, instruction);
                    break;

                default:
                    resultingSignals = connectWires(resultingSignals, instruction);

            }

        }

        if (LOGGING) {

            printSignals(resultingSignals);

        }

        return resultingSignals;

    }

    private void printSignals(Map<String, Integer> resultingSignals) {

        resultingSignals.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    public Map<String, Integer> connectWires(Map<String, Integer> signals, String instruction) {

        // x -> y

        int x = Integer.parseInt(instruction.substring(0, instruction.indexOf("->")).trim());
        String y = instruction.substring(instruction.indexOf("->") + 2).trim();

        signals.put(y,x);

        return signals;

    }

    public Map<String, Integer> connectWiresToAnd(Map<String, Integer> signals, String instruction) {

        // x AND y -> z

        String key1 = instruction.substring(0, instruction.indexOf("AND")).trim();
        String key2 = instruction.substring(instruction.indexOf("AND") + 3, instruction.indexOf("->")).trim();

        int x = 0;
        int y = 0;

        if (signals.containsKey(key1)) { x = signals.get(key1); }
        if (signals.containsKey(key2)) { y = signals.get(key2); }

        String z = instruction.substring(instruction.indexOf("->") + 2).trim();

        signals.put(z,x&y);

        return signals;

    }

    public Map<String, Integer> connectWiresToOr(Map<String, Integer> signals, String instruction) {

        // x OR y -> z

        String key1 = instruction.substring(0, instruction.indexOf("OR")).trim();
        String key2 = instruction.substring(instruction.indexOf("OR") + 2, instruction.indexOf("->")).trim();

        int x = 0;
        int y = 0;

        if (signals.containsKey(key1)) { x = signals.get(key1); }
        if (signals.containsKey(key2)) { y = signals.get(key2); }

        String z = instruction.substring(instruction.indexOf("->") + 2).trim();

        signals.put(z,x|y);

        return signals;

    }

    public Map<String, Integer> connectWiresToLeftShift(Map<String, Integer> signals, String instruction) {

        // x LSHIFT y -> z

        String key1 = instruction.substring(0, instruction.indexOf("LSHIFT")).trim();

        int x = 0;
        int y = Integer.parseInt(instruction.substring(instruction.indexOf("LSHIFT") + 6, instruction.indexOf("->")).trim());

        if (signals.containsKey(key1)) { x = signals.get(key1); }

        String z = instruction.substring(instruction.indexOf("->") + 2).trim();

        signals.put(z,x<<y);

        return signals;

    }

    public Map<String, Integer> connectWiresToRightShift(Map<String, Integer> signals, String instruction) {

        // x RSHIFT y -> z

        String key1 = instruction.substring(0, instruction.indexOf("RSHIFT")).trim();

        int x = 0;
        int y = Integer.parseInt(instruction.substring(instruction.indexOf("RSHIFT") + 6, instruction.indexOf("->")).trim());

        if (signals.containsKey(key1)) { x = signals.get(key1); }

        String z = instruction.substring(instruction.indexOf("->") + 2).trim();

        signals.put(z,x>>y);

        return signals;

    }

    public Map<String, Integer> connectWiresToNot(Map<String, Integer> signals, String instruction) {

        // NOT a -> b

        String key1 = instruction.substring(instruction.indexOf("NOT") + 3, instruction.indexOf("->")).trim();

        int a = 0;

        if (signals.containsKey(key1)) { a = signals.get(key1); }

        System.out.println(a);

        String b = instruction.substring(instruction.indexOf("->") + 2).trim();

        //todo: waarom die 0xFFFF???
        signals.put(b,~a & 0xFFFF);

        return signals;

    }

}
