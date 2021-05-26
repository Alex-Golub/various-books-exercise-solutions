package CodeStepByStep.java.sorting;

import java.util.Arrays;

/**
 * @author Alex Golub
 * @since 26-May-21, 6:59 PM
 */
class SelectionSort {
  public static void main(String[] args) {
    int[] a = {15, 2, 8, 10, 15, 17, 12, 5};
    selectionSort(a);
    System.out.println(Arrays.toString(a));
  }
  
  private static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minIdx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minIdx] > arr[j]) {
          minIdx = j;
        }
      }
      swap(arr, i, minIdx);
    }
  }
  
  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
