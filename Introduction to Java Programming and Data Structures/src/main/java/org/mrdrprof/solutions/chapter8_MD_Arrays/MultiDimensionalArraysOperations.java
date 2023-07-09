package org.mrdrprof.solutions.chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 09-Feb-21 10:06 AM
 */
class MultiDimensionalArraysOperations {
  static final Scanner sc = new Scanner(System.in);

  /** Create 2D with manually typed in values */
  public static int[][] getMDArray() {
    System.out.print("Enter matrix row: ");
    int rows = sc.nextInt();
    System.out.print("Enter matrix columns: ");
    int columns = sc.nextInt();

    int[][] m = new int[rows][columns];
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        System.out.printf("Row #%d, Column #%d: ", i + 1, j + 1);
        m[i][j] = sc.nextInt();
      }
    }

    return m;
  }

  /** Random values in range [low, high] 2D array */
  public static int[][] getMDRandomValuesArrays(int low, int high) {
    System.out.print("Enter matrix row: ");
    int rows = sc.nextInt();
    System.out.print("Enter matrix columns: ");
    int columns = sc.nextInt();

    int[][] m = new int[rows][columns];
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        m[i][j] = (int) (Math.random() * (high - low + 1)) + low;
      }
    }

    return m;
  }

  /** get ragged array from user */
  public static int[][] getRaggedArray() {
    System.out.print("Enter matrix row: ");
    int     rows   = sc.nextInt();
    int[][] ragged = new int[rows][];

    for (int i = 0; i < ragged.length; i++) {
      System.out.print("Number of elements in row #" + (i + 1) + ": ");
      int columns = sc.nextInt();
      ragged[i] = new int[columns];

      for (int j = 0; j < columns; j++) {
        System.out.printf("Row #%d, Column #%d: ", i + 1, j + 1);
        ragged[i][j] = sc.nextInt();
      }
    }

    return ragged;
  }

  public static int[][] getRandomValuesRaggedArray(
          int minNumberOfColumns, int maxNumberOfColumns,
          int low, int high) {

    System.out.print("Enter matrix row: ");
    int     rows   = sc.nextInt();
    int[][] ragged = new int[rows][];

    for (int i = 0; i < ragged.length; i++) {
      ragged[i] = new int[minNumberOfColumns + (int) (Math.random() * (maxNumberOfColumns - minNumberOfColumns + 1))];

      for (int j = 0; j < ragged[i].length; j++) {
        ragged[i][j] = (int) (Math.random() * (high - low + 1) + low);
      }
    }

    return ragged;
  }

  /** print matrix with required padding (!= 0) between values */
  public static void printMatrix(int[][] m, int padding) {
    String pad = "%" + (-1 * Math.abs(padding)) + "d";
    for (int[] row : m) {
      for (int value : row) {
        System.out.printf(pad, value);
      }
      System.out.println();
    }
  }

  /** Sum all values of the matrix */
  public static int sumMatrix(int[][] m) {
    int total = 0;
    for (int[] row : m)
      for (int value : row)
        total += value;

    return total;
  }

  /**
   * Sum each array column and return sum of each as int[]
   * postcondition: m of size n x n
   */
  public static int[] sumByColumn(int[][] m) {
    int[] columnSum = new int[m[0].length];

    for (int column = 0; column < m[0].length; column++) {
      int sum = 0;

      for (int row = 0; row < m.length; row++) {
        sum += m[row][column];
      }

      columnSum[column] = sum;
    }

    return columnSum;
  }

  /** Return max number of columns this matrix have */
  public static int getMaxColumns(int[][] m) {
    int max = 0;
    for (int[] row : m) {
      int j = 0;
      while (j++ < row.length - 1) ;
      max = Math.max(max, j);
    }

    return max;
  }

  /** Return index (zero based) or row that has the max sum */
  public static int rowWithLargestSum(int[][] m) {
    int maxRow        = Integer.MIN_VALUE;
    int indexOfMaxRow = 0;

    for (int row = 0; row < m.length; row++) {
      int sumOfThisRow = 0;

      for (int column = 0; column < m[row].length; column++) {
        sumOfThisRow += m[row][column];
      }

      if (sumOfThisRow > maxRow) {
        maxRow = sumOfThisRow;
        indexOfMaxRow = row;
      }
    }

    return indexOfMaxRow;
  }


  /** Shuffle 2d int array */
  public static void shuffle(int[][] m) {
    for (int row = 0; row < m.length; row++) {
      for (int col = 0; col < m[row].length; col++) {
        int randRow = (int) (Math.random() * m.length);
        int randCol = (int) (Math.random() * m[row].length);

        // swap
        int temp = m[row][col];
        m[row][col] = m[randRow][randCol];
        m[randRow][randCol] = temp;
      }
    }
  }

  public static void main(String[] args) {
//    System.out.println(Arrays.deepToString(getMDArray()));
//    printMatrix(getMDRandomValuesArrays(0, 20), 5);
//    sumByColumn(getMDRandomValuesArrays(0, 10));
//    printMatrix(getRaggedArray(), 5);
//    printMatrix(getRandomValuesRaggedArray(4, 10, -5, 10), 5);

//    int[][] m = getRandomValuesRaggedArray(4, 4, -5, 10);
//    printMatrix(m, 5);
//    System.out.println(getMaxColumns(m));
//    System.out.println(Arrays.toString(sumByColumn(m)));
//    System.out.println(rowWithLargestSum(m));

    int[][] m = getMDArray();
    printMatrix(m, 5);
    shuffle(m);
    System.out.println();
    printMatrix(m, 5);
  }
}
