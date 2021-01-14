package chapter7_arrays;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * 22. Write a method transpose that accepts a DrawingPanel
 * as a parameter and inverts the image about both the x and
 * y axes.
 * You may assume that the image is square, that is,
 * that its width and height are equal.
 *
 * @author Mr.Dr.Professor
 * @since 13-Jan-21 9:06 PM
 */
class Ex7_22_transpose {
  public static void main(String[] args) {
    DrawingPanel img = new DrawingPanel("smile.jpg");
    while (true) {
      transpose(img);
      img.sleep(2000);
    }
  }

  public static void transpose(DrawingPanel img) {
    Color[][] pixels = img.getPixels();

    int n = pixels.length;
    for (int i = 0; i < n / 2; i++) {
      for (int j = 0; j < n; j++) {
        Color tmp = pixels[i][j];
        pixels[i][j] = pixels[n - i - 1][j];
        pixels[n - i - 1][j] = tmp;
      }
    }

    img.setPixels(pixels);
  }
}
