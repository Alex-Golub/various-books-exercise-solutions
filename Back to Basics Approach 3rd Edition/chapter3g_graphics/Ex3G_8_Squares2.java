package chapter3g_graphics;

import java.awt.*;

/**
 * 8. Modify your Squares program from the previous exercise into a new class
 * Squares2 that draws the following figures.
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 9:47 PM
 */
class Ex3G_8_Squares2 {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(400, 300);
    panel.setBackground(Color.CYAN);
    Graphics g = panel.getGraphics();

    drawSquare(g, 50, 50);
    drawSquare(g, 250, 10);
    drawSquare(g, 180, 115);
  }

  public static void drawSquare(Graphics g, int x, int y) {
    g.setColor(Color.RED);
    for (int i = 1; i <= 5; i++)
      g.drawRect(x, y, 20 * i, 20 * i);

    g.setColor(Color.BLACK);
    g.drawLine(x, y, x + 100, y + 100);
  }
}
