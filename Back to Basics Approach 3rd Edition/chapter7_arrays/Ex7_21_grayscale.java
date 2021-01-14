package chapter7_arrays;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * 21. Write a method grayscale that converts a color image into a
 * black-and-white image.
 * This is done by averaging the red, green, and blue components of each pixel.
 *
 * @author Mr.Dr.Professor
 * @since 13-Jan-21 8:37 PM
 */
class Ex7_21_grayscale {
  public static void main(String[] args) {
    DrawingPanel image = new DrawingPanel("smile.jpg");
    grayscale(image);
  }

  public static void grayscale(DrawingPanel image) {
    Color[][] pixels = image.getPixels();

    for (int i = 0; i < pixels.length; i++) {
      for (int j = 0; j < pixels[i].length; j++) {
        Color px  = pixels[i][j];
        int   avg = (px.getRed() + px.getGreen() + px.getBlue()) / 3;
        pixels[i][j] = new Color(avg, avg, avg);
      }
    }

    image.setPixels(pixels);
  }
}
