package CodeStepByStep_java.loops;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/BiggestAndSmallest
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 5:06 PM
 */
/*public*/ class BiggestAndSmallest {
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Number of numbers? ");
    int n = console.nextInt(); // user entered number > 0

    int biggest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for (int i = 1; i <= n; i++) {
      System.out.print("Number " + i + ": ");
      int in = console.nextInt();

      biggest = Math.max(biggest, in);
      smallest = Math.min(smallest, in);
    }

    System.out.println("Biggest = " + biggest);
    System.out.println("Smallest = " + smallest);
  }
}
