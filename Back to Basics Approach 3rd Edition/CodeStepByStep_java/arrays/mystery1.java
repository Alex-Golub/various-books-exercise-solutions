package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 3:38 PM
 */
class mystery1 {
  public static void main(String[] args) {
    int[] a1 = {1,3,5,7,9};
    int[] a2 = {1, 4, 9, 16, 25};
    mystery1(a1, a2);
    System.out.println(Arrays.toString(a1));
  }

  public static void mystery1(int[] a1, int[] a2) {
    for (int i = 0; i < a1.length; i++)
      a1[i] += a2[a2.length - i - 1];
  }
}
