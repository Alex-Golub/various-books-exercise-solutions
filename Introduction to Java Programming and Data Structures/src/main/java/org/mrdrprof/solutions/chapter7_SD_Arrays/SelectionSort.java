package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++)
      arr[i] = -10 + (int) (Math.random() * 21);

//    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(Arrays.toString(arr));
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void selectionSort(int[] list) {
    int count = 0;

    for (int i = 0; i < list.length - 1; i++) {
      int currentMinValue = list[i];
      int currentMinIndex = i;

      boolean isSorted = true; // make it more efficient
      for (int j = i + 1; j < list.length; j++) {
        if (currentMinValue > list[j]) { // ASC order
          currentMinValue = list[j];
          currentMinIndex = j;
          isSorted = false;
        }

        count++;
      }

      if (isSorted)
        break;

      if (currentMinIndex != i)
        swap(list, currentMinIndex, i);
    }

    System.out.println("Time iterated the array: " + count);
  }

  public static void swap(int[] list, int i, int j) {
    int tmp = list[i];
    list[i] = list[j];
    list[j] = tmp;
  }
}
