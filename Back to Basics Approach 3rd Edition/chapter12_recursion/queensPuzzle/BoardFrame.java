package chapter12_recursion.queensPuzzle;// This is a variation of the 8 queens board class that provides an animation
// of the recursive backtracking.

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class BoardFrame extends Board {
  private JButton[][] myButtons;
  private int myDelay;
  
  public BoardFrame(int size) {
    super(size);
    JFrame f = new JFrame();
    f.setSize(60 * size + 50, 60 * size + 80);
    f.setTitle("Eight Queens Animation");
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    Container contentPane = f.getContentPane();
    
    // initialize delay and add slider to control it at bottom
    final int maxPause = 1000; // milliseconds
    final JSlider slider = new JSlider(0, maxPause - 20);
    myDelay = slider.getValue();
    slider.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        myDelay = maxPause - slider.getValue();
      }
    });
    JPanel p = new JPanel();
    p.add(new JLabel("slow"));
    p.add(slider);
    p.add(new JLabel("fast"));
    contentPane.add(p, "South");
    
    // add buttons in the middle for the chess squares
    p = new JPanel(new GridLayout(size, size, 1, 1));
    contentPane.add(p, "Center");
    p.setBackground(Color.black);
    myButtons = new JButton[size][size];
    Font f24 = new Font("Serif", Font.BOLD, 24);
    for (int i = 0; i < size; i++)
      for (int j = 0; j < size; j++) {
        JButton b = new JButton();
        b.setFont(f24);
        p.add(b);
        myButtons[i][j] = b;
      }
    
    // bring it on...
    f.setVisible(true);
    f.toFront();
  }
  
  public void place(int row, int col) {
    super.place(row, col);
    myButtons[row - 1][col - 1].setText("Q");
    pause();
  }
  
  public boolean safe(int row, int col) {
    myButtons[row - 1][col - 1].setText("?");
    pause();
    myButtons[row - 1][col - 1].setText("");
    return super.safe(row, col);
  }
  
  public void remove(int row, int col) {
    super.remove(row, col);
    myButtons[row - 1][col - 1].setText("No");
    pause();
    myButtons[row - 1][col - 1].setText("");
  }
  
  private void pause() {
    try {
      Thread.sleep(myDelay);
    } catch (Exception e) {
      throw new InternalError();
    }
  }
}
