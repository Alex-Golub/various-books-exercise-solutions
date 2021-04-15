package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final13/groceries
 *
 * red: 10% off full price
 * blue: 25% off full price
 * none: full price
 *
 * @author Alex Golub
 * @since 15-Apr-21 10:21 PM
 */
class groceries {
  public static double groceries(Scanner groceryBill) {
    double totalCost = 0;

    while (groceryBill.hasNext()) {
      groceryBill.next(); // ignore product name
      String discount = groceryBill.next().toLowerCase();
      double price = groceryBill.nextDouble();

      switch (discount) {
        case "red": totalCost += 0.90 * price; break;
        case "blue": totalCost += 0.75 * price; break;
        case "none": totalCost += price; break;
      }
    }

    return totalCost;
  }
}
