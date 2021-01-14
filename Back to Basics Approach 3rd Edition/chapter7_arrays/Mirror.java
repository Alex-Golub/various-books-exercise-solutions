package chapter7_arrays;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 2:10 PM
 */
class Mirror {
  public static void main(String[] args) {
    DrawingPanel panel = new DrawingPanel(300, 200);
    Graphics     g     = panel.getGraphics();
    g.drawString("Mirroring example", 20, 50);
    g.fillOval(10, 100, 20, 70);

    mirror(panel);
//    negative(panel);
//    stretch(panel);
//    pixelMystery(panel);
  }

  public static void pixelMystery(DrawingPanel panel) {
    Color[][] pixels = panel.getPixels();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        int n = Math.min(row + col, 255);
        pixels[row][col] = new Color(n, n, n);
      }
    }
    panel.setPixels(pixels);
  }

  public static void toRedChannel(DrawingPanel panel) {
    Color[][] pixels = panel.getPixels();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        // your code goes here
        Color pixel = pixels[row][col];
        pixels[row][col] = new Color(pixel.getRed(), 0, 0);
      }
    }
    panel.setPixels(pixels);
  }

  private static void mirror(DrawingPanel panel) {
    Color[][] pixels = panel.getPixels();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length / 2; col++) {
        int   opposite = pixels[row].length - col - 1;
        Color pixel    = pixels[row][col];
        pixels[row][col] = pixels[row][opposite];
        pixels[row][opposite] = pixel;
      }
    }
    panel.setPixels(pixels);
  }

  private static void negative(DrawingPanel panel) {
    Color[][] pixels = panel.getPixels();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Color px = pixels[row][col];
        int   r  = 255 - px.getRed();
        int   g  = 255 - px.getGreen();
        int   b  = 255 - px.getBlue();

        pixels[row][col] = new Color(r, g, b);
      }
    }
    panel.setPixels(pixels);
  }

  private static void stretch(DrawingPanel panel) {
    Color[][] pixels    = panel.getPixels();
    Color[][] newPixels = new Color[pixels.length][2 * pixels[0].length];
    for (int row = 0; row < pixels.length; row++)
      for (int col = 0; col < 2 * pixels[0].length; col++)
        newPixels[row][col] = pixels[row][col / 2];

    panel.setPixels(newPixels);
  }
}
