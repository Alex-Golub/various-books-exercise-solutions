package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * [11, 21] 8 16
 * [11, 21] 3 5
 * [12, 23] 14 15
 * [12, 23] 3 5
 *
 * @author Mr.Dr.Professor
 * @since 14-Feb-21 9:51 PM
 */
class referenceMystery5 {
  public static void main(String[] args) {
    int[] a = new int[2];
    a[0] = 10;
    a[1] = 20;
    int b = 3;
    int c = 5;

    mystery(a, b, c);
    System.out.println(Arrays.toString(a) + " " + b + " " + c);

    a[1]++;
    mystery(a, a[0], b);
    System.out.println(Arrays.toString(a) + " " + b + " " + c);
  }

  public static void mystery(int[] a, int b, int c) {
    b = b + c;
    for (int i = 0; i < a.length; i++) {
      a[i]++;
    }

    c = c + a[0];
    System.out.println(Arrays.toString(a) + " " + b + " " + c);
  }
}
