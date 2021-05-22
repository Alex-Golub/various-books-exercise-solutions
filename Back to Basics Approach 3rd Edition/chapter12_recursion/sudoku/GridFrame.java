package chapter12_recursion.sudoku;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

class GridFrame extends Grid {
  private JButton[][] myButtons;
  private int myDelay;
  private boolean started;
  
  public GridFrame(Scanner input) {
    super(input);
    JFrame f = new JFrame();
    f.setSize(60 * SIZE + 50, 60 * SIZE + 80);
    f.setTitle("Sudoku Solver");
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    Container contentPane = f.getContentPane();
    
    contentPane.add(makeButtonPanel(), BorderLayout.CENTER);
    contentPane.add(makeControlPanel(), BorderLayout.SOUTH);
    
    // bring it on...
    f.setVisible(true);
    f.toFront();
    started = false;
    while (!started)
      pause();
  }
  
  public JPanel makeControlPanel() {
    // initialize delay and add slider to control it at bottom
    final int maxPause = 1000; // milliseconds
    final JSlider slider = new JSlider(0, maxPause - 1);
    myDelay = slider.getValue();
    slider.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        myDelay = maxPause - slider.getValue();
      }
    });
    JPanel p = new JPanel();
    JButton start = new JButton("start");
    start.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        started = true;
      }
    });
    p.add(start);
    p.add(new JLabel("slow"));
    p.add(slider);
    p.add(new JLabel("fast"));
    return p;
  }
  
  public JPanel makeButtonPanel() {
    // add buttons in the middle for the chess squares
    JPanel p = new JPanel(new GridLayout(3, 3, 10, 10));
    p.setBackground(Color.black);
    myButtons = new JButton[SIZE][SIZE];
    Font f24 = new Font("Serif", Font.BOLD, 24);
    for (int blockI = 0; blockI < 3; blockI++)
      for (int blockJ = 0; blockJ < 3; blockJ++) {
        JPanel block = new JPanel(new GridLayout(3, 3, 2, 2));
        block.setBackground(Color.BLUE);
        p.add(block);
        for (int i = 0; i < 3; i++)
          for (int j = 0; j < 3; j++) {
            int row = i + blockI * 3;
            int col = j + blockJ * 3;
            JButton b = new JButton();
            block.add(b);
            b.setFont(f24);
            b.setOpaque(true);
            b.setBorderPainted(false);
            int n = get(row, col);
            if (n != 0)
              b.setText("" + n);
            else
              b.setBackground(Color.WHITE);
            myButtons[row][col] = b;
          }
      }
    return p;
  }
  
  public void place(int cellNumber, int n) {
    super.place(cellNumber, n);
    myButtons[cellNumber / SIZE][cellNumber % SIZE].setText("" + n);
    pause();
  }
  
  public void remove(int cellNumber) {
    super.remove(cellNumber);
    myButtons[cellNumber / SIZE][cellNumber % SIZE].setText("");
    pause();
  }
  
  private void pause() {
    try {
      Thread.sleep(myDelay);
    } catch (Exception e) {
      throw new InternalError();
    }
  }
}
