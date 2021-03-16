package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * 4 [9, 0, 0, 14]
 * 2 [9, 0, 0, 14]
 * 8 [9, 9, 14, 14]
 * 4 [9, 9, 14, 14]
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 9:40 PM
 */
class referenceMystery2 {
  public static void main(String[] args) {
    int x = 1;
    int[] a = new int[4];

    x = x * 2;
    mystery(x, a);
    System.out.println(x + " " + Arrays.toString(a));

    x = x * 2;
    mystery(x, a);
    System.out.println(x + " " + Arrays.toString(a));
  }

  public static void mystery(int x, int[] a) {
    x = x * 2;

    if (x > 6) {
      a[2] = 14;
      a[1] = 9;
    } else {
      a[0] = 9;
      a[3] = 14;
    }

    System.out.println(x + " " + Arrays.toString(a));
  }
}
