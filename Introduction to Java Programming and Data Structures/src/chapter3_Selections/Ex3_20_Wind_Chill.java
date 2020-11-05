package chapter3_Selections;

import java.util.Scanner;

/**
 * *3.20 (Science: wind-chill temperature)
 * <p>
 * Created by ag on 27-Oct-20 11:33 PM
 */
class Ex3_20_Wind_Chill {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
    double t = scanner.nextDouble();
    if (t < -58 || t > 41) {
      System.out.println("Invalid temperature value");
      System.exit(1);
    }

    System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
    double v = scanner.nextDouble();
    if (v < 2) {
      System.out.println("Invalid wind speed");
      System.exit(1);
    }

    double windChill = 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16)
            + 0.4275 * t * Math.pow(v, 0.16);
    System.out.println("Wind chill index: " + (int) (windChill * 100 + 0.5) / 100.0);

  }
}
