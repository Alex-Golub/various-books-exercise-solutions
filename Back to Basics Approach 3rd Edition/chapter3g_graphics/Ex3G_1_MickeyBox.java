package chapter3g_graphics;

import java.awt.*;

/**
 * 1. Write a program that uses the DrawingPanel to draw Figure 3G.19.
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 6:42 PM
 */
class Ex3G_1_MickeyBox {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(220, 150);
    Graphics     g     = panel.getGraphics();

    panel.setBackground(Color.YELLOW);

    final int SPACE_APART = 80;

    g.setColor(Color.BLUE);
    g.fillOval(50, 25, 40, 40);
    g.fillOval(50 + SPACE_APART, 25, 40, 40);

    g.setColor(Color.RED);
    g.fillRect(50 + 40 / 2, 25 + 40 / 2, 80, 80);

    g.setColor(Color.BLACK);
    g.drawLine(70, 25 + 40 / 2 + 40, 70 + SPACE_APART, 25 + 40 / 2 + 40);

  }
}
