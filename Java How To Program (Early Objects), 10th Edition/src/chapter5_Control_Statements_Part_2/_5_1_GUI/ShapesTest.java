package chapter5_Control_Statements_Part_2._5_1_GUI;

import javax.swing.*;

/**
 * 5.1 Draw 12 concentric circles in the center of a JPanel (Fig. 5.29).
 * The innermost circle should have a radius of 10 pixels, and each successive circle should have
 * a radius 10 pixels larger than the previous one.
 * Begin by finding the center of the JPanel.
 * To get the upper-left corner of a circle, move up one radius and to the left one radius from the center.
 * The width and height of the bounding rectangle are both the same as the circle’s diameter (i.e., twice the radius).
 *
 * Created by ag on 09-Jul-20 7:50 PM
 */
class ShapesTest {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog(
            "Enter 1 to draw rectangles\n" +
            "Enter 2 to draw ovals\n" +
            "Enter 3 to draw concentric circles"
    );

    int choice = Integer.parseInt(input);

    Shapes panel = new Shapes(choice);

    JFrame application = new JFrame();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.add(panel);
    application.setSize(700, 700);
    application.setVisible(true);

  }
}
