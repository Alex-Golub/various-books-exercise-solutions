package chapter5_Control_Statements_Part_2;

import java.util.Scanner;

/**
 * 5.17 (Calculating Sales)
 * An online retailer sells five products whose retail prices are as follows:
 * Product 1, $2.98;
 * product 2, $4.50;
 * product 3, $9.98;
 * product 4, $4.49 and
 * product 5, $6.87.
 * Write an application that reads a series of pairs of numbers as follows:
 * a) product number
 * b) quantity sold
 * Your program should use a switch statement to determine the retail price for each product. It
 * should calculate and display the total retail value of all products sold. Use a sentinel-controlled
 * loop to determine when the program should stop looping and display the final results.
 *
 * Created by ag on 21-Jul-20 9:18 PM
 */
class Ex5_17_Sales {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int LOW = 1;
    final int HIGH = 5;

    double totalPrice = 0.0;

    while (true) {
      System.out.printf("Enter product # (%d-%d) (-1 to show exit): ", LOW, HIGH);
      int productNumber = scanner.nextInt();
      if (productNumber == -1) break;

      System.out.print("Quantity (-1 to show exit): ");
      int quantity = scanner.nextInt();
      if (quantity == -1) break;

      switch (productNumber) {
        case 1:
          totalPrice += 2.98 * quantity;
          break;
        case 2:
          totalPrice += 4.50 * quantity;
          break;
        case 3:
          totalPrice += 9.98 * quantity;
          break;
        case 4:
          totalPrice += 4.49 * quantity;
          break;
        case 5:
          totalPrice += 6.87 * quantity;
          break;
        default:
          System.out.println("Entered product number doesn't exists");
      }
    }

    System.out.printf("%nTotal $%,.2f", totalPrice);
  }
}
