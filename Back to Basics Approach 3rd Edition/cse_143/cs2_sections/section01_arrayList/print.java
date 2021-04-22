package cse_143.cs2_sections.section01_arrayList;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs2/sections/arrays/print
 *
 * @author Alex Golub
 * @since 19-Apr-21 7:59 PM
 */
class print {
  public static void print(int[] arr) {
    System.out.print("[");
    if (arr.length > 0) {
      System.out.print(arr[0]);
      for (int i = 1; i < arr.length; i++) {
        System.out.print(", " + arr[i]);
      }
    }
    System.out.println("]");
  }
}
