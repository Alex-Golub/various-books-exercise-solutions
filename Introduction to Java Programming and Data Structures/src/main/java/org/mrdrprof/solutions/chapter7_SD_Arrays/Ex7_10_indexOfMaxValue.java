package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 7.10 (Find the index of the largest element)
 * If there is more than one element, return the largest index.
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 6:56 PM
 */
class Ex7_10_indexOfMaxValue {
  public static void main(String[] args) {
    final int N   = 10;
    double[]  arr = getArr(N);

    System.out.println("\ndouble[]: " + Arrays.toString(arr));

    int largestIdx = indexOfLargestElement(arr);
    System.out.println("Index of largest element is " + largestIdx +
                       ", the element is " + arr[largestIdx]);
  }

  private static double[] getArr(int n) {
    if (n <= 0)
      throw new IllegalArgumentException("n is zero or -ve value: " + n);

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter " + n + " values (others will be ignored): ");

    double[] arr = new double[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextDouble();

    return arr;
  }

  public static int indexOfLargestElement(double[] array) {
    if (array == null || array.length == 0)
      return -1;

    double maxElement = array[0];
    int    indexOfMax = 0;

    for (int i = 1; i < array.length; i++) {
      double currentElement = array[i];

      if (currentElement > maxElement) { // take last possible max element
        maxElement = currentElement;
        indexOfMax = i;
      }
    }

    return indexOfMax;
  }

}
