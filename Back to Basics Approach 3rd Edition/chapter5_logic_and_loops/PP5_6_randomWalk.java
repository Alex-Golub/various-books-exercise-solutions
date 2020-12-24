package chapter5_logic_and_loops;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * 6. Write a program that draws a graphical display of a 2D
 * random walk using a DrawingPanel. Start a pixel walker in
 * the middle of the panel. On each step, choose to move
 * 1 pixel up, down, left, or right, then redraw the pixel. (You can
 * draw a single pixel by drawing a rectangle of size 1 × 1.)
 *
 * @author Mr.Dr.Professor
 * @since 24-Dec-20 7:04 PM
 */
class PP5_6_randomWalk {
  static final int HEIGHT = 500;
  static final int WIDTH  = 1000;

  public static void main(String[] args) {
    DrawingPanel board = new DrawingPanel(WIDTH, HEIGHT);
    Graphics     g     = board.getGraphics();

    int    totalSteps = 0;
    int    x          = WIDTH / 2;
    int    y          = HEIGHT / 2;
    double rnd;

    while (x > 0 && x < WIDTH && y > 0 && y < HEIGHT) {
      rnd = Math.random();
      totalSteps++;

      if (rnd < 0.25) x -= 5;      // East
      else if (rnd < 0.50) y += 5; // South
      else if (rnd < 0.75) y -= 5; // North
      else x += 5;                 // West

      g.fillRect(x, y, 5, 5);
      board.sleep(1);
    }

    System.out.println("Total steps to reach bounds is " + totalSteps);
  }

}
