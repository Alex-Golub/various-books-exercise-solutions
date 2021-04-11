package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm4/cheerleader
 *
 * test #1:cheerleader(2, 1);
 * console output:
 * Go
 *    Go
 * result: pass
 *
 * test #2:cheerleader(4, 3);
 * console output:
 * Go Team Go Team Go
 *    Go Team Go Team Go
 *       Go Team Go Team Go
 *          Go Team Go Team Go
 * result: pass
 *
 * test #3:cheerleader(2, 4);
 * console output:
 * Go Team Go Team Go Team Go
 *    Go Team Go Team Go Team Go
 * result: pass
 *
 * test #4:cheerleader(5, 6);
 * console output:
 * Go Team Go Team Go Team Go Team Go Team Go
 *    Go Team Go Team Go Team Go Team Go Team Go
 *       Go Team Go Team Go Team Go Team Go Team Go
 *          Go Team Go Team Go Team Go Team Go Team Go
 *             Go Team Go Team Go Team Go Team Go Team Go
 * result: pass
 *
 * test #5:cheerleader(1, 1);
 * console output:
 * Go
 * result: pass
 *
 * @author Alex Golub
 * @since 10-Apr-21 1:12 PM
 */
class cheerleader {
  public static void main(String[] args) {
    cheerleader(2, 1);
    System.out.println();
    cheerleader(4, 3);
    System.out.println();
    cheerleader(2, 4);
  }

  public static void cheerleader(int lines, int cheers) {
    final int INDENT_BY = 3;
    for (int i = 0; i < lines; i++) {

      // indent
      for (int j = 1; j <= INDENT_BY * i; j++) {
        System.out.print(" ");
      }

      System.out.print("Go");
      for (int j = 1; j < cheers; j++) {
        System.out.print(" Team Go");
      }

      System.out.println();
    }
  }
}
