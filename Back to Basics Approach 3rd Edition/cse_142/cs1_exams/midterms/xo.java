package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm13/xo
 *
 * @author Alex Golub
 * @since 11-Apr-21 8:46 PM
 */
class xo {
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
