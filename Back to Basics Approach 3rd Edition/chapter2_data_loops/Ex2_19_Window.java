package chapter2_data_loops;

/**
 * 19. Use your pseudocode from the previous exercise to write a
 * Java program called Window that produces the preceding
 * figure as output. Use nested for loops to print the repeated
 * parts of the figure. Once you get it to work, add a class
 * constant so that the size of the figure can be changed simply
 * by changing the constant’s value.
 * NOTE: the figure should grow larger and wider proportionally.
 * <p>
 * Created by ag on 02-Nov-20 1:46 PM
 */
class Ex2_19_Window {
  public static final int SIZE = 5;

  public static void main(String[] args) {
    printLine();
    for (int j = 0; j < SIZE; j++)
      printInner();
    printLine();
    for (int j = 0; j < SIZE; j++)
      printInner();
    printLine();

  }

  private static void printInner() {
    System.out.print("|");
    for (int i = 0; i < SIZE; i++)
      System.out.print(" ");
    System.out.print("|");
    for (int i = 0; i < SIZE; i++)
      System.out.print(" ");
    System.out.print("|");

    System.out.println();
  }

  public static void printLine() {
    System.out.print("+");
    for (int i = 0; i < SIZE; i++)
      System.out.print("=");
    System.out.print("+");
    for (int i = 0; i < SIZE; i++)
      System.out.print("=");
    System.out.print("+");

    System.out.println();
  }
}
