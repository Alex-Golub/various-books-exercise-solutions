package CodeStepByStep_java.arrays;

import java.util.Arrays;

/**
 * Write a method named collapsePairs that accepts an array of
 * integers as a parameter and modifies the array so that each
 * of its pairs of neighboring integers
 * (such as the pair at indexes 0-1, and the pair at indexes 2-3, etc.)
 * are combined into a single sum of that pair.
 * The sum will be stored at the even index (0,2,4, etc.) if the sum is even and
 * at the odd index (1,3,5, etc.) if the sum is odd.
 * The other index of the pair will change to 0.
 *
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 11:26 PM
 */
class collapsePairs {
  public static void main(String[] args) {
    int[] arr = {7, 2, 8, 9, 4, 22, 7, 1, 9, 10};
    collapsePairs(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void collapsePairs(int[] list) {
    for (int i = 0; i < list.length - 1; i += 2) {
      int res = list[i] + list[i + 1];
      if (res % 2 == 0) {
        list[i] = res;
        list[i + 1] = 0;
      } else {
        list[i + 1] = res;
        list[i] = 0;
      }
    }
  }
}
