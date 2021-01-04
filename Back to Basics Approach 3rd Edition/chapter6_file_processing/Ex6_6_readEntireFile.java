package chapter6_file_processing;

import java.util.Scanner;

/**
 * 6. Write a method called readEntireFile that accepts a
 * Scanner representing an input file as its parameter, then
 * reads that file and returns its entire text contents as a String.
 *
 * @author Mr.Dr.Professor
 * @since 29-Dec-20 11:35 PM
 */
class Ex6_6_readEntireFile {
  public static void main(String[] args) {
    String test = "Write a method named readEntireFile that accepts\n" +
                  "a Scanner representing an input file as its parameter,\n" +
                  "then reads that file and returns the entire text\n" +
                  "contents of that file as a String.";
    System.out.println(readEntireFile(new Scanner(test)));
  }

  public static String readEntireFile(Scanner input) {
    StringBuilder content = new StringBuilder();

    while (input.hasNextLine())
      content.append(input.nextLine() + "\n");

    return content.toString();
  }
}
