package chapter4_Control_Statements_Part_1._4_1_GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ag on 23-Jun-20 9:37 PM
 */
public class DrawPanel extends JPanel {

  @Override
  protected void paintComponent(Graphics g) {
    // The first statement in every paintComponent method you create should always be:
    super.paintComponent(g);
    // ensures that the panel is properly rendered before we begin drawing on it.

    int width = getWidth();
    int height = getHeight();

    int steps = 1;
    int x2 = 0;
    int y2 = height;

    while (steps++ <= height * width) {
      g.drawLine(0, 0, x2, y2);
      x2 += 15;
      y2 -= 15;
    }

    // Resizing the window in this application causes the system to call paintComponent
    // to redraw the DrawPanel’s contents.
  }
}
