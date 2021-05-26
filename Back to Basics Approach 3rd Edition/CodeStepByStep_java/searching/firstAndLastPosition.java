package CodeStepByStep.java.searching;

import java.util.Arrays;

/**
 * https://www.codestepbystep.com/problem/view/java/searching/firstAndLastPosition
 * <p>
 * An optimal solution can run in O(log N) time for an array of length N.
 *
 * @author Alex Golub
 * @since 26-May-21, 2:14 PM
 */
class firstAndLastPosition {
  public static void main(String[] args) {
    int[] a = {-4, 1, 7, 7, 7, 7, 7, 9, 9, 15, 22};
    System.out.println(Arrays.toString(firstAndLastPosition(a, 7))); // {2, 6}
    System.out.println(Arrays.toString(firstAndLastPosition(a, 15))); // {8, 8}
    System.out.println(Arrays.toString(firstAndLastPosition(a, 5))); // {-1, -1}
  }
  
  // pre: arr is sorted
  public static int[] firstAndLastPosition(int[] arr, int tgt) {
    int Tleft = find(tgt, arr, 0);
    if (Tleft == arr.length || arr[Tleft] != tgt) {
      return new int[] {-1, -1};
    }
    
    return new int[] {Tleft, find(tgt + 1, arr, Tleft) - 1};
  }
  
  public static int find(int target, int[] arr, int left) {
    int right = arr.length - 1;
    
    while (left <= right) {
      int mid = left + right >> 1;
      if (arr[mid] < target) left = mid + 1;
      else right = mid - 1;
    }
    
    return left;
  }
}

// {-4, 1, 7, 7, 7, 7, 7, 9, 9, 15, 22}
