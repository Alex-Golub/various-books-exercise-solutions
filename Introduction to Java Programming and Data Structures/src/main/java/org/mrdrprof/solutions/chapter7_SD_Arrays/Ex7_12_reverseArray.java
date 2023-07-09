package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * *7.12 (Reverse an array)
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 7:21 PM
 */
class Ex7_12_reverseArray {
  public static void main(String[] args) {
    final int N   = 9;
    double[]  arr = getData(N);
    System.out.println("Before reverse: " + Arrays.toString(arr));
    reverse(arr);
    System.out.println("After reverse: " + Arrays.toString(arr));
  }

  /** Reverses array in place */
  public static void reverse(double[] arr) {
    if (arr == null)
      throw new IllegalArgumentException("array is null");

    for (int i = 0; i < arr.length / 2; i++) {
      swap(arr, i, arr.length - i - 1);
    }
  }

  private static void swap(double[] arr, int i, int j) {
    double temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static double[] getData(int n) {
    if (n <= 0)
      throw new IllegalArgumentException("n is zero or negative: " + n);

    double[] arr = new double[n];
    System.out.print("Enter " + n + " numbers: ");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextDouble();

    return arr;
  }
}
