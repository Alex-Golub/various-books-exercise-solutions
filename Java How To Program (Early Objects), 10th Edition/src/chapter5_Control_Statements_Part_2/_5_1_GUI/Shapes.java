package chapter5_Control_Statements_Part_2._5_1_GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ag on 09-Jul-20 4:21 PM
 */
class Shapes extends JPanel {
  private int choice;

  public Shapes(int userChoice) {
    choice = userChoice;
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    int r = 10;
    int dim = 20;

    for (int i = 1; i < 30; i++) {
      switch (choice) {
        case 1:
          g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
          break;
        case 2:
          g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
          break;
        case 3:
          g.drawOval(350 - i * r, 350 - i * r, dim * i, dim * i);
          break;
      }
    }
  }
}
