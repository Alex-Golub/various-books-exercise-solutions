package chapter2_data_loops;

/**
 * 18. Write a pseudocode algorithm that will produce the
 * following figure as output:
 * +===+===+
 * |   |   |
 * |   |   |
 * |   |   |
 * +===+===+
 * |   |   |
 * |   |   |
 * |   |   |
 * +===+===+
 *
 * Created by ag on 02-Nov-20 1:40 PM
 */
class Ex2_18_pseudocodeWindow {
  public static void main(String[] args) {
    printLine();
    for (int i = 0; i < 3; i++)
      printSpaces();
    printLine();
    for (int i = 0; i < 3; i++)
      printSpaces();
    printLine();
  }

  private static void printSpaces() {
    System.out.println("|   |   |");
  }

  public static void printLine() {
    System.out.println("+===+===+");
  }
}
