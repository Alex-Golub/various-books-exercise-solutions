package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Arrays;

/**
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 12:27 PM
 */
class ArrayProcessing {
  public static void main(String[] args) {
    int[] arr = initialize(10);
    System.out.println(Arrays.toString(arr));
    shuffle(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void shuffle(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = (int) (Math.random() * arr.length);
      swap(arr, i, j);
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static int[] initialize(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < size; i++)
      arr[i] = i;
    return arr;
  }
}
