package org.mrdrprof.solutions.chapter9_Objects_and_Classes;

import java.util.Scanner;

/**
 * **9.13 (The Location class)
 *
 * Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array.
 *
 * Enter the number of rows and columns in the array: 3 4
 * Enter the array:
 * 23.5 35 2 10
 * 4.5 3 45 3.5
 * 35 44 5.5 9.6
 * The location of the largest element is 45 at (1, 2)
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 16:05
 */
/*public*/ class Location {
  private int row;
  private int column;
  private double maxValue;

  private Location(int row, int column, double maxValue) {
    this.row = row;
    this.column = column;
    this.maxValue = maxValue;
  }

  public static Location locateLargest(double[][] a) {
    if (a == null || a.length == 0) {
      return new Location(-1, -1, Double.MIN_VALUE);
    }

    double maxValue = Double.MIN_VALUE;
    int row = 0, col = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (maxValue < a[i][j]) {
          maxValue = a[i][j];
          row = i;
          col = j;
        }
      }
    }

    return new Location(row, col, maxValue);
  }

  public int getRow() {
    return row;
  }

  public int getColumn() {
    return column;
  }

  public double getMaxValue() {
    return maxValue;
  }
}

class LocationTest {
  public static void main(String[] args) {
    double[][] matrix = get();

    Location locationOfLargestElement = Location.locateLargest(matrix);
    System.out.printf("The location of the largest element is %.0f at (%d, %d)\n",
                      locationOfLargestElement.getMaxValue(),
                      locationOfLargestElement.getRow(),
                      locationOfLargestElement.getColumn()
    );
  }

  private static double[][] get() {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns in the array: ");
    int rows = console.nextInt();
    int cols = console.nextInt();
    System.out.println("Enter the array: ");
    double[][] matrix = new double[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = console.nextDouble();
      }
    }
    return matrix;
  }
}
