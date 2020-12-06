package chapter3g_graphics;

import java.awt.*;

/**
 * 9. Modify your Squares2 program from the previous exercise into a
 * new class Squares3 that draws the following figures.
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 9:47 PM
 */
class Ex3G_9_Squares3 {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(400, 300);
    panel.setBackground(Color.CYAN);
    Graphics g = panel.getGraphics();

    drawSquare(g, 250, 10, 50);
    drawSquare(g, 50, 50, 100);
    drawSquare(g, 180, 115, 180);
  }

  public static void drawSquare(Graphics g, int x, int y, int size) {
    int t = size / 5;
    g.setColor(Color.RED);

    for (int i = 1; i <= 5; i++)
      g.drawRect(x, y, t * i, t * i);

    g.setColor(Color.BLACK);
    g.drawLine(x, y, x + size, y + size);
  }
}
