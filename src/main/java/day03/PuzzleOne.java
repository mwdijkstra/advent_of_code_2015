package day03;

import day03.objects.Location;

import java.util.HashMap;
import java.util.Map;

public class PuzzleOne {

    public int getHousesDelivered(String instruction) {

        Location currentLocation = new Location(0, 0);
        Map<Location, Integer> grid = new HashMap<>();
        grid.put(new Location(currentLocation.getVertical(), currentLocation.getHorizontal()), 1);

        for (char c : instruction.toCharArray()) {

            updateCurrentLocation(currentLocation, c);

            if (grid.containsValue(currentLocation)) {

                int value = grid.get(currentLocation);

                grid.put(new Location(currentLocation.getVertical(), currentLocation.getHorizontal()), value + 1);

            } else {

                grid.put(new Location(currentLocation.getVertical(), currentLocation.getHorizontal()), 1);

            }

        }

        return grid.size();

    }

    public void updateCurrentLocation(Location currentLocation, char c) {

        switch(c) {

            case '^' :
                currentLocation.setVertical(currentLocation.getVertical() + 1);
                break;

            case '>' :
                currentLocation.setHorizontal(currentLocation.getHorizontal() + 1);
                break;

            case 'v' :
                currentLocation.setVertical(currentLocation.getVertical() - 1);
                break;

            case '<' :
                currentLocation.setHorizontal(currentLocation.getHorizontal() - 1);
                break;

        }

    }

}
