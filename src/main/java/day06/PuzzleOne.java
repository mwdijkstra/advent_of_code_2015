package day06;

public class PuzzleOne {

    public int[][] updateGrid(String instruction, int[][] grid) {

        if (instruction.contains("turn on")) {

            // get the coordinates from the string
            int[] coordinates = getCoordinates(instruction);

            // update the grid
            for (int i = coordinates[0]; i <= coordinates[2]; i++){

                for (int j = coordinates[1]; j <= coordinates[3]; j++) {

                    grid[i][j] = 1;

                }

            }

        }

        if (instruction.contains("turn off")) {

            // get the coordinates from the string
            int[] coordinates = getCoordinates(instruction);

            // update the grid
            for (int i = coordinates[0]; i <= coordinates[2]; i++){

                for (int j = coordinates[1]; j <= coordinates[3]; j++) {

                    grid[i][j] = 0;

                }

            }

        }

        if (instruction.contains("toggle")) {

            // get the coordinates from the string
            int[] coordinates = getCoordinates(instruction);

            // update the grid
            for (int i = coordinates[0]; i <= coordinates[2]; i++){

                for (int j = coordinates[1]; j <= coordinates[3]; j++) {

                    if (grid[i][j] == 1) {

                        grid[i][j] = 0;

                    } else {

                        grid[i][j] = 1;

                    }

                }

            }

        }

        return grid;

    }

    public int[] getCoordinates(String instruction) {

        int[] coordinates = new int[4];
        try {
            coordinates[0] = Integer.parseInt(instruction
                    .substring(0, instruction.indexOf(','))
                    .replaceAll("[^0-9]", "")
                    .trim());

            coordinates[1] = Integer.parseInt(instruction
                    .substring(instruction.indexOf(','), instruction.indexOf("through"))
                    .replaceAll("[^0-9]", "")
                    .trim());

            coordinates[2] = Integer.parseInt(instruction.
                    substring(instruction.indexOf("through") + 7, instruction.indexOf(",", instruction.indexOf(",") + 1))
                    .trim());

            coordinates[3] = Integer.parseInt(instruction.
                    substring(instruction.indexOf(",", instruction.indexOf(",") + 1))
                    .replaceAll("[^0-9]", "")
                    .trim());
        } catch (Exception e) {

            System.out.println("Went wrong with instruction: " + instruction);
            System.out.println("Coordinates: " + coordinates[0] + "," + coordinates[1] + " through " + coordinates[2] + "," +  coordinates[3]);

        }

        return coordinates;

    }

    public int countTheGrid(int[][] grid) {

        // count the grid
        int count = 0;

        for (int i = 0; i < 1000; i++){

            for (int j = 0; j < 1000; j++){

                count = count + grid[i][j];

            }

        }

        return count;

    }

}
