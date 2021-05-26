package CodeStepByStep.java.sorting;

import java.util.Arrays;

/**
 * @author Alex Golub
 * @since 26-May-21, 6:29 PM
 */
class InsertionSort {
  public static void main(String[] args) {
    int[] a = {15, 2, 8, 10, 15, 17, 12, 5};
    insertionSort(a);
    System.out.println(Arrays.toString(a));
  }
  
  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int ele = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > ele) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = ele;
    }
  }
}
