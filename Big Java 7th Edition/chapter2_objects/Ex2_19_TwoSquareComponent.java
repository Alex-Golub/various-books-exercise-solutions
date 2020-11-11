package chapter2_objects;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ag on 08-Nov-20 4:29 PM
 */
class Ex2_19_TwoSquareComponent extends JComponent {
  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    final int CX     = 300;
    final int CY     = 300;
    final int WIDTH  = 200;
    final int HEIGHT = 200;

    // Pen thickness
    g2.setStroke(new BasicStroke(10));

    int       leftUpX = CX - WIDTH / 2;
    int       leftUpY = CY - HEIGHT / 2;
    Rectangle box1    = new Rectangle(leftUpX, leftUpY, WIDTH, HEIGHT);

    leftUpX -= WIDTH / 2;
    leftUpY -= HEIGHT / 2;
    Rectangle box2 = new Rectangle(leftUpX, leftUpY, 2 * WIDTH, 2 * HEIGHT);

    // Order matters
    g2.setColor(new Color(205, 0, 205));
    g2.fill(box2);
    g2.draw(box2);

    g2.setColor(Color.PINK);
    g2.fill(box1);
    g2.draw(box1);

  }
}
