package chapter2_objects;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * •• Graphics P2.14
 * Write a program to plot the face.
 *
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 4:20 PM
 */
class PP2_14_FaceComponent extends JComponent {
  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    g2.setStroke(new BasicStroke(5));
    g2.setColor(Color.magenta);

    Ellipse2D head = new Ellipse2D.Double(125, 125, 250, 250);
    g2.draw(head);

    Ellipse2D leftEye = new Ellipse2D.Double(190, 200, 20, 20);
    g2.draw(leftEye);

    Ellipse2D rightEye = new Ellipse2D.Double(280, 200, 20, 20);
    g2.draw(rightEye);

//    Line2D mouth = new Line2D.Double(190, 300, 300, 300);
    Arc2D.Double mouth = new Arc2D.Double(190, 200, 110, 140, 0, -180, Arc2D.OPEN);
    g2.draw(mouth);
  }
}
