package chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 7.9 (Find the largest element)
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 6:51 PM
 */
class Ex7_9_largestElement {
  public static void main(String[] args) {
    final int N  = 10;
    Scanner   sc = new Scanner(System.in);

    System.out.print("Enter " + N + " values (others will be ignored): ");
    double[] arr = new double[N];
    for (int i = 0; i < N; i++)
      arr[i] = sc.nextDouble();

    System.out.println("\ndouble[]: " + Arrays.toString(arr));
    System.out.println("The maximum number is: " + max(arr));
  }

  public static double max(double[] array) {
    if (array == null || array.length == 0)
      throw new IllegalArgumentException("Array is null or size 0");

    double max = array[0];
    for (int i = 1; i < array.length; i++)
      max = Math.max(max, array[i]);

    return max;
  }

}
