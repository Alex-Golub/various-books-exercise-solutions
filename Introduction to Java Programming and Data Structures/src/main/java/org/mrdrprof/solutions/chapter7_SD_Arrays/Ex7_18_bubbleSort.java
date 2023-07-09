package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * **7.18 (Bubble sort)
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 2:14 PM
 */
class Ex7_18_bubbleSort {
  public static void main(String[] args) {
    int[] arr = IntStream.generate(() -> new Random().nextInt(30))
            .limit(10)
            .toArray();

//    int [] arr = IntStream.rangeClosed(1, 20).toArray();

    System.out.println("Before sort: " + Arrays.toString(arr));
    bubbleSort(arr);
    System.out.println("After sort: " + Arrays.toString(arr));
  }

  private static void bubbleSort(int[] arr) {
    boolean isSorted = true;

    // start from end and gradually lower the index i
    // because we already know that from index i till arr.length - 1
    // elements are already sorted
    for (int i = arr.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) { // change to < to sort in decreasing order
          System.out.println(Arrays.toString(arr) + " swap: " + arr[j] + " and " + arr[j + 1]);
          swap(arr, j, j + 1);
          isSorted = false;
        }
      }

      System.out.println(Arrays.toString(arr));
      System.out.println("End of " + (arr.length - i) + " iteration\n");


      if (isSorted)
        return;
    }
  }

  private static void swap(int[] arr, int j, int i) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }
}
