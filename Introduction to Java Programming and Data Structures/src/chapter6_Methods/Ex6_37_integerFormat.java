package chapter6_Methods;

import java.util.Scanner;

/**
 * 6.37 (Format an integer)
 * If the number is longer than the width, the method returns the
 * string representation for the number.
 *
 * @author Mr.Dr.Professor
 * @since 31-Jan-21 11:05 PM
 */
class Ex6_37_integerFormat {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter number: ");
      int number = scanner.nextInt();
      System.out.print("Enter width (0 or +ve number): ");
      int width = scanner.nextInt();

      System.out.println("Formatted number: " + format(number, width) + "\n");
    }
  }

  public static String format(int number, int width) {
    int numberSize = numberSize(number);

    if (numberSize >= width)
      return Integer.toString(number);

    // width > number, padding with (width - numberSize) zeros
    // append hyphen "-" if number < 0
    String res = "";
    if (number < 0) {
      res += "-";
      number *= -1;
    }

    return res + "0".repeat(width - numberSize) + number;
  }

  public static int numberSize(int number) {
    int size = 0;
    if (number <= 0) {
      size++;
      number *= -1;
    }

    while (number != 0) {
      number /= 10;
      size++;
    }

    return size;
  }

}
