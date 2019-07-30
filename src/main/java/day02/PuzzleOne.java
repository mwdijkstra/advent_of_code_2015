package day02;

import day02.objects.Present;

public class PuzzleOne {

    public int getTotalSquareFeetOfWrappingPaper(String dimensions) {

        return getSurfaceArea(dimensions) + getSlack(dimensions);

    }

    public int getSurfaceArea(String dimensions) {

        Present present = getPresentFromString(dimensions);

        //then the formula: 2*l*w + 2*w*h + 2*h*l

        return 0;

    }

        public int getSlack(String dimensions) {

        return 0;

    }

    public Present getPresentFromString(String dimensions) {



        Present present = new Present(

                Integer.parseInt(dimensions.substring(0, dimensions.indexOf("x"))),
                Integer.parseInt(dimensions.substring(dimensions.indexOf("x") + 1, dimensions.indexOf("x", dimensions.indexOf("x") + 1))),
                Integer.parseInt(dimensions.substring(dimensions.indexOf("x", dimensions.indexOf("x") + 1)))

        );

        return present;

    }
}
