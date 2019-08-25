package genericFunctions;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class GenericFunctions {

    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("HH:mm:ss:SSS");

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

        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }

        scanner.close();

        return list;

    }

    public static String getTime() {

        return SIMPLE_DATE_FORMAT.format(Calendar.getInstance().getTime());

    }

}
