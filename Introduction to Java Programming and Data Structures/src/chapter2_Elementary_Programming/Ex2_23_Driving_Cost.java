package chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * *2.23 (Cost of driving)
 *
 * Created by ag on 13-Oct-20 9:07 PM 
 */
class Ex2_23_Driving_Cost {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the driving distance (miles): ");
    double distance = scanner.nextDouble();

    System.out.print("Enter miles per gallon: ");
    double milesPerGallon = scanner.nextDouble();

    System.out.print("Enter price per gallon: ");
    double pricePerGallon = scanner.nextDouble();

    double cost = pricePerGallon * distance / milesPerGallon;
    System.out.printf("The cost of driving is $%.2f", cost);
  }
}
