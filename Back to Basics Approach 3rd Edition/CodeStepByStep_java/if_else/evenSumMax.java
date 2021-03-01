package CodeStepByStep_java.if_else;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/ifelse/evenSumMax
 *
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 1:24 AM
 */
/*public*/ class evenSumMax {
  public static void main(String[] args) {
    evenSumMax();
  }

  public static void evenSumMax() {
    Scanner console = new Scanner(System.in);
    int evenSum = 0;
    int evenMax = Integer.MIN_VALUE;

    System.out.print("how many integers? ");
    int n = console.nextInt();

    while (n-- > 0) {
      System.out.print("next integer? ");
      int in = console.nextInt();

      if (in % 2 == 0) {
        evenSum += in;
        evenMax = Math.max(evenMax, in);
      }
    }

    System.out.println("even sum = " + evenSum);
    System.out.println("even max = " + evenMax);
  }
}
