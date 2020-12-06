package chapter3g_graphics;

import java.awt.*;

/**
 * 12. Write a program called Triangle that uses the DrawingPanel
 * to draw the figure shown in Figure 3G.31.
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 11:28 PM
 */
class Ex3G_12_Triangle {
  public static void main(String[] args) {
    int       w       = 600;
    int       h       = 200;
    final int V_SPACE = 10; // vertical space
    final int LINES   = h / V_SPACE; // number of lines

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
