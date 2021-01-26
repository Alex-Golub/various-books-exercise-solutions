package chapter5_Loops;

import java.util.Scanner;

/**
 * *5.47 (Business: check ISBN-13)
 * ISBN-13 - d1d2d3d4d5d6d7d8d9d10d11d12d13
 * d13 is a checksum digit.
 * If the checksum is 10, replace it with 0.
 *
 * @author Mr.Dr.Professor
 * @since 26-Jan-21 9:56 PM
 */
class Ex5_47_isbn13 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
    String in = console.next();

    int length = in.length();
    if (length != 12) {
      System.out.println(in + " is an invalid input");
      return;
    }

    int sum = 0;
    for (int i = 0; i < length; i++) {
      int digit = in.charAt(i) - '0';
      sum += i % 2 == 0 ? digit : 3 * digit;
    }

    int checksum = 10 - sum % 10;
    System.out.print("The ISBN-13 number is " + in + (checksum == 10 ? 0 : checksum));
  }
}
