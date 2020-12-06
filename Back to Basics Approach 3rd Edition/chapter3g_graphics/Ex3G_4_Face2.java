package chapter3g_graphics;

import java.awt.*;

/**
 * 4. Modify your previous Face program to draw the new output shown in
 * Figure 3G.23. The window size should be changed to 520 × 180 pixels,
 * and the faces’ top-left corners are at
 * (10, 30), (110, 30), (210, 30), (310, 30), and (410, 30).
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 8:41 PM
 */
class Ex3G_4_Face2 {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(520, 180);
    Graphics     g     = panel.getGraphics();

    for (int i = 0; i < 5; i++)
      face(g, i * 100 + 10, 30);
  }

  public static void face(Graphics g, int x, int y) {
    g.setColor(Color.BLACK);
    g.drawOval(x, y, 100, 100); // face outline

    g.setColor(Color.BLUE);
    g.fillOval(x + 20, y + 30, 20, 20); // eyes
    g.fillOval(x + 60, y + 30, 20, 20);

    g.setColor(Color.RED); // mouth
    g.drawLine(x + 30, y + 70, x + 70, y + 70);
  }
}
