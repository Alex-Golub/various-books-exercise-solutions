package chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * *8.21 (Central city)
 * Central city is the city that has the shortest total
 * distance to all other cities.
 *
 * @author Mr.Dr.Professor
 * @since 16-Feb-21 3:06 PM
 */
class Ex8_21_centralCity {
  static final int X = 0;
  static final int Y = 1;

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter the number of cities: ");
    int n = console.nextInt(); // precondition: n >= 2

    System.out.println("Enter the coordinates of the cities: ");
    double[][] cityCoordinates = new double[n][2];
    for (int i = 0; i < n; i++) {
      cityCoordinates[i][X] = console.nextDouble();
      cityCoordinates[i][Y] = console.nextDouble();
    }

    for (int i = 0; i < n; i++) {
      System.out.print("City " + i + ":");
      System.out.println(" x = " + cityCoordinates[i][X] +
                       ", y = " + cityCoordinates[i][Y]);
    }

    System.out.println();

    double shortestDistanceSoFar = Double.POSITIVE_INFINITY;
    int centralCity = -1;
    for (int i = 0; i < n; i++) {
      double currentTotalDistance = 0;

      for (int j = 0; j < n; j++) {
        if (i != j) {
          currentTotalDistance += distance(i, j, cityCoordinates);
        }
      }

      if (currentTotalDistance < shortestDistanceSoFar) {
        shortestDistanceSoFar = currentTotalDistance;
        centralCity = i;
      }
    }

    System.out.printf("The central city is at (%.2f, %.2f)\n",
                      cityCoordinates[centralCity][X],
                      cityCoordinates[centralCity][Y]);
    System.out.printf("The total distance to all other cities is %.2f\n",
                      shortestDistanceSoFar);
  }

  private static double distance(int i, int j, double[][] cityCoordinates) {
    double dx = cityCoordinates[i][X] - cityCoordinates[j][X];
    double dy = cityCoordinates[i][Y] - cityCoordinates[j][Y];

    return Math.sqrt(dx * dx + dy * dy);
  }
}
