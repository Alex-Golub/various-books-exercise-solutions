package chapter3g_graphics;

import java.awt.*;

/**
 * 3. writing a parameterized method that draws a face at different positions.
 * The window size should be changed to 320 × 180 pixels,
 * and the two faces’ top-left corners are at (10, 30) and (150, 50).
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 8:31 PM
 */
class Ex3G_3_Face {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(320, 180);
    Graphics     g     = panel.getGraphics();

    face(g, 10, 30);
    face(g, 150, 50);
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
