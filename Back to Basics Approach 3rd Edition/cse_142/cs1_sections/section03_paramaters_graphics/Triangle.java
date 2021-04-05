package cse_142.cs1_sections.section03_paramaters_graphics;

import chapter09_inheritance_and_interfaces.DrawingPanel;

import java.awt.*;

/**
 * https://practiceit.cs.washington.edu/problem/view/3723?categoryid=117
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:22 PM
 */
class Triangle {
  public static void main(String[] args) {
    int w = 600;
    int h = 200;
    final int V_SPACE = 10; // vertical space
    final int LINES = h / V_SPACE; // number of lines

    DrawingPanel panel = new DrawingPanel(w, h);
    panel.setBackground(Color.YELLOW);
    Graphics g = panel.getGraphics();
    g.setColor(Color.BLUE);

    for (int i = 1; i < LINES; i++) {
      int x1 = w / (2 * LINES) * i;
      int y1 = V_SPACE * i;

      g.drawLine(x1, y1, w - x1, y1);
    }

    g.drawLine(0, 0, w / 2, h);
    g.drawLine(w, 0, w / 2, h);
  }
}
