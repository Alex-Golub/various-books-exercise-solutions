package cse_142.cs1_sections.section03_paramaters_graphics;

import chapter09_inheritance_and_interfaces.DrawingPanel;

import java.awt.*;

/**
 * https://practiceit.cs.washington.edu/problem/view/3717?categoryid=117
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:21 PM
 */
class Squares2 {
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
