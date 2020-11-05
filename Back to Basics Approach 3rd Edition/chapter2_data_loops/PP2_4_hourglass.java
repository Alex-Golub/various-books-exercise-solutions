package chapter2_data_loops;

/**
 * 4. Write a program that produces the following hourglass
 * figure as its output using nested for loops:
 *
 * |""""""""""|
 *  \::::::::/
 *   \::::::/
 *    \::::/
 *     \::/
 *      ||
 *     /::\
 *    /::::\
 *   /::::::\
 *  /::::::::\
 * |""""""""""|
 *
 * Created by ag on 04-Nov-20 3:30 PM
 */
public class PP2_4_hourglass {
  public static final int HEIGHT = 3;

  public static void main(String[] args) {
    hourglass();
  }

  private static void hourglass() {
    line();
    invertedPyramid();
    separator();
    pyramid();
    line();
  }

  private static void diamond() {
    line();
    pyramid();
    invertedPyramid();
    line();
  }

  private static void line() {
    System.out.print("|");
    for (int i = 0; i < 2 * HEIGHT + 2; i++)
      System.out.print("\"");
    System.out.println("|");
  }

  private static void separator() {
    for (int i = 0; i <= HEIGHT; i++)
      System.out.print(" ");
    System.out.println("||");
  }

  public static void invertedPyramid() {
    for (int i = 0; i < HEIGHT; i++) {
      for (int j = 0; j <= i; j++)
        System.out.print(" ");
      System.out.print("\\");
      for (int j = 0; j < -2 * i + 2 * HEIGHT; j++)
        System.out.print(":");
      System.out.println("/");
    }
  }

  public static void pyramid() {
    for (int i = 0; i < HEIGHT; i++) {
      for (int j = 0; j < HEIGHT - i; j++)
        System.out.print(" ");
      System.out.print("/");
      for (int j = 0; j < 2 * i + 2; j++)
        System.out.print(":");
      System.out.println("\\");
    }
  }
}
