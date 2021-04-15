package cse_142.cs1_exams.finals;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final1/isUnique
 *
 * @author Alex Golub
 * @since 12-Apr-21 5:46 PM
 */
class isUnique {
  public static void main(String[] args) {
//    int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
    int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
    System.out.println(isUnique(list));
  }

  public static boolean isUnique(int[] arr) {
    Arrays.sort(arr);
    for (int i = 1; i < arr.length; i++) {
      if (arr[i - 1] == arr[i])
        return false;
    }

    return true;
  }
}
