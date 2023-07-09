package org.mrdrprof.solutions.chapter6_Methods;

/**
 * 6.12 (Display numbers)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 3:40 PM
 */
class Ex6_12_displayNumbers {
  public static void main(String[] args) {
    printNumbers(1, 100, 10);
  }

  // prints numberPerLine characters in range [num1, num2]
  public static void printNumbers(int num1, int num2, int numberPerLine) {
    if (num1 < 0 || num2 < 0 || numberPerLine <= 0)
      throw new IllegalArgumentException("One or more arguments are invalid: " +
                                         "num1 = " + num1 + ", num2 = " + num2 +
                                         " numberPerLine = " + numberPerLine);

    for (int i = num1, count = 1; i <= num2; i++, count++) {
      System.out.print((char) i);

      if (count % numberPerLine == 0) {
        System.out.println();
      } else {
        System.out.print(" ");
      }
    }
  }
}
