package Toolkit;//OUT canvas.png

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 * A picture from an image file.
 */
public class Picture {
  private BufferedImage image;
  private String        source;
  private int           x;
  private int           y;


  /**
   * Constructs an empty picture.
   */
  public Picture() {
    image = null;
  }

  /**
   * Constructs a picture from a given file name or URL.
   *
   * @param source the filename or URL
   */
  public Picture(String source) {
    load(source);
  }

  /**
   * Loads a picture from a given file or URL.
   *
   * @param source the filename or URL
   */
  public void load(String source) {
    try {
      this.source = source;
      if (source.startsWith("http://")) {
        image = ImageIO.read(new URL(source).openStream());
      } else {
        image = ImageIO.read(new File(source));
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    Canvas.getInstance().show(this);
  }

  /**
   * Displays a file chooser for picking a file, loads the picture from the
   * file that the user selected, and pauses so that the user can see the
   * loaded picture.
   */
  public void pick() {
    JFileChooser chooser = new JFileChooser(".");
    chooser.setFileFilter(new FileFilter() {
      public String getDescription() {
        return "Image files";
      }

      public boolean accept(File f) {
        String name = f.getName();
        return Arrays.asList(ImageIO.getReaderFileSuffixes())
                .contains(name.substring(name.lastIndexOf(".") + 1));
      }
    });
    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
      load(chooser.getSelectedFile().getAbsolutePath());
    }
  }

  /**
   * Gets the width of this picture.
   *
   * @return the width
   */
  public int getWidth() {
    if (image == null) {
      return 0;
    } else {
      return image.getWidth();
    }
  }

  /**
   * Gets the height of this picture.
   *
   * @return the height
   */
  public int getHeight() {
    if (image == null) {
      return 0;
    } else {
      return image.getHeight();
    }
  }


  /**
   * Moves this picture by a given amount.
   *
   * @param dx the amount by which to move in x-direction
   * @param dy the amount by which to move in y-direction
   */
  public void move(int dx, int dy) {
    x += dx;
    y += dy;
    Canvas.getInstance().repaint();
  }

  public String toString() {
    return "Picture[source=" + source + ",x=" + x + ",y=" + y + "]";
  }

  /**
   * Gets the color of a pixel.
   *
   * @param x the column index (between 0 and getWidth() - 1)
   * @param y the row index (between 0 and getHeight() - 1)
   * @return the color of the pixel at position (x, y)
   */
  public Color getColorAt(int x, int y) {
    Raster     raster = image.getRaster();
    ColorModel model  = image.getColorModel();
    int        argb   = model.getRGB(raster.getDataElements(x, y, null));
    return new Color(argb, true);
  }

  /**
   * Sets the color of a pixel.
   *
   * @param x the column index (between 0 and getWidth() - 1)
   * @param y the row index (between 0 and getHeight() - 1)
   * @param c the color for the pixel at position (x, y)
   */
  public void setColorAt(int x, int y, Color c) {
    WritableRaster raster    = image.getRaster();
    ColorModel     model     = image.getColorModel();
    Object         colorData = model.getDataElements(c.getRGB(), null);
    raster.setDataElements(x, y, colorData);
    Canvas.getInstance().repaint();
  }

  /**
   * Scales this picture to a new size.
   *
   * @param newWidth  the new width of the picture
   * @param newHeight the new height of the picture
   */
  public void scale(int newWidth, int newHeight) {
    double dx = newWidth * 1.0 / image.getWidth();
    double dy = newHeight * 1.0 / image.getHeight();
    x = (int) (x * dx);
    y = (int) (y * dy);
    BufferedImageOp op = new AffineTransformOp(
            AffineTransform.getScaleInstance(dx, dy),
            AffineTransformOp.TYPE_BILINEAR);
    BufferedImage newImage
            = new BufferedImage(newWidth, newHeight,
            BufferedImage.TYPE_INT_ARGB);
    op.filter(image, newImage);
    image = newImage;
    Canvas.getInstance().repaint();
  }

  /**
   * Adds a black border to the image.
   *
   * @param width the border width
   */
  public void border(int width) {
    x -= 2 * width;
    y -= 2 * width;
    BufferedImageOp op = new AffineTransformOp(
            AffineTransform.getTranslateInstance(2 * width, 2 * width),
            AffineTransformOp.TYPE_BILINEAR);
    BufferedImage newImage
            = new BufferedImage(getWidth() + 4 * width, getHeight() + 4 * width,
            BufferedImage.TYPE_INT_ARGB);
    op.filter(image, newImage);
    image = newImage;

    for (int x = 0; x < width; x++) {
      for (int y = 0; y < image.getHeight(); y++) {
        setColorAt(x, y, Color.BLACK);
        setColorAt(image.getWidth() - 1 - x, y, Color.BLACK);
      }
    }
    for (int y = 0; y < width; y++) {
      for (int x = width; x < image.getWidth() - width; x++) {
        setColorAt(x, y, Color.BLACK);
        setColorAt(x, image.getHeight() - 1 - y, Color.BLACK);
      }
    }
  }

  private void paintShape(Graphics2D g2) {
    g2.drawImage(image, x, y, null);
  }

  static class Canvas {
    private static Canvas canvas = new Canvas();

    private List<Picture>   pictures  = new CopyOnWriteArrayList<Picture>();
    private JFrame          frame;
    private CanvasComponent component = new CanvasComponent();

    private static final int LOCATION_OFFSET = 120;
    private static final int MIN_SIZE        = 100;

    class CanvasComponent extends JComponent {
      public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        for (Picture s : pictures) {
          Graphics2D g2 = (Graphics2D) g.create();
          s.paintShape(g2);
          g2.dispose();
        }
      }

      public Dimension getPreferredSize() {
        int maxx = MIN_SIZE;
        int maxy = MIN_SIZE;
        for (Picture s : pictures) {
          maxx = (int) Math.max(maxx, (int) s.x + s.getWidth());
          maxy = (int) Math.max(maxy, (int) s.y + s.getHeight());
        }
        return new Dimension(maxx, maxy);
      }
    }

    private Canvas() {
      if (System.getProperty("com.horstmann.codecheck") == null) {
        frame = new JFrame();
        if (!System.getProperty("java.class.path").contains("bluej")) {
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        frame.add(component);
        frame.pack();
        frame.setLocation(LOCATION_OFFSET, LOCATION_OFFSET);
        frame.setVisible(true);
      } else {
        final String SAVEFILE      = "canvas.png";
        final Thread currentThread = Thread.currentThread();
        Thread watcherThread = new Thread() {
          public void run() {
            try {
              final int DELAY = 10;

              while (currentThread.getState() != State.TERMINATED) {
                Thread.sleep(DELAY);
              }
              saveToDisk(SAVEFILE);
            } catch (Exception ex) {
              ex.printStackTrace();
            }
          }
        };
        watcherThread.start();
      }
    }

    public static Canvas getInstance() {
      return canvas;
    }

    public void show(Picture s) {
      if (!pictures.contains(s)) {
        pictures.add(s);
      }
      repaint();
    }

    public void repaint() {
      if (frame == null) {
        return;
      }
      Dimension dim = component.getPreferredSize();
      if (dim.getWidth() > component.getWidth()
              || dim.getHeight() > component.getHeight()) {
        frame.pack();
      } else {
        frame.repaint();
      }
    }

    public void saveToDisk(String fileName) {
      try {
        Dimension     dim   = component.getPreferredSize();
        Rectangle     rect  = new Rectangle(0, 0, dim.width, dim.height);
        BufferedImage image = new BufferedImage(rect.width, rect.height, BufferedImage.TYPE_INT_RGB);
        Graphics2D    g     = (Graphics2D) image.getGraphics();
        g.setColor(Color.WHITE);
        g.fill(rect);
        g.setColor(Color.BLACK);
        component.paintComponent(g);
        String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
        ImageIO.write(image, extension, new File(fileName));
        g.dispose();
      } catch (Throwable e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        System.err.println("Was unable to save the image to " + fileName);
      }
    }
  }
}
