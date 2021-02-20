package chapter8_MD_Arrays;

import java.util.Arrays;

/**
 * *8.16 (Sort two-dimensional array)
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 8:49 PM
 */
class Ex8_16_twoDimensionalSort {
  public static void main(String[] args) {
    int[][] m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
    printMatrix(m);
    sort(m);

    System.out.println();
    printMatrix(m);
  }

  private static void printMatrix(int[][] m) {
    for (int[] row : m)
      System.out.println(Arrays.toString(row));
  }

  // The method performs a primary sort on rows,
  // and a secondary sort on columns.
  public static void sort(int m[][]) {
    for (int i = 0; i < m.length; i++) {
      double currentMin = m[i][0];
      int currentMinIndex = i;

      for (int j = i; j < m.length; j++) {
        if (currentMin > m[j][0] // primary sort
            || (currentMin == m[j][0] && m[currentMinIndex][1] > m[j][1])) // secondary sort
        {
          currentMin = m[j][0];
          currentMinIndex = j;
        }
      }

      // Swap list[i] with list[currentMinIndex] if necessary;
      if (currentMinIndex != i) {
        int temp0 = m[currentMinIndex][0];
        int temp1 = m[currentMinIndex][1];
        m[currentMinIndex][0] = m[i][0];
        m[currentMinIndex][1] = m[i][1];
        m[i][0] = temp0;
        m[i][1] = temp1;
      }
    }
  }
}
