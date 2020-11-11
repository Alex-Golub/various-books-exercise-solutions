package chapter2_objects;

import javax.swing.*;
import java.awt.*;

/**
 * @author Mr.Dr.Professor
 * @since 11-Nov-20 5:16 PM
 */
public class PP2_16_FrameViewer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();

    frame.setSize(200 * 2, 200 * 2);
    JLabel label = new JLabel("Hello, Mr.Dr.Professor!");

    label.setOpaque(true);
    label.setBackground(new Color(152, 251, 152));
    frame.add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().add(new JLabel(new ImageIcon("queen-mary.png")));
    frame.setIconImage(new ImageIcon("star.png").getImage());
    frame.setBounds(300, 200, 400, 300);

    frame.setVisible(true);
  }
}
