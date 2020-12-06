package chapter3g_graphics;

import java.awt.*;

/**
 * @author Mr.Dr.Professor
 * @since 30-Nov-20 6:31 PM
 */
class Pyramids1 {
  public static final int SIZE = 400;

  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(1200, 900);
    Graphics     g     = panel.getGraphics();

    drawPyramid(g, Color.WHITE, 0, 0, 10);
    drawPyramid(g, Color.RED, 200, 420, 5);
    drawPyramid(g, Color.BLUE, 660, 250, 20);
  }

  public static void drawPyramid(Graphics g, Color c, int x, int y, int stairs) {
    // draws the border rectangle
    g.drawRect(x, y, SIZE, SIZE);

    // draws the stairs of the pyramid
    for (int i = 0; i < stairs; i++) {
      int stairHeight = SIZE / stairs;
      int stairWidth  = stairHeight * (i + 1);
      int stairX      = x + (SIZE - stairWidth) / 2;
      int stairY      = y + stairHeight * i;

      g.setColor(c);
      g.fillRect(stairX, stairY, stairWidth, stairHeight);
      g.setColor(Color.BLACK);
      g.drawRect(stairX, stairY, stairWidth, stairHeight);
    }
  }
}
