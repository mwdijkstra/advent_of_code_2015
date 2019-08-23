package day03;

import day03.objects.Location;

import java.util.HashMap;
import java.util.Map;

public class PuzzleTwo {

    //todo: logging!!!

    public int getHousesDelivered(String instruction) {

        Location santaLocation = new Location(0, 0);
        Location robotLocation = new Location(0, 0);

        Map<Location, Integer> santaGrid = new HashMap<>();
        Map<Location, Integer> robotGrid = new HashMap<>();

        santaGrid.put(new Location(santaLocation.getVertical(), santaLocation.getHorizontal()), 1);
        robotGrid.put(new Location(robotLocation.getVertical(), robotLocation.getHorizontal()), 1);

        int count = 0;

        for (char c : instruction.toCharArray()) {

            // Santa's turn to move
            if (count % 2 != 0) {

                updateCurrentLocation(santaLocation, c);

                if (santaGrid.containsValue(santaLocation)) {

                    int value = santaGrid.get(santaLocation);

                    santaGrid.put(new Location(santaLocation.getVertical(), santaLocation.getHorizontal()), value + 1);

                } else {

                    santaGrid.put(new Location(santaLocation.getVertical(), santaLocation.getHorizontal()), 1);

                }

            }

            // Robot turn to move
            else {

                updateCurrentLocation(robotLocation, c);

                if (robotGrid.containsValue(robotLocation)) {

                    int value = robotGrid.get(robotLocation);

                    robotGrid.put(new Location(robotLocation.getVertical(), robotLocation.getHorizontal()), value + 1);

                } else {

                    robotGrid.put(new Location(robotLocation.getVertical(), robotLocation.getHorizontal()), 1);

                }

            }

        }

        count++;

        return santaGrid.size() + robotGrid.size();

    }

    public void updateCurrentLocation(Location location, char c) {

        switch(c) {

            case '^' :
                location.setVertical(location.getVertical() + 1);
                break;

            case '>' :
                location.setHorizontal(location.getHorizontal() + 1);
                break;

            case 'v' :
                location.setVertical(location.getVertical() - 1);
                break;

            case '<' :
                location.setHorizontal(location.getHorizontal() - 1);
                break;

        }

    }

}
