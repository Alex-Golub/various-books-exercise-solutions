package chapter3_parameters_and_objects;

import java.util.Scanner;

/**
 * 5. Write a program that computes the spherical distance
 * between two points on the surface of the Earth, given their
 * latitudes and longitudes.
 *
 * e.g. run:
 * Enter point 1 (latitude and longitude) in degrees: 36.12 -86.67
 * Enter point 2 (latitude and longitude) in degrees: 33.94 -118.40
 * The distance between the two points is 2886.4489734367016 km
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 11:55 PM
 */
class PP3_5_GreatCircleDistance {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
    double p1Lt = Math.toRadians(scanner.nextDouble());
    double p1Lo = Math.toRadians(scanner.nextDouble());

    System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
    double p2Lt = Math.toRadians(scanner.nextDouble());
    double p2Lo = Math.toRadians(scanner.nextDouble());

    // Convert trigonometric values to negative sign for south-east
    final double EARTH_RADIUS = 6371.01;
    double d = EARTH_RADIUS * Math.acos(
            Math.sin(p1Lt) * Math.sin(p2Lt) +
            Math.cos(p1Lt) * Math.cos(p2Lt) * Math.cos(p1Lo - p2Lo)
    );

    System.out.println("The distance between the two points is " + d + " km");
  }
}
