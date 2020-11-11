package chapter2_objects;

import javax.swing.*;
import java.awt.*;

/**
 * •• E2.10 - E2.11
 * Write a program BrighterDemo that constructs a Color object with red, green,
 * and blue values of 50, 100, and 150.
 * Then apply the brighter method of the Color class
 * and print the red, green, and blue values of the resulting color.
 *
 * Created by ag on 08-Nov-20 1:58 PM
 */
class Ex2_10_BrighterDemo {
  public static void main(String[] args) throws InterruptedException {
    // Frame to display color
    JFrame frame = new JFrame();
    frame.setSize(500, 500);
    frame.setTitle("Brighter Demo");
    frame.setVisible(true);

    Color color = new Color(50, 100, 150);
    frame.getContentPane().setBackground(color);
    System.out.printf("Color: r = %d, g = %d, b = %d\n",
            color.getRed(), color.getGreen(), color.getBlue());

    Thread.sleep(2000);
    color = color.brighter();
    System.out.printf("brighter: r = %d, g = %d, b = %d\n",
            color.getRed(), color.getGreen(), color.getBlue());
    frame.getContentPane().setBackground(color);

    Thread.sleep(2000);
    frame.getContentPane().setBackground(color.brighter());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}
