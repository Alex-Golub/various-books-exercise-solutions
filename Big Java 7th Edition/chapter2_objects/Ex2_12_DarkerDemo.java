package chapter2_objects;

import javax.swing.*;
import java.awt.*;

/**
 * •• E2.12
 * Repeat Exercise •• E2.10, but apply the darker method of the
 * Color class twice to the object Color.RED.
 * Call your class DarkerDemo.
 *
 * Created by ag on 08-Nov-20 2:10 PM
 */
class Ex2_12_DarkerDemo {
  public static void main(String[] args) throws InterruptedException {
    JFrame frame = new JFrame();
    frame.setSize(500, 500);
    frame.setTitle("Darker Demo");
    frame.setVisible(true);

    frame.getContentPane().setBackground(Color.RED);
    Thread.sleep(2000);

    frame.getContentPane().setBackground(Color.RED.darker());
    Thread.sleep(2000);

    frame.getContentPane().setBackground(Color.RED.darker().darker());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
