package chapter2_data_loops;

/**
 * 20. Write a Java program called StarFigure that produces the
 * following output.
 * <p>
 * ////////////////\\\\\\\\\\\\\\\\
 * ////////////********\\\\\\\\\\\\
 * ////////****************\\\\\\\\
 * ////************************\\\\
 * ********************************
 * <p>
 * Created by ag on 02-Nov-20 2:24 PM
 */
class Ex2_20_StarFigure {
  public static void main(String[] args) {
    final int LINES = 5;
    for (int line = 0; line < LINES; line++) {
      for (int i = 0; i < -4 * line + 16; i++)
        System.out.print("/");
      for (int i = 0; i < 8 * line; i++)
        System.out.print("*");
      for (int i = 0; i < -4 * line + 16; i++)
        System.out.print("\\");

      System.out.println();
    }
  }
}
