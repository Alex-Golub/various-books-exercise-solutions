package chapter3g_graphics;

import java.awt.*;

/**
 * 6. Modify your ShowDesign program from the
 * previous exercise so that it
 * has a method that accepts parameters for
 * the window width and height and displays
 * the rectangles at the appropriate sizes.
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 8:47 PM
 */
class Ex3G_6_ShowDesign2 {
  public static void main(String[] args) {
    showDesign(500, 800);
  }

  public static void showDesign(int w, int h) {
    DrawingPanel panel = new DrawingPanel(w, h);
    Graphics     g     = panel.getGraphics();

    int x = w / 10, y = h / 10;

    for (int i = 1; i < 5; i++)
      g.drawRect(
              i * x,
              i * y,
              w - 2 * i * x,
              h - 2 * i * y
      );
  }
}
