package chapter6_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 4. Write a program that reads a file containing data about
 * the changing popularity of various baby names over time and
 * displays the data about a particular name. Each line of the
 * file stores a name followed by integers representing the
 * name’s popularity in each decade: 1900, 1910, 1920, and so on.
 * The rankings range from 1 (most popular) to 1000
 * (least popular), or 0 for a name that was less popular than the 1000th name.
 *
 * @author Mr.Dr.Professor
 * @since 04-Jan-21 5:00 PM
 */
class PP6_4_namePopularity {
  public static void main(String[] args) throws FileNotFoundException {
    intro();
    String name = prompt();
    search(name, new Scanner(new File("baby.txt")));
  }

  private static void search(String name, Scanner input) {
    boolean found = false;
    while (input.hasNextLine() && !found) {
      String line = input.nextLine();
      if (!line.startsWith(name)) {
        continue;
      }

      found = true;
      printStatistics(line);
    }

    if (!found)
      System.out.println("No statistics for the name \"" + name + "\"");
  }

  private static void printStatistics(String line) {
    Scanner tokenReader = new Scanner(line);
    System.out.println("Statistics of name \"" + tokenReader.next() + "\":");
    for (int i = 1900; i <= 2000; i += 10) {
      System.out.printf("%-4s%d: %d\n", " ", i, tokenReader.nextInt());
    }
  }

  private static String prompt() {
    System.out.print("Name? ");
    return new Scanner(System.in).next();
  }

  private static void intro() {
    System.out.println(
            "This program allows you to search through the\n" +
            "data from the Social Security Administration\n" +
            "to see how popular a particular name has been\n" +
            "since 1900.\n" + "=".repeat(45)
    );
  }
}
