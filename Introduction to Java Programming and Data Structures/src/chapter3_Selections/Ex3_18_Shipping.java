package chapter3_Selections;

import java.util.Scanner;

/**
 * *3.18 (Cost of shipping)
 * Write a program that prompts the user to enter the weight
 * of the package and display the shipping cost.
 * If the weight is greater than 20, display a
 * message “the package cannot be shipped.”
 * <p>
 * Created by ag on 27-Oct-20 11:05 PM
 */
class Ex3_18_Shipping {
  public static void main (String[] args) {
    Scanner   scanner    = new Scanner(System.in);
    final int MAX_WEIGHT = 20;

    System.out.print("Enter package weight: ");
    double weight = scanner.nextDouble();

    if (weight <= 0 || weight > MAX_WEIGHT) {
      System.out.println("The package can't be shipped");
      return;
    }

    double cost = 0;
    if (weight <= 2) cost = 2.5;
    else if (weight <= 4) cost = 4.5;
    else if (weight <= 10) cost = 7.5;
    else cost = 10.5;

    System.out.printf("Package weight: %.2f, Shipping cost: $%.2f\n\n",
            weight, cost);

  }
}
