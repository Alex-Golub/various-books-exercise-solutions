package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * 3.26 (Use the &&, || and ^ operators)
 * <p>
 * Created by ag on 28-Oct-20 1:22 PM
 */
class Ex3_26_Bitwise_Op {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = scanner.nextInt();

    final int BY_X  = 4;
    final int BY_Y  = 5;
    boolean   xAndY = num % BY_X == 0 && num % BY_Y == 0;
    boolean   xOrY  = num % BY_X == 0 || num % BY_Y == 0;
    boolean   xXorY = num % BY_X == 0 ^ num % BY_Y == 0;
    System.out.printf("Is %d divisible by %d and %d? %b\n",
            num, BY_X, BY_Y, xAndY);
    System.out.printf("Is %d divisible by %d or %d? %b\n",
            num, BY_X, BY_Y, xOrY);
    System.out.printf("Is %d divisible by %d or %d but not both? %b\n",
            num, BY_X, BY_Y, xXorY);
  }
}
