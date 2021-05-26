package CodeStepByStep.java.sorting;

import java.util.Arrays;

/**
 * @author Alex Golub
 * @since 26-May-21, 7:38 PM
 */
class mergeSort {
  public static void main(String[] args) {
//    int[] a = {15, 2, 8, 10, 15, 17, 12, 5};
//    int[] a = {15, 2};
//    int[] a = {2};
    int[] a = {};
    mergeSort(a);
    System.out.println(Arrays.toString(a));
  }
  
  public static void mergeSort(int[] a) {
    if (a.length > 1) { // sort array of at least 2 elements
      int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
      int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
  
      mergeSort(left);
      mergeSort(right);
  
      merge(a, left, right);
    }
  }
  
  private static void merge(int[] a, int[] left, int[] right) {
    int i = 0, j = 0;
    for (int k = 0; k < a.length; k++) {
      if (j >= right.length || (i < left.length && left[i] < right[j])) {
        a[k] = left[i++];
      } else {
        a[k] = right[j++];
      }
    }
  }
}
