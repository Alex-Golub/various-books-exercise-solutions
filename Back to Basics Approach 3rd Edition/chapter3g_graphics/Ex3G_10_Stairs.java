package chapter3g_graphics;

import java.awt.*;

/**
 * 10. Write a program called Stairs that uses the DrawingPanel
 * to draw the figure shown in Figure 3G.29.
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 10:17 PM
 */
class Ex3G_10_Stairs {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(110, 110);
    Graphics     g     = panel.getGraphics();
    for (int i = 1; i <= 10; i++) {
      g.drawRect(5, 10 * i - 5, 10 * i, 10);
    }
  }
}
