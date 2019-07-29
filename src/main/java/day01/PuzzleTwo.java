package day01;

public class PuzzleTwo {


    public int getPosition(String instruction) {

        //initialise floor and position
        int floor = 0;
        int position = 0;

        //iterate through the instruction, char-by-char
        for (char ch : instruction.toCharArray()) {

            //next position in the instruction
            position++;

            //go up
            if (ch == '(') {

                floor++;

            }

            //go down
            else if (ch == ')') {

                floor--;

            }

            if (floor == -1) {

                return position;

            }

        }

        //return -1 if the basement is not entered
        return -1;

    }

}
