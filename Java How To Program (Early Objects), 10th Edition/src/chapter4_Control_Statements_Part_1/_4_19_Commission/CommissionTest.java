package chapter4_Control_Statements_Part_1._4_19_Commission;

import java.util.Scanner;

/**
 * 4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
 * The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
 * salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
 * total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
 * these items are as follows:
 *      Item     Value
 *      1        239.99
 *      2        129.75
 *      3        99.95
 *      4        350.89
 * Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
 * displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
 *
 * Created by ag on 26-Jun-20 1:24 PM
 */
class CommissionTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double totalSales = 0.0;
    boolean exit = false;

    while (!exit) {
      System.out.print("Enter item number (1-5) you sold this week (press '0' to calculate earnings): ");
      String input = scanner.nextLine();

      switch (input) {
        case "1": totalSales += 239.99; break;
        case "2": totalSales += 129.75; break;
        case "3": totalSales += 99.95; break;
        case "4": totalSales += 350.89; break;
        case "5": totalSales += 5000; break;
        case "0": exit = true; break;

        default:
          System.out.println("There is no such item with number (" + input + ")\n");
          break;
      }

    }

    // Calculate earnings
    System.out.printf("%nThis week earnings: $%.2f%n", 200 + 0.09 * totalSales);

    System.out.println("\nBye!");
  }
}
