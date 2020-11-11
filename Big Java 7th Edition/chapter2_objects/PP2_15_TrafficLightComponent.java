package chapter2_objects;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * •• Graphics P2.15
 * Write a graphical program that draws a traffic light.
 *
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 4:49 PM
 */
class PP2_15_TrafficLightComponent extends JComponent {
  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    g2.setStroke(new BasicStroke(5));

    Rectangle frame = new Rectangle(125, 50, 200, 680);
    g2.fill(frame);

    Ellipse2D red = new Ellipse2D.Double(135, 80, 180, 180); // 180 + 80 + 40 = 300
    Ellipse2D yellow = new Ellipse2D.Double(135, 300, 180, 180); // 180 + 300 + 40 = 520
    Ellipse2D green = new Ellipse2D.Double(135, 520 , 180, 180);

    g2.setColor(Color.RED);
    g2.fill(red);

    g2.setColor(Color.YELLOW);
    g2.fill(yellow);

    g2.setColor(Color.GREEN);
    g2.fill(green);
  }
}
