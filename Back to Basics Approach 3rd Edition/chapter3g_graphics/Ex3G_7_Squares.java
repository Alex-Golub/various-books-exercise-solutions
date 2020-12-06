package chapter3g_graphics;

import java.awt.*;

/**
 * 7. Write a program in a class named Squares that uses the DrawingPanel
 * to draw the following figure:
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 9:47 PM
 */
class Ex3G_7_Squares {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(300, 200);
    panel.setBackground(Color.CYAN);
    Graphics g = panel.getGraphics();

    int x = 50, y = 50;
    g.setColor(Color.RED);
    for (int i = 1; i <= 5; i++)
      g.drawRect(x, y, 20 * i, 20 * i);

    g.setColor(Color.BLACK);
    g.drawLine(x, y, 3 * x, 3 * y);
  }
}
