package CodeStepByStep_java.arrays;

/**
 * Write a method named contains that accepts two arrays of integers
 * a1 and a2 as parameters and that returns a boolean value indicating
 * whether or not a2's sequence of elements appears in a1
 * (true for yes, false for no).
 * The sequence of elements in a2 may appear anywhere in a1 but must
 * appear consecutively and in the same order.
 *
 * You may assume that both arrays passed to your method will have
 * lengths of at least 1.
 * You may not use any Strings to help you solve this problem,
 * nor methods that produce Strings such as Arrays.toString.
 *
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 11:38 PM
 */
class contains {
  public static boolean contains(int[] a1, int[] a2) {
    int j = 0;

    for (int val : a1) {
      if (val != a2[j]) {
        j = 0;
        if (val == a2[j]) {
          j++;
        }
      } else {
        j++;
        if (j == a2.length)
          return true;
      }
    }

    return false;
  }
}
