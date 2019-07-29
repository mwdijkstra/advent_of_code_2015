package day01;

public class PuzzleOne {

    public int getFloor(String instruction) {

        //initialise floor
        int floor = 0;

        //iterate through the instruction, char-by-char
        for (char ch : instruction.toCharArray()) {

            //go up
            if (ch == '(') {

                floor++;

            }

            //go down
            if (ch == ')') {

                floor--;

            }

        }

        return floor;

    }

}
