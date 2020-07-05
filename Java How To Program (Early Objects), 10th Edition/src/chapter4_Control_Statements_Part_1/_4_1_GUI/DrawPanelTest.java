package chapter4_Control_Statements_Part_1._4_1_GUI;

import javax.swing.*;

/**
 * FIXME FIXME FIXME FIXME FIXME FIXME
 * Created by ag on 23-Jun-20 9:39 PM
 */
public class DrawPanelTest {
  public static void main(String[] args) {
    DrawPanel panel = new DrawPanel();

    // create a window with an object of class JFrame i.e. where to draw
    JFrame application = new JFrame();

    // application should terminate when the user closes the window.
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    application.add(panel);
    application.setSize(500, 500);
    application.setVisible(true);
  }
}
