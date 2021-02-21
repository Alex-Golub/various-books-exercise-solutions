package CodeStepByStep_java.console_output;

import java.util.Scanner;

/**
 * Write a method named evenSumMax that prompts the user for many
 * integers and print the total even sum and maximum of the even numbers.
 * You may assume that the user types at least one non-negative even integer.
 *
 * how many integers? 4
 * next integer? 2
 * next integer? 9
 * next integer? 18
 * next integer? 4
 * even sum = 24
 * even max = 18
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 9:05 PM
 */
/*public*/ class evenSumMax {
  public static void main(String[] args) {
    evenSumMax();
  }

  public static void evenSumMax() {
    Scanner sc = new Scanner(System.in);
    System.out.print("how many integers? ");
    int n = Integer.parseInt(sc.nextLine());
    int evenSum = 0;
    int evenMax = 0;
    while (n-- > 0) {
      System.out.print("next integer? ");
      int next = Integer.parseInt(sc.nextLine());

      if (next % 2 == 0) {
        evenSum += next;
        evenMax = Math.max(evenMax, next);
      }
    }

    System.out.println("even sum = " + evenSum);
    System.out.println("even max = " + evenMax);
  }
}
