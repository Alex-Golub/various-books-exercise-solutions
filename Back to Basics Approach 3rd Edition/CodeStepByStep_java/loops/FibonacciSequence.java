package CodeStepByStep_java.loops;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/FibonacciSequence
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 5:23 PM
 */
/*public*/ class FibonacciSequence {
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("This program lists the Fibonacci sequence.");
    System.out.print("Max value? ");
    int maxValue = console.nextInt();

    if (maxValue > 0) {
      System.out.print(0);
      int f1 = 0, f2 = 1;
      while (f2 <= maxValue) {
        System.out.print(", " + f2);
        f2 += f1;
        f1 = f2 - f1;
      }
    }
  }
}
