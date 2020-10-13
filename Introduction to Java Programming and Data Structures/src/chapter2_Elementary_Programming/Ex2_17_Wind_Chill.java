package chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * *2.17 (Science: wind-chill temperature)
 * Write a program that prompts the user to enter a temperature between
 * -58°F and 41°F and a wind speed greater than or equal to 2 then
 * displays the wind-chill temperature.
 *
 * Created by ag on 13-Oct-20 7:56 PM 
 */
class Ex2_17_Wind_Chill {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
    double t = scanner.nextDouble();

    System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
    double v = scanner.nextDouble();

    double windChill = 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16)
                             + 0.4275 * t * Math.pow(v, 0.16);
    System.out.printf("The wind chill index is %.5f", windChill);
  }
}
