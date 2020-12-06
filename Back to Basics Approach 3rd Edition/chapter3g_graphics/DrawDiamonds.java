package chapter3g_graphics;

import java.awt.*;

/**
 * @author Mr.Dr.Professor
 * @since 30-Nov-20 4:47 PM
 */
class DrawDiamonds {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(360, 160);
    Graphics     g     = panel.getGraphics();

//    drawDiamond(g, 0, 0);
//    drawDiamond(g, 78, 22);
//    drawDiamond(g, 19, 81);

    drawManyDiamonds(g, 0, 0);
    g.setColor(Color.RED);
    drawManyDiamonds(g, 60, 100);
  }

  private static void drawManyDiamonds(Graphics g, int x, int y) {
    for (int i = 0; i < 5; i++)
      drawDiamond(g, x + 60 * i, y);
  }

  private static void drawDiamond(Graphics g, int x, int y) {
    g.drawRect(x, y, 50, 50);
    g.drawLine(x, y + 25, x + 25, y);
    g.drawLine(x + 25, y, x + 50, y + 25);
    g.drawLine(x + 50, y + 25, x + 25, y + 50);
    g.drawLine(x + 25, y + 50, x, y + 25);
  }
}
