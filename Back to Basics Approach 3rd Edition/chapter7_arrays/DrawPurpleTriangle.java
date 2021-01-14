package chapter7_arrays;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 2:04 PM
 */
class DrawPurpleTriangle {
  public static void main(String[] args) {
    DrawingPanel panel  = new DrawingPanel(300, 200);
    Color[][]    pixels = panel.getPixels();
    for (int row = 50; row <= 150; row++)
      for (int col = 50; col <= row; col++)
        pixels[row][col] = Color.MAGENTA;
    panel.setPixels(pixels);
  }
}
