package CodeStepByStep_java.DrawingPanel;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * https://www.codestepbystep.com/problem/view/java/drawingpanel/Circles
 *
 * TODO
 *
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 12:04 AM
 */
/*public*/ class Circles {
  public static void main(String[] args) {
    int width = 500, height = 350;
    DrawingPanel panel = new DrawingPanel(width, height);
    panel.setBackground(Color.CYAN);
    Graphics g = panel.getGraphics();

    drawCircle(g, 0, 0, 100, 10);
    drawCircle(g, 130, 25, 100, 10);
    drawCircle(g, 260, 0, 60, 6);
    drawCircle(g, 360, 50, 80, 4);

    gridOfFigures(g, 10, 170, 48, 4, 3, 3);
    gridOfFigures(g, 180, 200, 24, 2, 5, 5);
    gridOfFigures(g, 330, 170, 72, 9, 2, 2);
  }

  public static void gridOfFigures(Graphics g, int x, int y,
                                   int size, int n,
                                   int rows, int cols) {
//    g.setColor(Color.BLACK);
//    g.drawRect(x, y, size, size);

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        drawFigure(g, x + size * j, y, size, n);
      }

      y += size;
    }

    g.setColor(Color.BLACK);
    g.drawLine(x, y, x + rows, y + rows);
//    g.drawLine(x + size, y + size, x + size, y + size);
  }

  public static void drawCircle(Graphics g, int x, int y, int size, int circles) {
    int diameter = size / circles;
    for (int i = 0; i < circles; i++) {
      int cx = i * diameter / 2;
      int rad = size - diameter * i;

      g.setColor(Color.YELLOW);
      g.fillOval(x + cx, y + cx, rad, rad);
      g.setColor(Color.BLACK);
      g.drawOval(x + cx, y + cx, rad, rad);
    }
  }

  public static void drawFigure(Graphics g, int x, int y, int size, int n) {
    g.setColor(Color.GREEN);
    g.fillRect(x, y, size, size);

    int r = size / n;
    for (int i = 0; i < n; i++) {
      int cx  = i * r / 2;
      int rad = size - r * i;

      g.setColor(Color.YELLOW);
      g.fillOval(x + cx, y + cx, rad, rad);
      g.setColor(Color.BLACK);
      g.drawOval(x + cx, y + cx, rad, rad);
    }
  }
}
