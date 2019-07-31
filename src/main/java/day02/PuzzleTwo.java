package day02;

import day02.objects.Present;

import java.util.Arrays;

public class PuzzleTwo {

    public int getRibbonToWrap(String dimensions) {

        Present present = getPresentFromString(dimensions);

        int[] distances = {present.getLength(), present.getWidth(), present.getHeight()};
        Arrays.sort(distances);

        return (2 * distances[0]) + (2 * distances[1]);

    }

    public int getRibbonForBow(String dimensions) {

        Present present = getPresentFromString(dimensions);

        return present.getLength() * present.getWidth() * present.getHeight();

    }

    public int getTotalFeetOfRibbon(String dimensions) {

        return getRibbonToWrap(dimensions) + getRibbonForBow(dimensions);

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
