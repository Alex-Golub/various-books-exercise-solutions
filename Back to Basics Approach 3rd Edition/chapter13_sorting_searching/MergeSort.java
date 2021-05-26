package chapter13_sorting_searching;

// This program implements the merge sort algorithm for
// arrays of integers.

import java.util.Arrays;

class MergeSort {
  public static void main(String[] args) {
    int[] list = {14, 32, 67, 76, 23, 41, 58, 85};
    System.out.println("before: " + Arrays.toString(list));
    mergeSort(list);
    System.out.println("after:  " + Arrays.toString(list));
  }
  
  // Places the elements of the given array into sorted order
  // using the merge sort algorithm.
  // post: array is in sorted (nondecreasing) order
  public static void mergeSort(int[] array) {
    if (array.length > 1) {
      // split array into two halves
      int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
      int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
      
      // recursively sort the two halves
      mergeSort(left);
      mergeSort(right);
      
      // merge the sorted halves into a sorted whole
      merge(array, left, right);
    }
  }
  
  // Merges the given left and right arrays into the given
  // result array.  Second, working version.
  // pre : result is empty; left/right are sorted
  // post: result contains result of merging sorted lists;
  public static void merge(int[] result, int[] left, int[] right) {
    int i1 = 0;   // index into left array
    int i2 = 0;   // index into right array
    
    for (int i = 0; i < result.length; i++) {
      if (i2 >= right.length || (i1 < left.length &&
                                 left[i1] <= right[i2])) {
        result[i] = left[i1];    // take from left
        i1++;
      } else {
        result[i] = right[i2];   // take from right
        i2++;
      }
    }
  }
}
