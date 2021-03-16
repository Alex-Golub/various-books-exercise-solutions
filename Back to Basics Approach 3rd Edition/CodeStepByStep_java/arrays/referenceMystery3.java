package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * 2 [0, 1]
 * 1 [0, 1]
 * 1 [1, 2]
 * 0 [1, 2]
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 9:44 PM
 */
class referenceMystery3 {
  public static void main(String[] args) {
    int x = 1;
    int[] a = new int[2];

    mystery(x, a);
    System.out.println(x + " " + Arrays.toString(a));

    x--;
    a[1] = a.length;
    mystery(x, a);
    System.out.println(x + " " + Arrays.toString(a));
  }

  public static void mystery(int x, int[] a) {
    a[x]++;
    x++;
    System.out.println(x + " " + Arrays.toString(a));
  }
}
