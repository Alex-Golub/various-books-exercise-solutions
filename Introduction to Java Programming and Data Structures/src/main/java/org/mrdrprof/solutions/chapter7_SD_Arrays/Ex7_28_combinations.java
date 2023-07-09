package org.mrdrprof.solutions.chapter7_SD_Arrays;

/**
 * **7.28 (Math: combinations)
 * Displays all combinations of picking two numbers from the N numbers
 * nCr = n! / (r! * (n - r)!)
 * E.g. 3C2 => 1 2, 1 3, 2 3
 *
 * @author Mr.Dr.Professor
 * @since 07-Feb-21 6:07 PM
 */
class Ex7_28_combinations {
  public static void main(String[] args) {
    int[] numbers = Ex7_26_strictlyIdenticalArrays.getList(1);
    combinations(numbers);
  }

  public static void combinations(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        System.out.println(arr[i] + " " + arr[j]);
      }
    }
  }
}
