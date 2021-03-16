package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * 2 3 [0, 0, 17, 0]
 * 3 1 [0, 0, 17, 0]
 * 1 0 [17, 0, 17, 0]
 * 0 1 [17, 0, 17, 0]
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 9:30 PM
 */
class referenceMystery1 {
  public static void main(String[] args) {
    int y = 1;
    int x = 3;
    int[] a = new int[4];

    mystery(a, y, x);
    System.out.println(x + " " + y + " " + Arrays.toString(a));

    x = y - 1;
    mystery(a, y, x);
    System.out.println(x + " " + y + " " + Arrays.toString(a));
  }

  public static void mystery(int[] a, int x, int y) {
    if (x < y) {
      x++;
      a[x] = 17;
    } else {
      a[y] = 17;
    }

    System.out.println(x + " " + y + " " + Arrays.toString(a));
  }
}
