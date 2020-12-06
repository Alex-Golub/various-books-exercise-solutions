package chapter3g_graphics;

import java.awt.*;

/**
 * @author Mr.Dr.Professor
 * @since 30-Nov-20 3:21 PM
 */
class DrawStringMessage1 {
  public static void main(String[] args) throws InterruptedException {
    DrawingPanel canvas = new DrawingPanel(800, 400);
    Graphics     brush  = canvas.getGraphics();

    brush.setFont(new Font("Monospaced", Font.BOLD, 24));
    for (int i = 0; i < 20; i++) {
      brush.drawString("Cool right?", i * 5, i * 20 + 10);
    }
  }
}
