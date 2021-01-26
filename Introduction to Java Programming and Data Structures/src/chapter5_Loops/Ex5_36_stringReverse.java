package chapter5_Loops;

import java.util.Scanner;

/**
 * *5.46 (Reverse a string)
 *
 * @author Mr.Dr.Professor
 * @since 26-Jan-21 9:52 PM
 */
class Ex5_36_stringReverse {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String in = console.nextLine();

    int length = in.length();
    if (length == 0) {
      System.out.println("String is empty");
    } else {
      for (int i = length - 1; i >= 0; i--)
        System.out.print(in.charAt(i));
    }
  }
}
