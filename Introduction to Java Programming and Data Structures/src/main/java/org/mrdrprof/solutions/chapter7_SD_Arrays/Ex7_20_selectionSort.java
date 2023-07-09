package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * *7.20 (Revise selection sort)
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 3:20 PM
 */
class Ex7_20_selectionSort {
  public static void main(String[] args) {
    int[] arr = IntStream.generate(() -> 15 - new Random().nextInt(31))
            .limit(10)
            .toArray();

    System.out.println("Before sort: " + Arrays.toString(arr));
    selectionSort(arr);
    System.out.println("After sort: " + Arrays.toString(arr));
  }

  public static void selectionSort(int[] list) {
    if (list == null)
      throw new IllegalArgumentException("List is null");

    boolean isSorted = true;
    for (int i = list.length - 1; i > 0; i--) {
      int maxIndex = 0;

      for (int j = 1; j <= i; j++) {
        if (list[maxIndex] > list[j]) { // DESC order, change to < for ascending order
          maxIndex = j;
          isSorted = false;
        }
      }

      if (isSorted)
        return;

      swap(list, i, maxIndex);
    }
  }

  private static void swap(int[] list, int i, int j) {
    int temp = list[i];
    list[i] = list[j];
    list[j] = temp;
  }
}
