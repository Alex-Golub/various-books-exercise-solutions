package cse_142.cs1_labs;

import chapter09_inheritance_and_interfaces.DrawingPanel;

import java.awt.*;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab3/stairs2
 *
 * @author Alex Golub
 * @since 05-Apr-21 2:02 PM
 */
class stairs2 {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(110, 110);
    Graphics g = panel.getGraphics();
    for (int i = 10; i >= 1; i--) {
      g.drawRect(5, 10 * i - 5, 110 - 10 * i, 10);
    }
  }
}
