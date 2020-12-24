package chapter5_logic_and_loops;

import java.util.Random;

/**
 * 4. Write a method called randomX that prints a lines
 * that contain a random number of “x” characters
 * (between 5 and 19 inclusive) until it prints a line
 * that contains 16 or more characters.
 *
 * @author Mr.Dr.Professor
 * @since 19-Dec-20 6:50 PM
 */
class Ex5_4_randomX {
  public static void main(String[] args) {
    randomX();
  }

  public static void randomX() {
    Random    rnd = new Random();
    final int MAX = 16;
    int       n;

    do {
      n = rnd.nextInt(15) + 5;
      printX(n);
//      System.out.println("x".repeat(n)); // works with Java >= 1.11
    } while (n < MAX);
  }

  public static void printX(int n) {
    while (n-- > 0)
      System.out.print("x");
    System.out.println();
  }
}
