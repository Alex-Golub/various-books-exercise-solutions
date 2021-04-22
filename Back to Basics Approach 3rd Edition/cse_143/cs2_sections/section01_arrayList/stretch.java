package cse_143.cs2_sections.section01_arrayList;

import java.util.Arrays;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrays/stretch
 *
 * @author Alex Golub
 * @since 19-Apr-21 8:09 PM
 */
class stretch {
  public static void main(String[] args) {
    int[] arr = {18, 7, 4, 24, 11};
    System.out.println(Arrays.toString(stretch(arr)));
  }
  
  public static int[] stretch(int[] arr) {
    int[] result = new int[2 * arr.length];
    for (int i = 0; i < arr.length; i++) {
      int div = arr[i] / 2;
      result[2 * i] = arr[i] - div;
      result[2 * i + 1] = div;
    }
    
    return result;
  }
}
