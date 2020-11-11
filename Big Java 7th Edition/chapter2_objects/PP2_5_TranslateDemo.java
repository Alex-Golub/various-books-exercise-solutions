package chapter2_objects;

import javax.swing.*;
import java.awt.*;

/**
 * ••• Graphics P2.5
 * In this exercise, you will explore a simple way of
 * visualizing a Rectangle object.
 * The setBounds method of the JFrame class moves a
 * frame window to a given rectangle.
 *
 * @author Mr.Dr.Professor
 * @since 08-Nov-20 9:31 PM
 */
class PP2_5_TranslateDemo {
  public static void main(String[] args) throws InterruptedException {

    // Construct a frame and show it
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    Rectangle box = new Rectangle(500, 500, 200, 200);
    frame.setBounds(box);

    JOptionPane.showMessageDialog(frame, "Click OK to continue");

    int dx = 1, dy = 1;
    while (true) {
      box.translate(dx, dy);
      frame.setBounds(box);
      Thread.sleep(5);
      dx = (int) (Math.random() * 20) - 10;
      dy = (int) (Math.random() * 20) - 10;
    }

//    box.translate(500, 500);
//    frame.setBounds(box);
  }
}
