package chapter2_objects;

import javax.swing.*;

/**
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 4:15 PM
 */
class PP2_13_ColorNameViewer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(300, 300);
    frame.setTitle("•• Graphics P2.13");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(new PP2_13_ColorNameComponent());

    frame.setVisible(true);
  }
}
