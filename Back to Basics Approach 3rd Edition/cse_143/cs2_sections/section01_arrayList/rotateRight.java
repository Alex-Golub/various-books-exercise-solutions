package cse_143.cs2_sections.section01_arrayList;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrays/rotateRight
 *
 * @author Alex Golub
 * @since 19-Apr-21 8:14 PM
 */
class rotateRight {
  public static void main(String[] args) {
    int[] arr = {3, 8, 19, 7};
    rotateRight(arr);
    System.out.println(Arrays.toString(arr));
  }
  
  public static void rotateRight(int[] arr) {
    int last = arr[arr.length - 1];
    for (int i = arr.length - 2; i >= 0; i--) {
      arr[i + 1] = arr[i];
    }
    arr[0] = last;
  }
}
