package chapter2_objects;

import javax.swing.*;

/**
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 4:50 PM
 */
class PP2_15_TrafficLightViewer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("Traffic Light");
    frame.setSize(500, 800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(new PP2_15_TrafficLightComponent());

    frame.setVisible(true);
  }
}
