package cse_143.cs2_sections.section01_arrayList;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrays/numUnique
 *
 * @author Alex Golub
 * @since 19-Apr-21 8:04 PM
 */
class numUnique {
  // pre: array is guaranteed to be in sorted order
  public static int numUnique(int[] arr) {
    if (arr == null || arr.length == 0) {
      return 0;
    }
    
    int unique = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        unique++;
      }
    }
    
    return unique;
  }
}
