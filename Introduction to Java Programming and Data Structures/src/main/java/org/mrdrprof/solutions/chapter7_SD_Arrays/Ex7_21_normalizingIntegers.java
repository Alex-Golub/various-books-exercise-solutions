package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * *7.21 (Normalizing integers)
 * normalize the integers to be in the range of 0 to 1
 *
 * z_i = ((x_i - r_min) / (r_max - r_min)) * (t_max - t_min) + t_min
 * t_max = 1
 * t_min = 0
 * r_max = max value from integers stream
 * r_min = min value from integers stream
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 4:43 PM
 */
class Ex7_21_normalizingIntegers {
  static final int     N          = 5;
  static final Scanner console    = new Scanner(System.in);
  static final int     RANGE_LOW  = 0;
  static final int     RANGE_HIGH = 1;

  public static void main(String[] args) {
    int[] data = getData();
    System.out.println("Data: " + Arrays.toString(data));

    double[] normalized = normalize(data, RANGE_LOW, RANGE_HIGH);
    System.out.printf("Normalized [%d, %d]: %s\n",
                      RANGE_LOW, RANGE_HIGH, Arrays.toString(normalized));
  }

  private static double[] normalize(int[] data, int tMin, int tMax) {
    int[] minmax = getMinMax(data);

    if (minmax[0] == minmax[1])
      throw new IllegalStateException("Can't be normalized due to: max_data - min_data = 0");

    double[] normalized = new double[data.length];
    for (int i = 0; i < data.length; i++) {
      normalized[i] = ((1.0 * data[i] - minmax[0]) / (minmax[1] - minmax[0])) *
                      (tMax - tMin) + tMin;
    }

    return normalized;
  }

  private static int[] getMinMax(int[] data) {
    if (data.length <= 1)
      return new int[]{data[0], data[0]};

    int max = Math.max(data[0], data[1]);
    int min = Math.min(data[0], data[1]);
    for (int i = 2; i < data.length; i++) {
      max = Math.max(max, data[i]);
      min = Math.min(min, data[i]);
    }

    return new int[]{min, max};
  }

  private static int[] getData() {
    int[] data = new int[N];
    System.out.println("Enter " + N + " values");
    for (int i = 0; i < N; i++) {
      System.out.print("Value #" + (i + 1) + ": ");
      data[i] = console.nextInt();
    }

    return data;
  }
}
