package CodeStepByStep_java.DrawingPanel;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * https://www.codestepbystep.com/problem/view/java/drawingpanel/circleLoops
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 11:18 PM
 */
/*public*/ class circleLoops {
  public static void main(String[] args) {
    circleLoops();
  }

  public static void circleLoops() {
    DrawingPanel panel = new DrawingPanel(250, 250);
    Graphics g = panel.getGraphics();

    g.drawRect(10, 5, 230, 230);

    for (int i = 0; i < 10; i++) {
      g.setColor(Color.GREEN);
      g.fillOval(20 * i + 10, 20 * i + 5, 50, 50);
      g.setColor(Color.BLACK);
      g.drawOval(20 * i + 10 , 20 * i + 5, 50, 50);
    }
  }
}
