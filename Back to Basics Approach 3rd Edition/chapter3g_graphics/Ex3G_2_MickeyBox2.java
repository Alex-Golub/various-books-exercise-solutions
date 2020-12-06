package chapter3g_graphics;

import java.awt.*;

/**
 * 2. Modify your program from the previous exercise to draw the figure by
 * a method called drawFigure.
 * The method should accept three parameters: the Graphics g of the
 * DrawingPanel on which to draw, and a pair of (x, y) coordinates
 * specifying the location of the top-left corner of the figure.
 *
 * @author Mr.Dr.Professor
 * @since 05-Dec-20 7:02 PM
 */
class Ex3G_2_MickeyBox2 {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(450, 150);
    panel.setBackground(Color.YELLOW);

    Graphics g = panel.getGraphics();
    drawFigure(g, 50, 25);
    drawFigure(g, 250, 45);
  }

  public static void drawFigure(Graphics g, int x, int y) {
    final int OVAL_R      = 40;
    final int SPACE_APART = 80;
    final int HALF_OVAL_R = OVAL_R / 2;

    g.setColor(Color.BLUE);
    g.fillOval(x, y, OVAL_R, OVAL_R);
    g.fillOval(x + SPACE_APART, y, OVAL_R, OVAL_R);

    g.setColor(Color.RED);
    g.fillRect(x + HALF_OVAL_R, y + HALF_OVAL_R, SPACE_APART, SPACE_APART);

    g.setColor(Color.BLACK);
    g.drawLine(x + HALF_OVAL_R, y + HALF_OVAL_R + OVAL_R,
            x + HALF_OVAL_R + SPACE_APART, y + HALF_OVAL_R + OVAL_R);
  }
}
