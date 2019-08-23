package day04;

import java.security.MessageDigest;

public class Puzzle {

    // 5 for puzzle one, 6 for puzzle two
    public static final int NUMBER_OF_ZEROES_INT = 6;
    public static final String NUMBER_OF_ZEROES_STRING = "000000";

    public int getLowestNumber(String string) {

        int number = 1;

        while (true) {

            String hashed = getHash(string + number);

            if (hashed.substring(0, NUMBER_OF_ZEROES_INT).equals(NUMBER_OF_ZEROES_STRING)) {

                break;

            }

            number++;

        }

        return number;

    }

    public static String getHash(String input)  {

        StringBuffer sb = new StringBuffer();

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());

            byte byteData[] = md.digest();

            for (int i = 0; i < byteData.length; i++)
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));

        }

        catch (Exception e) {

            System.out.println("Er ging iets fout");

        }

        return sb.toString();

    }

}
