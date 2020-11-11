package chapter2_objects;

import javax.swing.*;
import java.awt.*;

/**
 * •• Graphics P2.13
 * Write a graphics program that draws 12 strings,
 * one each for the 12 standard colors
 * (except Color.WHITE), each in its own color.
 *
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 4:11 PM
 */
class PP2_13_ColorNameComponent extends JComponent {
  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    int x    = 20;
    int y    = 20;
    int step = 20;

    g2.setFont(new Font("David", 1, 22));

    g2.setColor(Color.BLACK);
    g2.drawString("Graphics P2.13", x, y);

    g2.setColor(Color.GREEN);
    g2.drawString("Graphics P2.13", x, y + step);

    g2.setColor(Color.PINK);
    g2.drawString("Graphics P2.13", x, y + 2 * step);

    g2.setColor(Color.BLUE);
    g2.drawString("Graphics P2.13", x, y + 3 * step);

    g2.setColor(Color.RED);
    g2.drawString("Graphics P2.13", x, y + 4 * step);

    g2.setColor(Color.ORANGE);
    g2.drawString("Graphics P2.13", x, y + 5 * step);

  }
}
