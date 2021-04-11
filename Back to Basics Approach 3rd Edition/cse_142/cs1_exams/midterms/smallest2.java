package cse_142.cs1_exams.midterms;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm9/smallest2
 *
 * test #3:test 3
 * console output:
 * number? 5
 * number? 5
 * number? 5
 * number? 5
 * number? -3
 * smallest: 5
 * second smallest: 5
 *
 * @author Alex Golub
 * @since 11-Apr-21 6:16 PM
 */
class smallest2 {
  public static void main(String[] args) {
    smallest2(new Scanner(System.in));
  }

  public static void smallest2(Scanner scanner) {
    int smallest = Integer.MAX_VALUE;
    int secSmallest = Integer.MAX_VALUE;
    while (true) {
      System.out.print("number? ");
      int next = scanner.nextInt();
      if (next < 0) {
        break;
      }

      if (next < smallest) {
        secSmallest = smallest;
        smallest = next;
      } else if (next < secSmallest) {
        secSmallest = next;
      }
    }

    System.out.println("smallest: " + smallest);
    System.out.println("second smallest: " + secSmallest);
  }
}
