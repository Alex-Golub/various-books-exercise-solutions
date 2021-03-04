package CodeStepByStep_java.loops;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/SentinelSum
 *
 * Type a number: 10
 * Type a number: 20
 * Type a number: 30
 * Type a number: -1
 * Sum is 60
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 12:13 PM
 */
/*public*/ class SentinelSum {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    int sum = 0;
    while (true) {
      System.out.print("Type a number: ");
      int n = console.nextInt();

      if (n == -1) {
        break;
      }

      sum += n;
    }

    System.out.println("Sum is " + sum);
  }
}
