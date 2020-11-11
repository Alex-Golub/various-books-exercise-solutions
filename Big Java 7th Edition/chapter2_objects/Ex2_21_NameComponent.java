package chapter2_objects;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ag on 08-Nov-20 5:17 PM
 */
class Ex2_21_NameComponent extends JComponent {
  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    g2.setStroke(new BasicStroke(5));

    final int CX = 300;
    final int CY = 300;
    final int WIDTH = 300;
    final int HEIGHT = 300;

    Rectangle box = new Rectangle(CX / 2, CY / 2, WIDTH, HEIGHT);
    g2.setColor(Color.BLUE);
    g2.draw(box);

    g2.drawString("Mr.Dr.Professor", CX / 2 + 100, CY);
  }
}
