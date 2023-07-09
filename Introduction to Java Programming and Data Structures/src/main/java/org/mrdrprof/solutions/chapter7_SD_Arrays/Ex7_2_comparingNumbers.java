package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * 7.2 (Comparing numbers)
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 2:21 PM
 */
class Ex7_2_comparingNumbers {
  public static void main(String[] args) {
    final int N_VALUES = 11;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter " + N_VALUES + " integers: ");

    int[] values = new int[N_VALUES];
    for (int i = 0; i < values.length; i++)
      values[i] = sc.nextInt();

    int lastValue = values[values.length - 1];
    for (int value : values) {
      System.out.printf("%d is %s %d\n",
                        value,
                        value > lastValue ? "greater then" :
                        value < lastValue ? "smaller then" : "equal to",
                        lastValue);
    }
  }
}
