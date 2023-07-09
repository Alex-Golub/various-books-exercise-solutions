package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 7.8 (Average an array)
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 6:38 PM
 */
class Ex7_8_averageAnArray {
  public static void main(String[] args) {
    final int N  = 10;
    Scanner   sc = new Scanner(System.in);

    System.out.print("Enter " + N + " values (others will be ignored): ");
    int[]    intValues    = new int[N];
    double[] doubleValues = new double[N];

    for (int i = 0; i < N; i++) {
      int value = sc.nextInt();
      intValues[i] = value;
      doubleValues[i] = value;
    }

    System.out.println("\nint[]: " + Arrays.toString(intValues));
    System.out.println("double[]: " + Arrays.toString(doubleValues));
    System.out.println("\naverage(int[]): " + average(intValues));
    System.out.println("average(double[]): " + average(doubleValues));
  }

  public static int average(int[] array) {
    if (array == null || array.length == 0)
      throw new IllegalArgumentException("Array is null or size 0");

    long sum = 0;
    for (int val : array)
      sum += val;

    return Math.round(1.0f * sum / array.length);
  }

  public static double average(double[] array) {
    if (array == null || array.length == 0)
      throw new IllegalArgumentException("Array is null or size 0");

    double sum = 0;
    for (double val : array)
      sum += val;

    return sum / array.length;
  }
}
