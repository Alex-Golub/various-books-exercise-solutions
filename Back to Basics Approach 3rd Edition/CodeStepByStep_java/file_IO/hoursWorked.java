package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/hoursWorked
 *
 * 123 Alex 3 2 4 1
 * 46 Jessica 8.5 1.5 5 5 10 6
 * 7289 Erik 3 6 4 4.68 4
 *
 * Alex     (ID#  123) worked 10.0 hours (2.50/day)
 * Jessica  (ID#   46) worked 36.0 hours (6.00/day)
 * Erik     (ID# 7289) worked 21.7 hours (4.34/day)
 *
 * @author Mr.Dr.Professor
 * @since 11-Mar-21 10:35 PM
 */
/*public*/ class hoursWorked {
  public static void main(String[] args) throws FileNotFoundException {
    String mockData = "123 Alex 3 2 4 1\n" +
                      "46 Jessica 8.5 1.5 5 5 10 6\n" +
                      "7289 Erik 3 6 4 4.68 4";
    hoursWorked(mockData);
  }

  public static void hoursWorked(String fileName) throws FileNotFoundException {
    Scanner fileReader = new Scanner(new File(fileName));
//    Scanner fileReader = new Scanner(fileName);

    while (fileReader.hasNextLine()) {
      Scanner tokenReader = new Scanner(fileReader.nextLine());

      int id = tokenReader.nextInt();
      String name = tokenReader.next();
      double totalHoursWorked = 0.0;
      int daysWorked = 0;
      while (tokenReader.hasNext()) {
        totalHoursWorked += tokenReader.nextDouble();
        daysWorked++;
      }

      System.out.printf("%-9s(ID# %4d) worked %.1f hours (%.2f/day)\n",
                        name, id, totalHoursWorked,
                        totalHoursWorked / daysWorked);
    }
  }
}
