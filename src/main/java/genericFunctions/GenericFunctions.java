package genericFunctions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GenericFunctions {

    public static ArrayList<String> getInputFromFile(String location) {

        //read input file
        Scanner scanner = null;

        try {

            scanner = new Scanner(new File(location));

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

        //put into a list
        ArrayList<String> list = new ArrayList<>();

        while (scanner.hasNext()) {
            list.add(scanner.next());
        }

        scanner.close();

        return list;

    }

}
