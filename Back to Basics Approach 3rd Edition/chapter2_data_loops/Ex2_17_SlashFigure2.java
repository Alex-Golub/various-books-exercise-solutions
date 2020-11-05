package chapter2_data_loops;

/**
 * 17. Modify your SlashFigure program from the previous exercise to
 * become a new program called SlashFigure2
 * that uses a global constant for the figure’s height.
 *  Height 4      Height 8
 * !!!!!!!!!!!!!! !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * \\!!!!!!!!!!// \\!!!!!!!!!!!!!!!!!!!!!!!!!!//
 * \\\\!!!!!!//// \\\\!!!!!!!!!!!!!!!!!!!!!!////
 * \\\\\\!!////// \\\\\\!!!!!!!!!!!!!!!!!!//////
 *                \\\\\\\\!!!!!!!!!!!!!!////////
 *                \\\\\\\\\\!!!!!!!!!!//////////
 *                \\\\\\\\\\\\!!!!!!////////////
 *                \\\\\\\\\\\\\\!!//////////////
 *
 * Created by ag on 02-Nov-20 12:58 PM
 */
class Ex2_17_SlashFigure2 {
  public static final int HEIGHT = 8;

  public static void main(String[] args) {
    for (int line = 0; line < HEIGHT; line++) {
      for (int slash = 0; slash < 2 * line; slash++)
        System.out.print("\\");

      // y(line) = -4 * line + k
      // We have to find x that include HEIGHT
      // HEIGHT = 4 => #of! = 14 => HEIGHT * x + y = 14
      // HEIGHT = 8 => #of! = 30 => HEIGHT * x + y = 30
      // 4x + y = 14
      // 8x + y = 30
      // => x = 4; y = -2
      // k = 4 * HEIGHT - 2
      for (int mark = 0; mark < -4 * line + 4 * HEIGHT - 2; mark++)
        System.out.print("!");

      for (int slash = 0; slash < 2 * line; slash++)
        System.out.print("/");

      System.out.println();
    }
  }
}
