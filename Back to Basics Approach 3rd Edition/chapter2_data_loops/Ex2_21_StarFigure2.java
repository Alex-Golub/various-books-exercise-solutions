package chapter2_data_loops;

/**
 * 21. Modify your StarFigure program from the previous exercise to
 * become a new program named StarFigure2 that
 * uses a global constant for the figure’s height.
 * The following are the outputs for constant heights of 3 and 6:
 *
 * Height 3         Height 6
 * ////////\\\\\\\\ ////////////////////\\\\\\\\\\\\\\\\\\\\
 * ////********\\\\ ////////////////********\\\\\\\\\\\\\\\\
 * **************** ////////////****************\\\\\\\\\\\\
 *                  ////////************************\\\\\\\\
 *                  ////********************************\\\\
 *                  ****************************************
 *
 * Created by ag on 02-Nov-20 2:41 PM
 */
class Ex2_21_StarFigure2 {
  public static final int HEIGHT = 6;

  public static void main(String[] args) {
    for (int line = 0; line < HEIGHT; line++) {
      for (int i = 0; i < -4 * line + 4 * HEIGHT - 4; i++)
        System.out.print("/");
      for (int i = 0; i < 8 * line; i++)
        System.out.print("*");
      for (int i = 0; i < -4 * line + 4 * HEIGHT - 4; i++)
        System.out.print("\\");

      System.out.println();
    }
  }
}
