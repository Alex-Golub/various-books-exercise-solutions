package chapter6_Methods;

import java.util.Scanner;

/**
 * *6.17 (Display matrix of 0s and 1s)
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 7:35 PM
 */
class Ex6_17_matrixOfOneAndZero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("Enter n: ");
      printMatrix(sc.nextInt());
    }
  }

  // generate square matrix of random 1 and 0 values
  public static void printMatrix(int n) {
    if (n < 0)
      throw new IllegalArgumentException("n can't be -ve value: " + n);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print((int) (Math.random() * 2));

        if (j + 1 < n)
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
