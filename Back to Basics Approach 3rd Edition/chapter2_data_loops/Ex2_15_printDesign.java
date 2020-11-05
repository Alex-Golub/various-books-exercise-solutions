package chapter2_data_loops;

/**
 * 15. Write a method called printDesign that produces the following output.
 *
 * -----1-----
 * ----333----
 * ---55555---
 * --7777777--
 * -999999999-
 *
 * Created by ag on 02-Nov-20 12:16 PM
 */
class Ex2_15_printDesign {
  public static void main(String[] args) {
    final int LINES = 20;

    for (int line = 0; line < LINES; line++) {
      for (int j = 0; j < LINES - line; j++)
        System.out.print("-");

      for (int j = 0; j < 2 * line + 1; j++)
        System.out.print((2 * line + 1) % 10);

      for (int j = 0; j < LINES - line; j++)
        System.out.print("-");

      System.out.println();
    }
  }
}
