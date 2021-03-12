package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/averageValueInFile
 *
 * @author Mr.Dr.Professor
 * @since 10-Mar-21 11:35 PM
 */
/*public*/ class averageValueInFile {
  public static void main(String[] args) throws FileNotFoundException {
    String mockData = "1.5\n" +
                      "2.75\n" +
                      "9.0\n" +
                      "-3.25\n" +
                      "0.0\n" +
                      "6.5";
    System.out.println(averageValueInFile(mockData));
  }

  public static double averageValueInFile(String fileName) throws FileNotFoundException {
    double total = 0.0;
    int terms = 0;
    Scanner lineReader = new Scanner(new File(fileName));

    while (lineReader.hasNextDouble()) {
      total += lineReader.nextDouble();
      terms++;
    }

    return terms == 0 ? total : total / terms;
  }
}
