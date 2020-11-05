package chapter2_data_loops;

/**
 * 23. Modify your DollarFigure program from the previous exercise to
 * become a new program called DollarFigure2
 * that uses a global constant for the figure’s height.
 *
 * size 3       size 5
 * $$$******$$$ $$$$$**********$$$$$
 * **$$****$$** **$$$$********$$$$**
 * ****$**$**** ****$$$******$$$****
 *              ******$$****$$******
 *              ********$**$********
 *
 * Created by ag on 02-Nov-20 4:37 PM
 */
class Ex2_23_DollarFigure2 {
  public static final int HEIGHT = 3;

  public static void main(String[] args) {
    for (int line = 0; line < HEIGHT; line++) {
      for (int i = 0; i < 2 * line; i++)
        System.out.print("*");
      for (int i = 0; i < HEIGHT - line; i++)
        System.out.print("$");
      for (int i = 0; i < -2 * line + 2 * HEIGHT; i++)
        System.out.print("*");
      for (int i = 0; i < HEIGHT - line; i++)
        System.out.print("$");
      for (int i = 0; i < 2 * line; i++)
        System.out.print("*");

      System.out.println();
    }
  }
}
