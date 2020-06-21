package chapter2_Intro_Java_Input_Ouput._2_35_Savings;

import java.util.Scanner;

/**
 * 2.35 (Car-Pool Savings Calculator) Research several car-pooling websites.
 * Create an application that calculates your daily driving cost,
 * so that you can estimate how much money could be saved by
 * car pooling, which also has other advantages such as reducing carbon emissions and reducing traffic
 * congestion.
 * The application should input the following information and display the user’s cost per
 * day of driving to work:
 *      a) Total miles driven per day.
 *      b) Cost per gallon of gasoline.
 *      c) Average miles per gallon.
 *      d) Parking fees per day.
 *      e) Tolls per day.
 *
 * Created by ag on 15-Jun-20 2:13 PM
 */
class Savings {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Car-Pool Savings Calculator ===");

    System.out.print("Total miles driven per day -> ");
    double miles = scanner.nextDouble();

    System.out.print("Cost per gallon of gasoline -> ");
    double gallonCost = scanner.nextDouble();

    System.out.print("Average miles per gallon -> ");
    double avgPerGallon = scanner.nextDouble();

    System.out.print("Parking fees per day -> ");
    double parkingFee = scanner.nextDouble();

    System.out.print("Tolls per day -> ");
    int tolls = scanner.nextInt();

    if (tolls == 0)
      tolls = 1;

    System.out.printf("\nYou can save up to -> $%.2f", miles * gallonCost * avgPerGallon * parkingFee * tolls);

  }
}
