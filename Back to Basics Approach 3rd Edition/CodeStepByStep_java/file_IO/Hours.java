package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/Hours
 *
 * Input file? hours.txt
 * Amy (ID#123) worked 31.5 hours (7.9/day)
 * Miles (ID#456) worked 37.0 hours (7.4/day)
 * Jessie (ID#802) worked 1.5 hours (1.5/day)
 * Vilde (ID#647) worked 18.0 hours (6.0/day)
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 10:03 PM
 */
/*public*/ class Hours {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(System.in);
    System.out.print("Input file? ");
    String fileName = console.next();

    Scanner fileReader = new Scanner(new File(fileName));
    while (fileReader.hasNextLine()) {
      Scanner tokenReader = new Scanner(fileReader.nextLine());
      int id = tokenReader.nextInt();
      String name = tokenReader.next();

      double totalHoursWorked = 0;
      int daysWorked = 0;
      while (tokenReader.hasNextDouble()) {
        daysWorked++;
        totalHoursWorked += tokenReader.nextDouble();
      }

      System.out.printf("%s (ID#%d) worked %.1f hours (%.1f/day)\n",
                        name, id, totalHoursWorked, totalHoursWorked / daysWorked);
    }
  }
}
