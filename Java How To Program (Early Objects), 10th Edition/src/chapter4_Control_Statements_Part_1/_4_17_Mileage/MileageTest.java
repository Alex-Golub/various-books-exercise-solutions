package chapter4_Control_Statements_Part_1._4_17_Mileage;

import java.util.Scanner;

/**
 * 4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
 * kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
 * a Java application that will input the miles driven and gallons used (both as integers) for each trip.
 * The program should calculate and display the miles per gallon obtained for each trip and print the
 * combined miles per gallon obtained for all trips up to this point. All averaging calculations should
 * produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
 * data from the user.
 *
 * Created by ag on 23-Jun-20 10:48 PM
 */
class MileageTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int totalMiles = 0;
    int totalGallons = 0;

    while (true) {
      System.out.print("Enter number of miles driven (enter to exit): ");
      String input = scanner.nextLine();

      if ("".equals(input))
        break;

      int miles = Integer.parseInt(input);
      totalMiles += miles;

      System.out.print("Enter number of gallons used (enter to exit): ");
      input = scanner.nextLine();

      if ("".equals(input))
        break;

      int gallons = Integer.parseInt(input);
      totalGallons += gallons;

      System.out.println("\nMiles per gallon obtained for each trip: " + miles / gallons * 1.0 + " mil/gal");
      System.out.println("Combined miles per gallon obtained for all trips up to this point: "
              + totalMiles / totalGallons * 1.0 + " mil/gal\n");
    }

    System.out.println("Bye!");
  }
}
