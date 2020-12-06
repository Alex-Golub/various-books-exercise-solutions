package chapter3g_graphics;

import java.awt.*;

/**
 * 1. Write a program that draws the patterns shown in Figure
 * 3G.33 onto a DrawingPanel.
 *
 * @author Mr.Dr.Professor
 * @since 06-Dec-20 9:39 PM
 */
class PP3G_1 {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(400, 400);
    panel.setBackground(Color.CYAN);
    Graphics g = panel.getGraphics();

    gridOfFigures(g, 0, 0, 100, 5, 1, 1);
    gridOfFigures(g, 10, 120, 24, 4, 5, 5);
    gridOfFigures(g, 150, 20, 40, 5, 6, 6);
    gridOfFigures(g, 130, 275, 36, 3, 3, 3);
  }

  public static void gridOfFigures(Graphics g, int x, int y,
                                   int size, int n,
                                   int rows, int cols) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++)
        drawFigure(g, x + size * j, y, size, n);

      y += size;
    }
  }

  public static void drawFigure(Graphics g, int x, int y, int size, int n) {
    g.setColor(Color.GREEN);
    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);

    int r = size / n;
    for (int i = 0; i < n; i++) {
      int cx  = i * r / 2;
      int rad = size - r * i;

      g.setColor(Color.YELLOW);
      g.fillOval(x + cx, y + cx, rad, rad);
      g.setColor(Color.BLACK);
      g.drawOval(x + cx, y + cx, rad, rad);
    }

    g.setColor(Color.BLACK);
    g.drawLine(x + size / 2, y, x + size / 2, y + size);
    g.drawLine(x, y + size / 2, x + size, y + size / 2);
  }
}
