package chapter7_arrays;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * 23. Write a method zoomIn that accepts a DrawingPanel as a parameter
 * and converts it into an image twice as large
 * in both dimensions. Each pixel from the original image becomes a
 * cluster of 4 pixels (2 rows and 2 columns) in the
 * new zoomed image.
 *
 * @author Mr.Dr.Professor
 * @since 13-Jan-21 9:37 PM
 */
class Ex7_23_zoomIn {
  public static void main(String[] args) {
    zoomIn(new DrawingPanel("smile.jpg"));
    new DrawingPanel("smile.jpg");
  }

  public static void zoomIn(DrawingPanel img) {
    Color[][] pixels = img.getPixels();
    int       n      = pixels.length;
    Color[][] zoomed = new Color[2 * n][2 * n];

    // for debugging
//    System.out.printf("%-14s%-14s%-14s%-14s%-14s%-14s\n",
//            "i", "j", "2 * i", "2 * j", "2 * j + 1", "2 * i + 1");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        Color px = pixels[i][j];

        zoomed[2 * i][2 * j] = px;
        zoomed[2 * i][2 * j + 1] = px;
        zoomed[2 * i + 1][2 * j] = px;
        zoomed[2 * i + 1][2 * j + 1] = px;

//        if (i % 1000 == 0) {
//          System.out.printf("%-14d%-14d%-14d%-14d%-14d%-14d\n",
//                  i, j, 2 * i, 2 * j, 2 * j + 1, 2 * i + 1);
//        }
      }
    }

    img.setPixels(zoomed);
  }
}
