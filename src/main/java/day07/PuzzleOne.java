package day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PuzzleOne {

    public static final boolean LOGGING = true;

    public Map<String, Integer> getSignals(ArrayList<String> circuit) {

        Map<String, Integer> resultingSignals = new HashMap<>();

        for (String instruction : circuit) {

            switch (instruction.replaceAll("[^A-Z]", "")) {

                case "AND":
                    // do something with AND
                    break;

                case "OR":
                    // do something with OR
                    break;

                case "RSHIFT":
                    // do something with OR
                    break;

                case "LSHIFT":
                    // do something with OR
                    break;

                case "NOT":
                    // do something with OR
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
        String key2 = instruction.substring(instruction.indexOf("AND" + 3), instruction.indexOf("->")).trim();

        System.out.println(key1);
        System.out.println(key2);

        int x = 0;
        int y = 0;

        if (signals.containsKey(key1)) { x = signals.get(key1); }
        if (signals.containsKey(key2)) { x = signals.get(key2); }

        String z = instruction.substring(instruction.indexOf("->") + 2).trim();
        System.out.println(z);

        signals.put(z,x&y);

        return signals;

    }

}
