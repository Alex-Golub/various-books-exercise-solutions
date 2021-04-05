package cse_142.cs1_sections.section02_expressions_for_loops_constants;

/**
 * https://practiceit.cs.washington.edu/problem/view/533?categoryid=116
 *
 * ////////////////\\\\\\\\\\\\\\\\
 * ////////////********\\\\\\\\\\\\
 * ////////****************\\\\\\\\
 * ////************************\\\\
 * ********************************
 *
 * @author Alex Golub
 * @since 01-Apr-21 4:39 PM
 */
class StarFigure {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 16 - 4 * i; j++)
        System.out.print("/");

      for (int j = 0; j < 8 * i; j++)
        System.out.print("*");

      for (int j = 0; j < 16 - 4 * i; j++)
        System.out.print("\\");

      System.out.println();
    }
  }
}
