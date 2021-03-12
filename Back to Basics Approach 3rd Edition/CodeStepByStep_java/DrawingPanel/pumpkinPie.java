package CodeStepByStep_java.DrawingPanel;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * https://www.codestepbystep.com/problem/view/java/drawingpanel/pumpkinPie
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 11:43 PM
 */
/*public*/ class pumpkinPie {
  public static void main(String[] args) {
    pumpkinPie();
  }
  public static void pumpkinPie() {
    int width = 300, height = 200;
    DrawingPanel panel = new DrawingPanel(width, height);
    Graphics g = panel.getGraphics();

    int radius = 50;
    int diameter = 2 * radius;
    g.setColor(new Color(255, 128, 0));
    g.fillOval(width / 2 - radius, radius, diameter, diameter);

    g.setColor(Color.BLACK);
    g.drawLine(diameter + radius, radius, diameter + radius, diameter + radius);
    g.drawLine(diameter, diameter, 2 * diameter, diameter);

    g.drawOval(diameter, radius, diameter, diameter);
  }
}
