package cse_142.cs1_labs;

import chapter09_inheritance_and_interfaces.DrawingPanel;

import java.awt.*;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab3/Face2
 *
 * @author Alex Golub
 * @since 05-Apr-21 1:36 PM
 */
class Face2 {
  public static void main(String[] args) {
    DrawingPanel drawingPanel = new DrawingPanel(320, 180);
    Graphics2D graphics = drawingPanel.getGraphics();
    drawFaceAt(10, 30, graphics);
    drawFaceAt(150, 50, graphics);
  }

  private static void drawFaceAt(int x, int y, Graphics2D g) {
    // face
    g.setColor(Color.BLACK);
    g.drawOval(x, y, 100, 100);

    // eyes
    g.setColor(Color.BLUE);
    g.fillOval(x + 20, y + 30, 20, 20);
    g.fillOval(x + 60, y + 30, 20, 20);

    // mouth
    g.setColor(Color.RED);
    g.drawLine(x + 30, y + 70, x + 70, y + 70);
  }
}
