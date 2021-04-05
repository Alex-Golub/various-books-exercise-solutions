package cse_142.cs1_sections.section02_expressions_for_loops_constants;

/**
 * https://practiceit.cs.washington.edu/problem/view/3624?categoryid=116
 *
 * output:
 *          *
 *         ***
 *        *****
 *       *******
 *      *********
 *     ***********
 *    *************
 *   ***************
 *  *****************
 * *******************
 *
 * @author Alex Golub
 * @since 01-Apr-21 4:36 PM
 */
class nestedLoops {
  static int HEIGHT = 20;
  public static void main(String[] args) {
    for (int i = 0; i < HEIGHT; i++) {
      for (int j = 0; j < HEIGHT - i; j++)
        System.out.print(" ");
      for (int j = 0; j < 2 * i + 1; j++)
        System.out.print("*");

      System.out.println();
    }
  }
}
