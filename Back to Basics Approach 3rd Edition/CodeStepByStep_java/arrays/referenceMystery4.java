package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * [4, 0, 2] 4 1
 * [4, 0, 2] 3
 * [8, 0, 4] 1 1
 * [8, 0, 4] 6
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 9:46 PM
 */
class referenceMystery4 {
  public static void main(String[] args) {
    int[] a = {2, 0, 1};
    int b = 3;
    mystery(a, b, a[0]);
    System.out.println(Arrays.toString(a) + " " + b);

    b = a[0] + a[1] + a[2];
    mystery(a, a[1], a[2]);
    System.out.println(Arrays.toString(a) + " " + b);
  }

  public static void mystery(int[] a, int b, int c) {
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] * 2;
    }

    b++;
    c--;
    System.out.println(Arrays.toString(a) + " " + b + " " + c);
  }
}
