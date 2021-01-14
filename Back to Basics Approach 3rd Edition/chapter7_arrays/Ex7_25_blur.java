package chapter7_arrays;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * 25. Write a method blur that makes an image look “blurry” using
 * the following specific algorithm.
 * Set each pixel to be the average of itself and the 8 pixels around it.
 * That is, for the pixel at position (x, y), set its RGB value to be the
 * average of the RGB values at positions (x - 1, y - 1) through
 * (x + 1, y + 1).
 *
 * @author Mr.Dr.Professor
 * @since 13-Jan-21 10:54 PM
 */
class Ex7_25_blur {
  public static void main(String[] args) {
    blur(new DrawingPanel("dino.jpg"));
  }

  public static void blur(DrawingPanel img) {
    Color[][] pixels = img.getPixels();
    int       n      = pixels.length;
    int       m      = pixels[0].length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        int rSum = pixels[i][j].getRed();
        int gSum = pixels[i][j].getGreen();
        int bSum = pixels[i][j].getBlue();

        int pxlAround = 1;

        // North-West
        if (i - 1 >= 0 && j - 1 >= 0) {
          Color px = pixels[i - 1][j - 1];
          rSum += px.getRed();
          gSum += px.getGreen();
          bSum += px.getBlue();
          pxlAround++;
        }

        // North
        if (i - 1 >= 0) {
          Color px = pixels[i - 1][j];
          rSum += px.getRed();
          gSum += px.getGreen();
          bSum += px.getBlue();
          pxlAround++;
        }

        // North-East
        if (i - 1 >= 0 && j + 1 < m) {
          Color px = pixels[i - 1][j + 1];
          rSum += px.getRed();
          gSum += px.getGreen();
          bSum += px.getBlue();
          pxlAround++;
        }

        // West
        if (j - 1 >= 0) {
          Color px = pixels[i][j - 1];
          rSum += px.getRed();
          gSum += px.getGreen();
          bSum += px.getBlue();
          pxlAround++;
        }

        // East
        if (j + 1 < m) {
          Color px = pixels[i][j + 1];
          rSum += px.getRed();
          gSum += px.getGreen();
          bSum += px.getBlue();
          pxlAround++;
        }

        // South-West
        if (i + 1 < n && j - 1 >= 0) {
          Color px = pixels[i + 1][j - 1];
          rSum += px.getRed();
          gSum += px.getGreen();
          bSum += px.getBlue();
          pxlAround++;
        }

        // South
        if (i + 1 < n) {
          Color px = pixels[i + 1][j];
          rSum += px.getRed();
          gSum += px.getGreen();
          bSum += px.getBlue();
          pxlAround++;
        }

        // South-East
        if (i + 1 < n && j + 1 < m) {
          Color px = pixels[i + 1][j + 1];
          rSum += px.getRed();
          gSum += px.getGreen();
          bSum += px.getBlue();
          pxlAround++;
        }

        int avg = (rSum + gSum + bSum) / (pxlAround * 3);

        pixels[i][j] = new Color(avg, avg, avg);
      }
    }

    img.setPixels(pixels);
  }
}
