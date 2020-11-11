package chapter2_objects;

import javax.swing.*;

/**
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 4:22 PM
 */
class PP2_14_FaceViewer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(500, 500);
    frame.setTitle("•• Graphics P2.14");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(new PP2_14_FaceComponent());

    frame.setVisible(true);
  }
}
