package cse_142.cs1_labs;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab2/loopTable
 *
 * *******
 * *****
 * ***
 * *
 *
 * @author Alex Golub
 * @since 05-Apr-21 1:21 PM
 */
class loopTable {
  public static void main(String[] args) {
    for (int i = 4; i > 0; i--) {
      for (int j = 0; j < 2 * i - 1; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
