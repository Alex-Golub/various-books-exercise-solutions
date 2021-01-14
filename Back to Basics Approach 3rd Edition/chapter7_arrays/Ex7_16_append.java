package chapter7_arrays;

import java.util.Arrays;

/**
 * 16. Write a method called append that accepts two integer arrays
 * as parameters and returns a new array that contains the
 * result of appending the second array’s values at the end of the
 * first array.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 8:09 PM
 */
class Ex7_16_append {
  public static void main(String[] args) {
    int[] list1 = {2, 4, 6};
    int[] list2 = {1, 2, 3, 4, 5};
    int[] res   = {2, 4, 6, 1, 2, 3, 4, 5};
    System.out.println(Arrays.equals(append(list1, list2), res)); // true

    res = new int[]{1, 2, 3, 4, 5, 2, 4, 6};
    System.out.println(Arrays.equals(append(list2, list1), res)); // true
  }

  public static int[] append(int[] a1, int[] a2) {
    int[] union = new int[a1.length + a2.length];
    int i = 0;

    for (int j = 0; j < a1.length; i++, j++)
      union[i] = a1[j];

    for (int j = 0; j < a2.length; i++, j++)
      union[i] = a2[j];

//    System.arraycopy(a1, 0, union, 0, a1.length);
//    System.arraycopy(a2, 0, union, a1.length, a2.length);

    return union;
  }
}
