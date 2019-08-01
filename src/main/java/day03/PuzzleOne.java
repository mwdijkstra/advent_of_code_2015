package day03;

import day03.objects.Location;

import java.util.HashMap;
import java.util.Map;

public class PuzzleOne {

    private int count;

    public int getHousesDelivered(String instruction) {

        Location currentLocation = new Location(0, 0);
        Map<Location, Integer> grid = new HashMap<>();
        grid.put(currentLocation, 1);

        for (char c : instruction.toCharArray()) {

            Location updatedLocation = getUpdatedLocation(currentLocation, c);

            //todo: create function to add to the grid
            if (grid.containsValue(currentLocation)) {

                grid.put(currentLocation, grid.get(currentLocation) + 1);

            } else {

                grid.put(currentLocation, 1);

            }

        }

        grid.forEach((key, value) -> { if (value > 0) { count++; }});

        return count;

    }

    public Location getUpdatedLocation(Location currentLocation, char c) {

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

        return currentLocation;

    }

}
