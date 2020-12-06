package chapter3g_graphics;

import java.awt.*;

/**
 * 13. Using the DrawingPanel class, write a Java class named Football that
 * produces the following figure:
 *
 * @author Mr.Dr.Professor
 * @since 06-Dec-20 9:17 PM
 */
class Ex3G_13_Football {
  public static void main(String[] args) {
    final int    WIDTH  = 250;
    final int    HEIGHT = 250;
    DrawingPanel panel  = new DrawingPanel(WIDTH, HEIGHT);
    Graphics     g      = panel.getGraphics();

    final int REC_WIDTH  = 200;
    final int REC_HEIGHT = 200;
    g.drawRect(10, 30, REC_WIDTH, REC_HEIGHT);

    for (int i = 0; i < REC_WIDTH / 10; i++) {
      int x = 20 + 10 * i;
      int y = 220 - 10 * i;
      g.drawLine(10, y, x, 30);
      g.drawLine(x, 230, 210, y);
    }
  }
}
