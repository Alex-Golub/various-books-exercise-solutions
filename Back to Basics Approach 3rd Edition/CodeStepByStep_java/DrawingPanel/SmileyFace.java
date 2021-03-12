package CodeStepByStep_java.DrawingPanel;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * https://www.codestepbystep.com/problem/view/java/drawingpanel/SmileyFace
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 11:14 PM
 */
/*public*/ class SmileyFace {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(320, 180);
    Graphics g = panel.getGraphics();

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
