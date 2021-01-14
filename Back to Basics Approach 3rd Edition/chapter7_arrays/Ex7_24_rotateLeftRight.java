package chapter7_arrays;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * // FIXME: works only for square images
 *
 * 24. Write methods rotateLeft and rotateRight that rotate the
 * pixels of an image counter-clockwise or clockwise
 * by 90 degrees respectively.
 * You should not assume that the image is square in shape;
 * its width and height might be different.
 *
 * @author Mr.Dr.Professor
 * @since 13-Jan-21 9:59 PM
 */
class Ex7_24_rotateLeftRight {
  public static void main(String[] args) {
    DrawingPanel img = new DrawingPanel("smile.jpg");

    while (true) { // random rotation
      if (Math.random() < 0.5) {
        rotateLeft(img);
        System.out.println("rotateLeft");
      } else {
        rotateRight(img);
        System.out.println("rotateRight");
      }

      img.sleep(1000);
    }
  }

  // 1 2 3      3 6 9
  // 4 5 6  =>  2 5 8
  // 7 8 9      1 4 7
  public static void rotateLeft(DrawingPanel img) {
    Color[][] pixels = img.getPixels();
    int       n      = pixels.length;
    int       m      = pixels[0].length;
    Color[][] left   = new Color[n][m];

    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        left[m - j - 1][i] = pixels[i][j];

    img.setPixels(left);
  }

  // 1 2 3      7 4 1
  // 4 5 6  =>  8 5 2
  // 7 8 9      9 6 3
  public static void rotateRight(DrawingPanel img) {
    Color[][] pixels = img.getPixels();
    int       n      = pixels.length;
    int       m      = pixels[0].length;
    Color[][] right  = new Color[n][m];

    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        right[j][m - i - 1] = pixels[i][j];

    img.setPixels(right);
  }
}
