package chapter3g_graphics;

import java.awt.*;

/**
 * 5. Write a program called ShowDesign that uses the DrawingPanel
 * to draw Figure 3G.24.
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 8:47 PM
 */
class Ex3G_5_ShowDesign {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(200, 200);
    Graphics     g     = panel.getGraphics();

    for (int i = 1; i < 5; i++)
      g.drawRect(20 * i, 20 * i, 200 - i * 40, 200 - i * 40);
  }
}
