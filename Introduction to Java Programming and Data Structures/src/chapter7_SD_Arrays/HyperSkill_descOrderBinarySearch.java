package chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * input:
 * 9                          <- size of array
 * 17 17 16 15 15 15 15 14 14 <- array to search
 * 5                          <- number of elements to search
 * 15 17 20 16 0              <- elements to search
 *
 * output:
 * 3 0 -1 2 -1 <- index where elements located
 *
 * @author Mr.Dr.Professor
 * @since 03-Feb-21 11:34 PM
 */

class HyperSkill_descOrderBinarySearch {

  public static int binarySearch(int elem, int[] array) {

    int left  = 0;
    int right = array.length - 1;

    int index = -1;
    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (elem == array[mid]) {
          index = mid;
          right = mid - 1;
      } else if (elem < array[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return index;
  }

  /* Do not change code below */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int     n       = scanner.nextInt();
    int[]   array   = new int[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }

    int m = scanner.nextInt();
    for (int i = 0; i < m; i++) {
      int elem = scanner.nextInt();
      System.out.print(binarySearch(elem, array));
      System.out.print(i < m - 1 ? " " : "\n");
    }
  }
}