package chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * *2.5 (Financial application:
 * calculate tips) Write a program that reads the subtotal
 * and the gratuity rate and then computes the gratuity and total.
 *
 * Created by ag on 13-Oct-20 1:35 PM 
 */
class Ex2_5_Calc_Tips {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the subtotal and a gratuity rate (space separated): ");
    int subtotal = scanner.nextInt();
    int gratuity = scanner.nextInt();

    double gratuityRate = subtotal * gratuity / 100.0;
    double total = subtotal + gratuityRate;

    System.out.printf("The gratuity is $%.2f and total is $%.2f",
                      gratuityRate, total);
  }
}
