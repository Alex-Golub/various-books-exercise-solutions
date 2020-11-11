package chapter2_objects;

import javax.swing.*;

/**
 * •• Graphics E2.19, •• Graphics E2.20
 * Write a graphics program that draws two squares,
 * both with the same center. Provide a class
 * TwoSquareViewer and a class TwoSquareComponent.
 *
 * Created by ag on 08-Nov-20 4:29 PM
 */
class Ex2_19_TwoSquareViewer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();

    frame.setTitle("•• Graphics E2.19");
    frame.setSize(600, 600);
    frame.setVisible(true);

    frame.add(new Ex2_19_TwoSquareComponent());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
