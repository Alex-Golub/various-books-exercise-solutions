package CodeStepByStep_java.arrays;

/**
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 3:49 PM
 */
class mystery2 {
  public static void mystery2(int[] a) {
    for (int i = 1; i < a.length - 1; i++)
      a[i] = a[i - 1] - a[i] + a[i + 1];
  }
}

// int[] a1 = {42, 42};                arrayMystery2(a1); => 42, 42
// int[] a2 = {6, 2, 4};               arrayMystery2(a2); => 6, 8, 4
// int[] a3 = {7, 7, 3, 8, 2};         arrayMystery2(a3); => 7, 3, 8, 2, 2
// int[] a4 = {4, 2, 3, 1, 2, 5};      arrayMystery2(a4); => 4, 5, 3, 4, 7, 5
// int[] a5 = {6, 0, -1, 3, 5, 0, -3}; arrayMystery2(a5); => 6, 5, 9, 11, 6, 3, -3

