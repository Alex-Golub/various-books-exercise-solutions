package chapter2_objects;

import javax.swing.*;

/**
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 3:33 PM
 */
class PP2_12_LineDistanceTesterViewer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(500, 500);
    frame.setTitle("•• Graphics P2.12");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(new PP2_12_LineDistanceTesterComponent());
    frame.setVisible(true);
  }
}
