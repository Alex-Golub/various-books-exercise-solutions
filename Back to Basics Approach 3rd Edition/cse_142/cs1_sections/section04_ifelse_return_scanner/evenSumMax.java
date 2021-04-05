package cse_142.cs1_sections.section04_ifelse_return_scanner;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/3762?categoryid=118
 *
 * how many integers? 5
 * next integer? 9
 * next integer? -5
 * next integer? 2
 * next integer?  19
 * next integer? 14
 * even sum = 16
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:40 PM
 */
class evenSumMax {
  public static void main(String[] args) {
    evenSum();
  }

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
