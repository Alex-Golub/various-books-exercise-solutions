package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * 8.28 (Strictly identical arrays)
 * Two-dimensional arrays m1 and m2 are strictly
 * identical if their CORRESPONDING ELEMENTS ARE EQUAL.
 *
 * Enter list1: 51 22 25 6 1 4 24 54 6
 * Enter list2: 51 22 25 6 1 4 24 54 6
 * The two arrays are strictly identical
 *
 * Enter list1: 51 25 22 6 1 4 24 54 6
 * Enter list2: 51 25 22 6 1 4 24 54 5
 * The two arrays are not strictly identical
 *
 * @author Mr.Dr.Professor
 * @since 19-Feb-21 3:06 PM
 */
class Ex8_28_strictlyIdenticalMatrices {
  final static int SIZE = 3;
  final static Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    int[][] list1 = getMatrix(1, SIZE);
    int[][] list2 = getMatrix(2, SIZE);

    System.out.printf("The two arrays are %sstrictly identical\n",
                      equals(list1, list2) ? "" : "not ");
  }

  public static int[][] getMatrix(int id, int size) {
    System.out.print("Enter list" + id + ": ");
    int[][] m = new int[size][size];
    for (int i = 0; i < size; i++)
      for (int j = 0; j < size; j++)
        m[i][j] = console.nextInt();

    return m;
  }

  public static boolean equals(int[][] m1, int[][] m2) {
    if (m1 == null || m2 == null || m1.length != m2.length) {
      return false;
    }

    // check if number of columns is equal
    for (int i = 0; i < m1.length; i++) {
      if (m1[i].length != m2[i].length) {
        return false; // matrices has different number of columns
      }
    }

    // check each value at corresponding element at position (i, j)
    for (int i = 0; i < m1.length; i++) {
      for (int j = 0; j < m1[i].length; j++) {
        if (m1[i][j] != m2[i][j]) {
          return false;
        }
      }
    }

    return true;
  }
}
