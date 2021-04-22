package cse_143.cs2_sections.section01_arrayList;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrays/indexOf
 *
 * @author Alex Golub
 * @since 19-Apr-21 7:58 PM
 */
class indexOf {
  public static int indexOf(int[] arr, int value) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == value) {
        return i;
      }
    }
    
    return -1;
  }
}
