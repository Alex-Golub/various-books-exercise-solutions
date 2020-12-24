package chapter5_logic_and_loops;

import java.util.Random;
import java.util.Scanner;

/**
 * 7. Write a method called diceSum that accepts a
 * Scanner for the console as a parameter and prompts for a desired
 * sum, then repeatedly simulates the rolling of 2 six-sided dice
 * until their sum is the desired sum.
 *
 * @author Mr.Dr.Professor
 * @since 19-Dec-20 8:53 PM
 */
class Ex5_7_diceSum {
  public static void main(String[] args) {
    diceSum();
  }

  public static void diceSum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Desired dice sum: ");
    int sum = sc.nextInt();

    Random rnd = new Random();
    int    r1, r2, rollSum;
    do {
      r1 = rnd.nextInt(6) + 1;
      r2 = rnd.nextInt(6) + 1;
      rollSum = r1 + r2;
      System.out.printf("%d and %d = %d\n", r1, r2, rollSum);
    } while (rollSum != sum);
  }
}
