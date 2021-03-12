package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/Weather
 *
 * Input file? weather.txt
 * 16.2 to 23.2, change = 7.0
 * 23.2 to 19.2, change = -4.0
 * 19.2 to 7.7, change = -11.5
 * 7.7 to 22.9, change = 15.2
 * 22.9 to 18.4, change = -4.5
 * 18.4 to -1.6, change = -20.0
 * -1.6 to 14.6, change = 16.2
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 9:36 PM
 */
/*public*/ class Weather {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(System.in);
    System.out.print("Input file? ");
    String inputFile = console.next();

    Scanner reader = new Scanner(new File(inputFile));

    // find first double value
    double t1 = 0;
    while (reader.hasNext()) {
      try {
        t1 = Double.parseDouble(reader.next());
        break; // first double value has been found break
      } catch (NumberFormatException nfe) {
        // current token is not double value, continue searching
      }
    }

    while (reader.hasNext()) {
      try {
        double t2 = Double.parseDouble(reader.next());
        System.out.printf("%.1f to %.1f, change = %.1f\n", t1, t2, t2 - t1);
        t1 = t2;
      } catch (NumberFormatException nfe) {
        // current token is not double value, continue searching
      }
    }
  }
}
