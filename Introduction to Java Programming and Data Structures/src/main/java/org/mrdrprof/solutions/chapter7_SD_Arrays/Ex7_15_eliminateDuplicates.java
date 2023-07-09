package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 7.15 (Eliminate duplicates)
 *
 * @author Mr.Dr.Professor
 * @since 05-Feb-21 9:07 PM
 */
class Ex7_15_eliminateDuplicates {
  public static void main(String[] args) {
    Scanner   sc  = new Scanner(System.in);
    final int N   = 10;
    int[]     arr = new int[N];

    while (true) {
      System.out.print("Enter " + N + " numbers: ");
      for (int i = 0; i < N; i++)
        arr[i] = sc.nextInt();

      System.out.println("The distinct number are: ");
      printArray(eliminateDuplicates(arr));

//      int[] test = new int[100_000];
//      for (int i = 0; i < test.length; i++)
//        test[i] = (int) (Math.random() * Integer.MAX_VALUE) + Integer.MIN_VALUE / 2;
//      printArray(eliminateDuplicates(test));

      System.out.println();
    }
  }

  private static void printArray(int[] arr) {
    System.out.print(arr[0]);
    for (int i = 1; i < arr.length; i++)
      System.out.print(" " + arr[i]);
  }

  public static int[] eliminateDuplicates(int[] list) {
    int[] distinct      = new int[list.length];
    int   distinctSoFar = 0;

    for (int ele : list) {

      // check if this element has been already placed into
      // distinct array if so skip it otherwise
      // insert it as new distinct element and increment
      // the count of distinct elements so far discovered
      if (!exists(ele, distinct, distinctSoFar)) {
        distinct[distinctSoFar] = ele;
        distinctSoFar++;
      }
    }

    return Arrays.copyOf(distinct, distinctSoFar);
  }

  private static boolean exists(int key, int[] list, int upTo) {
    for (int i = 0; i < upTo; i++)
      if (key == list[i])
        return true;

    return false;
  }
}


// 1 2 3 2 1 6 3 4 5 2
