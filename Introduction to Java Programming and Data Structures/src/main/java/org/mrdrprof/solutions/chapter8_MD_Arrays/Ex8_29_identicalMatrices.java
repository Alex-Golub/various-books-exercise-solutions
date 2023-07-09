package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Arrays;

/**
 * 8.29 (Identical arrays)
 * The two-dimensional arrays m1 and m2 are identical
 * if they have the SAME CONTENTS.
 *
 * Enter list1: 51 5 22 6 1 4 24 54 6
 * Enter list2: 51 22 25 6 1 4 24 54 6
 * The two arrays are not identical
 *
 * Enter list1: 51 25 22 6 1 4 24 54 6
 * Enter list2: 51 22 25 6 1 4 24 54 6
 * The two arrays are identical
 *
 * @author Mr.Dr.Professor
 * @since 19-Feb-21 3:21 PM
 */
class Ex8_29_identicalMatrices {
  public static void main(String[] args) {
    int[][] list1 = Ex8_28_strictlyIdenticalMatrices.getMatrix(1, 3);
    int[][] list2 = Ex8_28_strictlyIdenticalMatrices.getMatrix(2, 3);

    System.out.printf("The two arrays are %sidentical\n",
                      equals(list1, list2) ? "" : "not ");
  }

  public static boolean equals(int[][] m1, int[][] m2) {
    if (m1 == null || m2 == null || m1.length != m2.length) {
      // arrays are null of have different number of rows
      return false;
    }

    // count total number of one of the arrays to create
    // temp array later
    int totalNumberOfElements = 0;

    // check if number of columns is equal and count total number of elements
    for (int i = 0; i < m1.length; i++) {
      if (m1[i].length != m2[i].length) {
        return false; // matrices have different number of columns
      }

      totalNumberOfElements += m1[i].length;
    }

    // copy m1 and m2 elements to temp arrays
    int[] m1To1DArray = new int[totalNumberOfElements];
    int[] m2To1DArray = new int[totalNumberOfElements];

    for (int i = 0; i < m1.length; i++) {
      System.arraycopy(m1[i], 0, m1To1DArray, i * m1[i].length, m1[i].length);
      System.arraycopy(m2[i], 0, m2To1DArray, i * m2[i].length, m2[i].length);
    }

    Arrays.sort(m1To1DArray);
    Arrays.sort(m2To1DArray);

    // check single dimensional arrays if strictly identical
    for (int i = 0; i < m1To1DArray.length; i++) {
      if (m1To1DArray[i] != m2To1DArray[i]) {
        return false;
      }
    }

    return true;
  }
}
