package chapter3_Selections;

import java.util.Scanner;

/**
 * *3.33 (Financial: compare costs)
 * Displays the one with the better price.
 * <p>
 * Created by ag on 29-Oct-20 7:36 PM
 */
class Ex3_33_Compare_Costs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter weight and price for package 1: ");
      double weight1 = scanner.nextDouble();
      double price1  = scanner.nextDouble();
      System.out.print("Enter weight and price for package 2: ");
      double weight2 = scanner.nextDouble();
      double price2  = scanner.nextDouble();

      double       total1  = weight1 / price1;
      double       total2  = weight2 / price2;
      final double EPSILON = 1e-14;

      if (Math.abs(total1 - total2) < EPSILON) {
        System.out.println("Two packages have the same price.");
      } else if (total1 > total2) {
        System.out.println("Package 1 has a better price");
      } else {
        System.out.println("Package 2 has a better price");
      }

      System.out.println();
    }
  }
}
