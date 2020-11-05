package chapter2_data_loops;

/**
 * 16. Write a Java program called SlashFigure that produces t
 * he following output.
 *
 * !!!!!!!!!!!!!!!!!!!!!!
 * \\!!!!!!!!!!!!!!!!!!//
 * \\\\!!!!!!!!!!!!!!////
 * \\\\\\!!!!!!!!!!//////
 * \\\\\\\\!!!!!!////////
 * \\\\\\\\\\!!//////////
 *
 * Created by ag on 02-Nov-20 12:38 PM
 */
class Ex2_16_SlashFigure {
  public static void main(String[] args) {
    final int LINES = 6;
    for (int line = 0; line < LINES; line++) {
      for (int slash = 0; slash < 2 * line; slash++)
        System.out.print("\\");

      for (int mark = 0; mark < -4 * line + 22; mark++)
        System.out.print("!");

      for (int slash = 0; slash < 2 * line; slash++)
        System.out.print("/");

      System.out.println();
    }
  }
}
