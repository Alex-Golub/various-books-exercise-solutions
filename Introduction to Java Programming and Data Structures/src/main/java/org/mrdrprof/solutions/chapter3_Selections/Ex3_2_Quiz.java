package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * 3.2 (Game: multiply three numbers)
 * Generate three single-digit integers and prompt the user
 * to enter the multiplication of these three integers.
 *
 * Created by ag on 22-Oct-20 9:01 AM
 */
class Ex3_2_Quiz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int rnd = 100 + (int) (Math.random() * 900); // [100, 999]
      int x = rnd % 10;
      int y = rnd / 10 % 10;
      int z = rnd / 100;

      System.out.printf("%d * %d * %d = ", x, y, z);

      int answer = scanner.nextInt();
      int result = x * y * z;
      System.out.println(answer == result ?
              "Correct!" : "Incorrect, result is " + result);
    }
  }
}
