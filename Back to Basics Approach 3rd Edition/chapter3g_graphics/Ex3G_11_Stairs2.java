package chapter3g_graphics;

import java.awt.*;

/**
 * 11. Modify your Stairs program from the previous exercise
 * to make a new class Stairs2 that draws the output shown below.
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 10:17 PM
 */
class Ex3G_11_Stairs2 {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(110, 110);
    Graphics     g     = panel.getGraphics();
    for (int i = 10; i >= 1; i--) {
      g.drawRect(5, 10 * i - 5, 110 - 10 * i, 10);
    }
  }
}
