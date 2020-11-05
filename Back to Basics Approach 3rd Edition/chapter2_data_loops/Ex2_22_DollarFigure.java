package chapter2_data_loops;

/**
 * 22. Write a Java program called DollarFigure that produces the
 * following output.
 *
 * $$$$$$$**************$$$$$$$
 * **$$$$$$************$$$$$$**
 * ****$$$$$**********$$$$$****
 * ******$$$$********$$$$******
 * ********$$$******$$$********
 * **********$$****$$**********
 * ************$**$************
 *
 * Created by ag on 02-Nov-20 3:47 PM
 */
class Ex2_22_DollarFigure {
  public static void main(String[] args) {
    final int LINES = 7;
    for (int line = 0; line < LINES; line++) {
      for (int i = 0; i < 2 * line; i++)
        System.out.print("*");
      for (int i = 0; i < -line + LINES; i++)
        System.out.print("$");
      for (int i = 0; i < -2 * line + 14; i++)
        System.out.print("*");
      for (int i = 0; i < -line + LINES; i++)
        System.out.print("$");
      for (int i = 0; i < 2 * line; i++)
        System.out.print("*");

      System.out.println();
    }
  }
}
