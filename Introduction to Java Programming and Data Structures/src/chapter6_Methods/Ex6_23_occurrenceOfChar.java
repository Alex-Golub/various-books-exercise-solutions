package chapter6_Methods;

import java.util.Scanner;

/**
 * *6.23 (Occurrences of a specified character)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 10:14 PM
 */
class Ex6_23_occurrenceOfChar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter string: ");
      String s = scanner.nextLine();
      System.out.print("Enter character to count: ");
      char c = scanner.next().charAt(0);

      System.out.println("'" + c + "' occurred " + count(s, c) + " times in \"" + s + "\"\n");
      scanner.nextLine(); // clear buffer
    }
  }

  public static int count(String str, char a) {
    int count = 0;
    for (int i = 0; i < str.length(); i++)
      count += str.charAt(i) == a ? 1 : 0;
    return count;
  }
}
