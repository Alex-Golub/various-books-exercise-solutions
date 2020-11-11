package chapter2_objects;

import javax.swing.*;

/**
 * •• Graphics E2.21
 * Write a graphics program that draws
 * your name in red, contained inside a blue
 * rectangle.
 *
 * Created by ag on 08-Nov-20 5:17 PM
 */
class Ex2_21_NameViewer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(600, 600);
    frame.setTitle("•• Graphics E2.21");
    frame.add(new Ex2_21_NameComponent());
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
