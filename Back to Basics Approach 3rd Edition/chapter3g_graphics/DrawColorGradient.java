package chapter3g_graphics;

import java.awt.*;

/**
 * @author Mr.Dr.Professor
 * @since 30-Nov-20 2:51 PM
 */
class DrawColorGradient {
  public static final int RECTS = 32;

  public static void main(String[] args) {
    int          size  = 256;
    DrawingPanel canvas = new DrawingPanel(size, size);
    canvas.setBackground(new Color(255, 128, 0));

    Graphics brush = canvas.getGraphics();

    for (int i = 0; i < RECTS; i++) {
      int shift = i * size / RECTS;
      brush.setColor(new Color(shift, shift, shift));
      brush.fillRect(shift, shift, 20, 20);
    }
  }
}
