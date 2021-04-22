package cse_143.cs2_sections.section01_arrayList;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrays/findMin
 *
 * @author Alex Golub
 * @since 19-Apr-21 8:02 PM
 */
class findMin {
  // pre: at least one element
  // post: return smallest value found
  public static int findMin(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      min = Math.min(min, arr[i]);
    }
    
    return min;
  }
}
