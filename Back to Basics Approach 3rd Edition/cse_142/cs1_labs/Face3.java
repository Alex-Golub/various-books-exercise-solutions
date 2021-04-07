package cse_142.cs1_labs;

import chapter09_inheritance_and_interfaces.DrawingPanel;

import java.awt.*;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab3/Face3
 *
 * @author Alex Golub
 * @since 05-Apr-21 1:52 PM
 */
class Face3 {
  public static void main(String[] args) {
    DrawingPanel drawingPanel = new DrawingPanel(520, 180);
    Graphics2D g = drawingPanel.getGraphics();
    for (int i = 0; i < 5; i++) {
      int offset = 100 * i;

      g.setColor(Color.BLACK);
      g.drawOval(offset + 10, 30, 100, 100);

      g.setColor(Color.BLUE);
      g.fillOval(offset + 30, 60, 20, 20);
      g.fillOval(offset + 70, 60, 20, 20);

      g.setColor(Color.RED);
      g.drawLine(offset + 40, 100, offset + 80, 100);
    }
  }
}
