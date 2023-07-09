package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * *12.31 (Baby name popularity ranking) The popularity ranking of baby names from
 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
 * in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
 * babynameranking2010.txt. You can download these files using the URL such
 * as http://liveexample.pearsoncmg.com/data/babynamesranking2001.txt. Each file
 * contains 1,000 lines. Each line contains a ranking, a boy’s name, number for the
 * boy’s name, a girl’s name, and number for the girl’s name. For example, the first
 * two lines in the file babynameranking2010.txt are as follows:
 * 1 Jacob 21,875 Isabella 22,731
 * 2 Ethan 17,866 Sophia 20,477
 * Therefore, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the
 * boy’s name Ethan and girl’s name Sophia are ranked #2; 21,875 boys are named
 * Jacob, and 22,731 girls are named Isabella. Write a program that prompts the
 * user to enter the year, gender, followed by a name, and displays the ranking
 * of the name for the year. Your program should read the data directly from the
 * Web. Here are some sample runs:
 * <p>
 * Enter the year: 2010
 * Enter the gender: M
 * Enter the name: Javier
 * Javier is ranked #190 in year 2010
 * <p>
 * Enter the year: 2010
 * Enter the gender: F
 * Enter the name: ABC
 * The name ABC is not ranked in year 2010
 *
 * @author Alex Golub
 * @since 11/06/2023 7:42 PM
 */
class Ex31 {

    private static final String PATH_TEMPLATE = "http://liveexample.pearsoncmg.com/data/babynamesranking%s.txt";

    public static void main(String[] args) {
        String[] data = processUserInput(); // [ name, gender, birthYear ]
        lookupPerson(data);
    }

    private static void lookupPerson(String[] data) {
        String name = data[0];
        String gender = data[1];
        String year = data[2];
        try {
            URL url = new URL(PATH_TEMPLATE.formatted(year));
            try (Scanner urlReader = new Scanner(url.openStream())) {
                boolean found = false;
                int rank = 0;
                while (urlReader.hasNextLine()) {
                    String line = urlReader.nextLine();
                    if (line.contains(name)) {
                        rank = Integer.parseInt(line.split("\\s+")[0]);
                        found = true;
                    }
                }

                if (found) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                } else {
                    System.out.println("The name " + name + " is not ranked in year " + year);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private static String[] processUserInput() {
        try (Scanner console = new Scanner(System.in)) {
            boolean correctInput = false;
            int birthYear = 2001;
            while (!correctInput) {
                System.out.print("Enter the year (2001 - 2010 inclusive): ");
                birthYear = Integer.parseInt(console.nextLine());
                if (birthYear < 2001 || birthYear > 2010) {
                    System.out.println("There is not data for the year " + birthYear + ", try again");
                } else {
                    correctInput = true;
                }
            }

            correctInput = false;
            String gender = "";
            while (!correctInput) {
                System.out.print("Enter the gender (M or F): ");
                gender = console.nextLine();
                if (!"m".equalsIgnoreCase(gender) && !"f".equalsIgnoreCase(gender)) {
                    System.out.println("There is no such gender as " + gender + ", try again");
                } else {
                    correctInput = true;
                }
            }

            System.out.print("Enter the name: ");
            String name = console.nextLine();

            return new String[] { name, gender, Integer.toString(birthYear) };
        }
    }
}
