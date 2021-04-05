package cse_142.cs1_sections.section03_paramaters_graphics;

import chapter09_inheritance_and_interfaces.DrawingPanel;

import java.awt.*;

/**
 * https://practiceit.cs.washington.edu/problem/view/3716?categoryid=117
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:19 PM
 */
class Squares {
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