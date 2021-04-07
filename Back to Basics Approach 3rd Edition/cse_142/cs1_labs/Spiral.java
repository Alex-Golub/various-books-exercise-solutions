package cse_142.cs1_labs;

import chapter09_inheritance_and_interfaces.DrawingPanel;

import java.awt.*;

/**
 * @author Alex Golub
 * @since 05-Apr-21 2:06 PM
 */
class Spiral {
  public static void main(String[] args) {
    int w = 170;
    int h = 170;
    DrawingPanel panel = new DrawingPanel(w, h);
    Graphics g = panel.getGraphics();

    spiral(g, 8, w, h);
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
