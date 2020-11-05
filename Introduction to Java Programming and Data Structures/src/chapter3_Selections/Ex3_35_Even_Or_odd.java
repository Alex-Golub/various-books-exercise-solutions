package chapter3_Selections;

import java.util.Scanner;

/**
 * 3.35 (Even or odd number)
 *
 * Created by ag on 29-Oct-20 8:15 PM
 */
class Ex3_35_Even_Or_odd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter an integer: ");
      int num = scanner.nextInt();
      System.out.printf("%d is %s number\n\n", num, num % 2 == 0 ? "even" : "odd");
    }

  }
}
