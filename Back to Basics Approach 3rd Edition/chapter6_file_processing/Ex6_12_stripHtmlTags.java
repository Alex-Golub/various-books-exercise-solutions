package chapter6_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 12. Write a method called stripHtmlTags that accepts a Scanner
 * representing an input file containing an HTML web
 * page as its parameter, then reads that file and prints the
 * file’s text with all HTML tags removed.
 * You may assume that the file is a well-formed HTML document
 * and that there are no < or > characters inside tags.
 *
 * @author Mr.Dr.Professor
 * @since 31-Dec-20 8:37 PM
 */
class Ex6_12_stripHtmlTags {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner input = new Scanner(new File("webpage.html"));
    stripHtmlTags(input);
//    stripHtmlTagsV2(input);
  }

  public static void stripHtmlTags(Scanner input) {
    while (input.hasNextLine()) {
      StringBuilder line = new StringBuilder(input.nextLine());

      int l = line.indexOf("<");
      int r = line.indexOf(">");
      while (l < r) {
        line.replace(l, r + 1, "");
        l = line.indexOf("<", l);
        r = line.indexOf(">", r);
      }

      System.out.println(line);
    }
  }

  public static void stripHtmlTagsV2(Scanner input) {
    while (input.hasNextLine()) {
      String line = input.nextLine();

      boolean inTag = false;
      for (int i = 0; i < line.length(); i++) {
        char c = line.charAt(i);
        if (c == '<')      inTag = true;
        else if (c == '>') inTag = false;
        else if (!inTag)   System.out.print(c);
      }

      System.out.println();
    }
  }
}
