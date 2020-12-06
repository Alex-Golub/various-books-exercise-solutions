package chapter3g_graphics;

import java.awt.*;

/**
 * 13. Write a program called Spiral that uses the DrawingPanel
 * to draw the figure shown in Figure 3G.32.
 *
 * @author Mr.Dr.Professor
 * @since 06-Dec-20 8:28 PM
 */
class Ex3G_13_Spiral {
  public static void main(String[] args) {
    int w = 800;
    int h = 800;
    DrawingPanel panel = new DrawingPanel(w, h);
    Graphics     g     = panel.getGraphics();

    spiral(g, 20, w, h);
  }

  public static void spiral(Graphics g, int loops, int w, int h) {
    for (int i = 0; i < loops; i++) {
      int x = 10 * i;
      int y = 10 + 10 * i;
      int z = w - 10 - 10 * i;
      g.drawLine(x, y, z, y);
      g.drawLine(z, y, z, z);
      g.drawLine(z, z, y, z);
      g.drawLine(y, z, y, 10 + y);
    }
  }
}
