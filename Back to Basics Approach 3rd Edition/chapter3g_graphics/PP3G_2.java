package chapter3g_graphics;

import java.awt.*;

/**
 * @author Mr.Dr.Professor
 * @since 06-Dec-20 11:14 PM
 */
class PP3G_2 {
  static final int W = 50;
  static final int H = 50;

  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(200, 200);
    Graphics     g     = panel.getGraphics();

    eyes(g, 10, 10, Color.GRAY);
  }

  // TODO
  public static void eyes(Graphics g, int x, int y, Color c) {
    g.drawRect(x, y, W, H);
    g.drawOval(x + 5, y + 5, W / 4, H - 10);
    g.drawOval(x + 32, y + 5, W / 4, H - 10);
  }

  public static void spiral(Graphics g, int x, int y, Color c) {

  }

  public static void string(Graphics g, int x, int y, Color c) {

  }

}
