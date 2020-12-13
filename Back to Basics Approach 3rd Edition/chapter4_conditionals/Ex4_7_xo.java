package chapter4_conditionals;

/**
 * 7. Write a static method called xo that accepts an integer size as a
 * parameter and prints a square of size by size characters, where all
 * characters are "o" except that an "x" pattern of "x" characters has
 * been drawn from the corners of the square.
 * On the first line, the first and last characters are "x";
 * on the second line, the second and second-from-last characters are "x";
 * and so on.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 4:13 PM
 */
class Ex4_7_xo {
  public static void main(String[] args) {
    xo(5);
    xo(8);
    xo(3);
    xo(1);
    xo(0);
    xo(12);
    xo(11);
  }

  public static void xo(int size) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++)
        if (j == i || j == size - i - 1)
          System.out.print('x');
        else
          System.out.print('o');
      System.out.println();
    }
  }
}
