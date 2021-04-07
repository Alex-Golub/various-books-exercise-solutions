package cse_142.cs1_labs;

import chapter09_inheritance_and_interfaces.DrawingPanel;

import java.awt.*;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab3/Face2
 *
 * @author Alex Golub
 * @since 05-Apr-21 1:29 PM
 */
class Face {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(220, 150);
    Graphics2D graphics = panel.getGraphics();

    // face
    graphics.drawOval(10, 30, 100, 100);

    // eyes
    graphics.setColor(Color.BLUE);
    graphics.fillOval(30, 60, 20, 20);
    graphics.fillOval(70, 60, 20, 20);

    // mouth
    graphics.setColor(Color.RED);
    graphics.drawLine(40, 100, 80, 100);
  }
}
