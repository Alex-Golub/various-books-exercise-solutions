package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * For a sorted array A consisting of only unique numbers,
 * a fixed point is an index i such that A[i] = i.
 * Write a program that identifies whether a sorted array
 * contains a fixed point.
 *
 * Input: the first line contains one number n.
 * The second line contains an array of nn numbers
 * separated by spaces. The array is sorted in ascending order.
 *
 * Output: true if the array contains a fixed point and false otherwise.
 *
 * @author Mr.Dr.Professor
 * @since 03-Feb-21 11:12 PM
 */
class HyperSkill_binarySearchFixedPoint {

  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int[]   arr = new int[sc.nextInt()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    boolean found = false;
    int     low   = 0;
    int     high  = arr.length - 1;

    while (low <= high && !found) {
      int mid = low + (high - low) / 2;

      if (mid == arr[mid]) {
        found = true;
      } else if (arr[mid] > mid) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    System.out.println(found);
  }
}
