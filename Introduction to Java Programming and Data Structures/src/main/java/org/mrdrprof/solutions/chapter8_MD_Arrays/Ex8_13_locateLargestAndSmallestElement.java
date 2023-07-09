package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * *8.13 (Locate the largest element)
 * *8.13 (Locate the smallest element)
 * <p>
 * Return value is a one-dimensional array that contains two elements.
 * These two elements indicate the row and column indices of the
 * largest/smallest element in the two-dimensional array.
 * <p>
 * 1. If there are more than one largest element, return the
 * smallest row index and then the smallest column index.
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 6:18 PM
 */
class Ex8_13_locateLargestAndSmallestElement {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    while (true) {
      System.out.print("Enter the number of rows and columns of the array: ");
      int row = console.nextInt();
      int col = console.nextInt();

      double[][] m = new double[row][col];
      System.out.println("Enter the array: ");
      for (int i = 0; i < m.length; i++)
        for (int j = 0; j < m[i].length; j++)
          m[i][j] = console.nextDouble();

      int[][] location = locateLargestAndSmallest(m);
      System.out.printf("The location of the smallest element is at (%d, %d)\n",
                        location[0][0], location[0][1]);
      System.out.printf("The location of the largest element is at (%d, %d)\n\n",
                        location[1][0], location[1][1]);
    }
  }

  public static int[][] locateLargestAndSmallest(double[][] a) {
    double maxElementSoFar = Integer.MIN_VALUE;
    double minElementSoFar = Integer.MAX_VALUE;

    int maxRow = 0, maxCol = 0;
    int minRow = 0, minCol = 0;

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (maxElementSoFar < a[i][j]) {
          maxElementSoFar = a[i][j];
          maxRow = i;
          maxCol = j;
        } else if (minElementSoFar > a[i][j]) {
          minElementSoFar = a[i][j];
          minRow = i;
          minCol = j;
        }
      }
    }

    return new int[][]{{minRow, minCol}, {maxRow, maxCol}};
  }

}
