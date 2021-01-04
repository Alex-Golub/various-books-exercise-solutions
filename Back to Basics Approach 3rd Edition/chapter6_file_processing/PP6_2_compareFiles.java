package chapter6_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 2. Write a program that compares two files and
 * prints information about the differences between them.
 * You can use d1.txt and d2.txt from current directory or create
 * you own.
 *
 * @author Mr.Dr.Professor
 * @since 04-Jan-21 2:29 PM
 */
class PP6_2_compareFiles {
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) throws FileNotFoundException {
    intro();
    File f1 = prompt("first");
    File f2 = prompt("second");
    compareFiles(new Scanner(f1), new Scanner(f2));

    console.close();
  }

  private static void compareFiles(Scanner f1, Scanner f2) {
    boolean areDifferent = false;
    int     lineNumber   = 0;

    System.out.println("Differences found:");
    while (f1.hasNextLine() && f2.hasNextLine()) {
      lineNumber++;

      String line1 = f1.nextLine();
      String line2 = f2.nextLine();
      if (!line1.equals(line2)) {
        areDifferent = true;
        printLine(lineNumber, line1, line2);
      }
    }

    // Check if f1 has more content to printout
    while (f1.hasNextLine()) {
      lineNumber++;
      printLine(lineNumber, f1.nextLine(), "");
    }

    // Check if f2 has more content to printout
    while (f2.hasNextLine()) {
      lineNumber++;
      printLine(lineNumber, "", f2.nextLine());
    }

    if (!areDifferent)
      System.out.println("None! Files are same.");
  }

  private static void printLine(int lineNumber, String l1, String l2) {
    System.out.println("Line " + lineNumber + ":");
    System.out.println("< " + l1);
    System.out.println("> " + l2);
    System.out.println();
  }

  private static File prompt(String s) {
    File f;
    while (true) {
      System.out.print("Enter a " + s + " file name: ");
      f = new File(console.next());
      if (f.canRead())
        break;

      System.out.println(">> Error: " + f.getName() + " can't be read, try again");
    }

    return f;
  }

  private static void intro() {
    System.out.println(
            "This program compare two given files\n" +
            "and prints differences between them (if any).\n" +
            "=".repeat(45)
    );
  }
}
