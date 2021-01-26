package chapter5_Loops;

/**
 * **5.19 (Display numbers in a pyramid pattern)
 * Write a nested for loop that prints the
 * following output:
 * 1
 * 1 3 1
 * 1 3 9 3 1
 * 1 3 9 27 9 3 1
 *
 * @author Mr.Dr.Professor
 * @since 22-Jan-21 2:40 PM
 */
class Ex5_19_pyramid {
  static final int NUM   = 3;
  static final int LINES = 8;
  static final int WIDTH = 5;

  public static void main(String[] args) {
    for (int line = 0; line < LINES; line++) {
      // spaces = LINES - 1 * WIDTH - WIDTH - line
      // using linear dependence
      System.out.print(" ".repeat((LINES - 1) * WIDTH - WIDTH * line));

      // print first half of triangle
      for (int j = 0; j <= (2 * line + 1) / 2; j++)
        System.out.printf("%5d", (int) (Math.pow(NUM, j)));

      // print second half of triangle with offset of one
      for (int j = line - 1; j >= 0; j--) {
        System.out.printf("%5d", (int) (Math.pow(NUM, j)));
      }

      System.out.println();
    }
  }

}
