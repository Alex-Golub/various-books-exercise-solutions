package chapter4_Control_Statements_Part_1._4_35_Sides_Triangle;

import java.util.Scanner;

/**
 * 4.35 (Sides of a Triangle) Write an application that reads three nonzero values entered by the
 * user and determines and prints whether they could represent the sides of a triangle.
 *
 * Created by ag on 29-Jun-20 4:40 PM
 */
class SideTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter first side: ");
      int s1 = Integer.parseInt(scanner.nextLine());

      System.out.print("Enter second side: ");
      int s2 = Integer.parseInt(scanner.nextLine());

      System.out.print("Enter third side: ");
      int s3 = Integer.parseInt(scanner.nextLine());

      if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
        System.out.println("Error: side must be value grater then zero, try again\n");
        continue;
      }

      // sum of any 2 sides of a triangle must be greater than the measure of the third side
      if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1)
        System.out.println("Sides can make a valid triangle");
      else
        System.out.println("Valid triangle can't be made!");

      System.out.print("\nContinue? (1 - yes, 0 - exit) -> ");
      String choice = scanner.nextLine();
      if ("0".equals(choice))
        break;
    }

    System.out.println("\nBye!");
  }
}
