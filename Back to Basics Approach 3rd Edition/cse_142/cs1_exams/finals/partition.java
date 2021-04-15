package cse_142.cs1_exams.finals;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final7/partition
 *
 * @author Alex Golub
 * @since 14-Apr-21 11:16 PM
 */
class partition {
  public static void main(String[] args) {
    int[] a = {15, 1, 6, 12, -3, 4, 8, -7, 21, 2, 30, -1, 9};
    partition(a, 5);
    System.out.println(Arrays.toString(a));
  }

  public static void partition(int[] a, int v) {
    int i = 0, j = a.length - 1;
    while (i < j) {
      if (a[i] > v) {
        if (a[j] < v) {
          swap(a, i, j);
          i++;
        }
        j--;
      } else if (a[j] > v) {
        j--;
      } else {
        i++;
      }
    }
  }

  private static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
