package chapter2_data_loops;

/**
 * 24. Write a program called TwoRectangles that uses two integer class
 * constants called WIDTH and HEIGHT to draw two rectangles of stars
 * of the given dimensions.
 * The first rectangle should be flush left,
 * and the second should be indented horizontally by the given width.
 * For example, if the WIDTH and HEIGHT are 7 and 4 respectively,
 * the program should draw the following figure:
 *
 * *******
 * *******
 * *******
 * *******
 *        *******
 *        *******
 *        *******
 *        *******
 * FIXME
 * Created by ag on 04-Nov-20 1:03 PM
 */
class Ex2_24_TwoRectangles {
  public static final int WIDTH = 7;
  public static final int HEIGHT = 4;

  public static void main(String[] args) {
    for (int i = 0; i < 2 * HEIGHT; i++) {

      for (int j = 0; j < WIDTH; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
