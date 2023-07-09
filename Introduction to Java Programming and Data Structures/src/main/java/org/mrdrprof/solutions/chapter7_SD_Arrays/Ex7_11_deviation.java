package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * *7.11 (Statistics: compute deviation)
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 7:06 PM
 */
class Ex7_11_deviation {
  public static void main(String[] args) {
    final int N    = 10;
    double[]  data = getData(N);

    System.out.printf("The mean is %.2f\n", mean(data));
    System.out.printf("The standard deviation is %.5f\n", deviation(data));
  }

  private static double[] getData(int n) {
    if (n <= 0)
      throw new IllegalArgumentException("n is zero or negative: " + n);

    double[] arr = new double[n];
    System.out.print("Enter " + n + " numbers: ");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextDouble();

    return arr;
  }

  /**
   * Compute the deviation of double values
   */
  public static double deviation(double[] x) {
    if (x == null || x.length <= 1)
      throw new IllegalArgumentException("data array is null or length <= 1");

    double mean = mean(x);
    double sum  = 0;
    for (double xi : x)
      sum += (xi - mean) * (xi - mean);

    return Math.sqrt(sum / (x.length - 1));
  }

  /**
   * Compute the mean of an array of double values
   */
  public static double mean(double[] x) {
    if (x == null || x.length == 0)
      throw new IllegalArgumentException("data array is null or length is zero");

    double sum = 0;
    for (double val : x)
      sum += val;

    return sum / x.length;
  }
}
