package chapter4_Control_Statements_Part_1._4_36_Right_Triangle;

import java.util.Scanner;

/**
 * 4.36 (Sides of a Right Triangle) Write an application that reads three nonzero integers and
 * determines and prints whether they could represent the sides of a right triangle.
 *
 * Created by ag on 29-Jun-20 4:52 PM
 */
class RightTriTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter first side: ");
      int s1 = Integer.parseInt(scanner.nextLine());

      System.out.print("Enter second side: ");
      int s2 = Integer.parseInt(scanner.nextLine());

      System.out.print("Enter third side: ");
      int s3 = Integer.parseInt(scanner.nextLine());

      if (isValidRightTriangle(s1, s2, s3))
        System.out.println("Sides can make a valid right triangle");
      else
        System.out.println("Valid right triangle can't be made!");

      System.out.print("\nContinue? (1 - yes, 0 - exit) -> ");
      String choice = scanner.nextLine();
      if ("0".equals(choice))
        break;
    }

    System.out.println("\nBye!");
  }

  /**
   * 1. a, b and c should be greater then 0.
   * 2. Sum of any two sides of triangle must be greater than the third side.
   * 3. Pythagorean Theorem i.e., a2 + b2 = c2.
   */
  private static boolean isValidRightTriangle(int s1, int s2, int s3) {
    if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
      System.out.println("Error: side must be value grater then zero, try again\n");
      return false;
    }

    if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1) {
      System.out.println("Error: Sum of any two sides of triangle are not grater then third side\n");
      return false;
    }

    if (s1 * s1 + s2 * s2 != s3 * s3) {
      System.out.println("Error: Pythagorean Theorem is not met\n");
      return false;
    }

    return true;
  }
}
