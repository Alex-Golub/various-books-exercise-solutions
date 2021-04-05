package cse_142.cs1_sections.section02_expressions_for_loops_constants;

/**
 * https://practiceit.cs.washington.edu/problem/view/534?categoryid=116
 *
 * size 3
 * ////////\\\\\\\\
 * ////********\\\\
 * ****************
 *
 * size 6
 * ////////////////////\\\\\\\\\\\\\\\\\\\\
 * ////////////////********\\\\\\\\\\\\\\\\
 * ////////////****************\\\\\\\\\\\\
 * ////////************************\\\\\\\\
 * ////********************************\\\\
 * ****************************************
 *
 * @author Alex Golub
 * @since 01-Apr-21 5:00 PM
 */
class StarFigure2 {
  public static final int SIZE = 2;

  public static void main(String[] args) {
    for (int i = 0; i < SIZE; i++) {
      int constant = 4 * (SIZE - i - 1);

      for (int j = 0; j < constant; j++)
        System.out.print("/");

      for (int j = 0; j < 8 * i; j++)
        System.out.print("*");

      for (int j = 0; j < constant; j++)
        System.out.print("\\");

      System.out.println();
    }
  }
}
