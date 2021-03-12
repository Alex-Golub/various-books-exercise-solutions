package CodeStepByStep_java.DrawingPanel;

import chapter3g_graphics.DrawingPanel;

import java.awt.*;

/**
 * https://www.codestepbystep.com/problem/view/java/drawingpanel/zoomIn
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 11:57 PM
 */
/*public*/ class zoomIn {
  public static void zoomIn(DrawingPanel panel) {
    Color[][] pixels = panel.getPixels();
    int n = pixels.length;
    Color[][] zoomed = new Color[2 * n][2 * n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        Color px = pixels[i][j];

        zoomed[2 * i][2 * j] = px;
        zoomed[2 * i][2 * j + 1] = px;
        zoomed[2 * i + 1][2 * j] = px;
        zoomed[2 * i + 1][2 * j + 1] = px;
      }
    }

    panel.setPixels(zoomed);
  }
}
