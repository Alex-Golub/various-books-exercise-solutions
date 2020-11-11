package chapter2_objects;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * •• Graphics P2.12
 * Repeat Exercise ••• Testing P2.11, but now write a graphical
 * application that shows the line and the points.
 *
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 3:27 PM
 */
class PP2_12_LineDistanceTesterComponent extends JComponent {
  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    g2.setStroke(new BasicStroke(5));

    Point2D from = new Point2D.Double(100, 100);
    Point2D to   = new Point2D.Double(200, 200);

    Line2D line = new Line2D.Double(from, to);
    g2.draw(line);

    Ellipse2D p1 = new Ellipse2D.Double(100, 200, 10, 10);
    g2.setColor(Color.RED);
    g2.fill(p1);

    Ellipse2D p2 = new Ellipse2D.Double(150, 150, 10, 10);
    g2.setColor(Color.BLUE);
    g2.fill(p2);

    Ellipse2D p3 = new Ellipse2D.Double(250, 50, 10, 10);
    g2.setColor(Color.GREEN);
    g2.fill(p3);

    g2.setColor(Color.BLACK);
    double dp1 = line.ptSegDist(p1.getX(), p1.getY());
    g2.drawString("Distance: " + dp1, (int) p1.getX(), (int) p1.getY() + 20);

    double dp2 = line.ptSegDist(p2.getX(), p2.getY());
    g2.drawString("Distance: " + dp2, (int) p2.getX(), (int) p2.getY() + 20);

    double dp3 = line.ptSegDist(p3.getX(), p3.getY());
    g2.drawString("Distance: " + dp3, (int) p3.getX(), (int) p3.getY() + 20);
  }
}
