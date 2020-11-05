package chapter3_Selections;

import java.util.Scanner;

/**
 * 3.10 (Game: multiplication quiz)
 * Randomly generate a multiplication
 * question with two integers less than 1000.
 *
 * Created by ag on 22-Oct-20 11:18 AM
 */
class Ex3_10_Multiplication_Quiz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i <= 20; i++) {
      int rnd = (int) (Math.random() * 1_000_000); // [0, 999999]
      int n1 = rnd % 1000;
      int n2 = rnd / 1000 % 1000;

//      System.out.println(rnd + " : " + n1 + " : " + n2);
      System.out.printf("%d * %d = ", n1, n2);
      int answer = scanner.nextInt();

      int result = n1 * n2;
      if (answer == result) System.out.println("Correct!");
      else                  System.out.printf("Incorrect, correct answer is %,d\n", result);
    }
  }
}
