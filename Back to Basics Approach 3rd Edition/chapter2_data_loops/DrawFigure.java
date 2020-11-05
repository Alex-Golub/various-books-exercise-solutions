package chapter2_data_loops;

/**
 * Created by ag on 30-Oct-20 12:54 PM
 */
public class DrawFigure {
  public static final int SUB_HEIGHT = 4;

  public static void main(String[] args) {
    drawLine();
    drawTop();
    drawBottom();
    drawLine();
    drawBottom();
    drawTop();
    drawLine();
  }

  // produces a solid line
  public static void drawLine() {
    System.out.print("+");
    for (int i = 1; i <= (2 * SUB_HEIGHT); i++) {
      System.out.print("–");
    }
    System.out.println("+");
  }

  // produces the top half of the hourglass figure
  public static void drawTop() {
    for (int line = 1; line <= SUB_HEIGHT; line++) {
      System.out.print("|");
      for (int i = 1; i <= (line - 1); i++) {
        System.out.print(" ");
      }
      System.out.print("\\");
      int dots = 2 * SUB_HEIGHT - 2 * line;
      for (int i = 1; i <= dots; i++) {
        System.out.print(".");
      }
      System.out.print("/");
      for (int i = 1; i <= (line - 1); i++) {
        System.out.print(" ");
      }
      System.out.println("|");
    }
  }

  public static void drawBottom() {
    for (int line = 1; line <= SUB_HEIGHT; line++) {
      System.out.print("|");
      for (int i = 1; i <= (SUB_HEIGHT - line); i++) {
        System.out.print(" ");
      }
      System.out.print("/");
      for (int i = 1; i <= 2 * (line - 1); i++) {
        System.out.print(".");
      }
      System.out.print("\\");
      for (int i = 1; i <= (SUB_HEIGHT - line); i++) {
        System.out.print(" ");
      }
      System.out.println("|");
    }
  }
}
