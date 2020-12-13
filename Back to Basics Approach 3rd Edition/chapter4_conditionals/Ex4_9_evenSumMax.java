package chapter4_conditionals;

import java.util.Scanner;

/**
 * 9. Write a method called evenSumMax.
 * Method should print the sum of all the even numbers the user typed,
 * along with the largest even number typed.
 * You may assume that the user will type at least one nonnegative even integer.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 5:25 PM
 */
class Ex4_9_evenSumMax {
  public static void evenSum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("how many integers? ");
    int n = sc.nextInt();

    int evenSum = 0;
    int evenMax = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      System.out.print("next integer? ");
      int next = sc.nextInt();
      if (next % 2 == 0) {
        evenSum += next;
        if (next > evenMax)
          evenMax = next;
      }
    }

    System.out.println("even sum = " + evenSum);
    System.out.println("even max = " + evenMax);
  }
}
