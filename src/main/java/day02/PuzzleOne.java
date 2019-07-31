package day02;

import day02.objects.Present;

import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleOne {

    public int getSquareFeetOfWrappingPaper(String dimensions) {

        return getSurfaceArea(dimensions) + getSlack(dimensions);

    }

    public int getSurfaceArea(String dimensions) {

        //get the real dimensions from the String dimensions
        Present present = getPresentFromString(dimensions);

        //apply formula: 2*l*w + 2*w*h + 2*h*l
        return  (2 * present.getLength() * present.getWidth()) +
                (2 * present.getWidth() * present.getHeight()) +
                (2 * present.getHeight() * present.getLength());

    }

    public int getSlack(String dimensions) {

        //get the real dimensions from the String dimensions
        Present present = getPresentFromString(dimensions);

        //now make them into sides
        int side1 = present.getLength() * present.getWidth();
        int side2 = present.getWidth() * present.getHeight();
        int side3 = present.getHeight() * present.getLength();

        //return the smallest
        int[] sides = {side1, side2, side3};
        Arrays.sort(sides);

        return sides[0];

    }

    public Present getPresentFromString(String dimensions) {

        int firstDivider = dimensions.indexOf("x");
        int secondDivider = dimensions.indexOf("x", firstDivider + 1);

        return new Present(

                Integer.parseInt(dimensions.substring(0, firstDivider)),
                Integer.parseInt(dimensions.substring(firstDivider + 1, secondDivider)),
                Integer.parseInt(dimensions.substring(secondDivider + 1))

        );

    }
}
