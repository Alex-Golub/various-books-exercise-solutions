package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Arrays;

/**
 * *8.18 (Shuffle rows)
 *
 * @author Mr.Dr.Professor
 * @since 15-Feb-21 9:53 PM
 */
class Ex8_18_shuffleRows {
  public static void main(String[] args) {
    int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
    printMatrix(m);

    System.out.println();

    shuffle(m);
    printMatrix(m);
  }

  private static void printMatrix(int[][] m) {
    for (int[] row : m) {
      System.out.println(Arrays.toString(row));
    }
  }

  public static void shuffle(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      int randomRow = (int) (Math.random() * m.length);

      int[] temp = m[i];
      m[i] = m[randomRow];
      m[randomRow] = temp;
    }
  }

}
