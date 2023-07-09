package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

import java.util.Scanner;

import static java.lang.Math.acos;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

/**
 * *4.2 (Geometry: great circle distance)
 * The great circle distance is the distance between two points on
 * the surface of a sphere.
 * The average radius of the earth is 6,371.01 km.
 * The latitude and longitude degrees in the formula are for north and west.
 * Use negative to indicate south and east degrees.
 *
 * @author Mr.Dr.Professor
 * @since 12-Nov-20 6:30 PM
 */
class Ex4_2_GreatCircleDistance {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
    double p1Lt = toRadians(scanner.nextDouble());
    double p1Lo = toRadians(scanner.nextDouble());

    System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
    double p2Lt = toRadians(scanner.nextDouble());
    double p2Lo = toRadians(scanner.nextDouble());

    // Convert trigonometric values to negative sign for south-east
    final double EARTH_RADIUS = 6371.01;
    double d = EARTH_RADIUS * acos(
            sin(p1Lt) * sin(p2Lt) +
            cos(p1Lt) * cos(p2Lt) * cos(p1Lo - p2Lo)
    );

    System.out.println("The distance between the two points is " + d + " km");

  }
}
