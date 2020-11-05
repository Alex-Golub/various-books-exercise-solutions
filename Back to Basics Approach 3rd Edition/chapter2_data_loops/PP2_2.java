package chapter2_data_loops;

/**
 * 2. Write a program that produces the following output using nested for loops:
 *
 * +------+
 * |  ∧∧  |
 * | ∧  ∧ |
 * |∧    ∧|
 * |  ∧∧  |
 * | ∧  ∧ |
 * |∧    ∧|
 * +------+
 * |v    v|
 * | v  v |
 * |  vv  |
 * |v    v|
 * | v  v |
 * |  vv  |
 * +------+
 *
 * Created by ag on 04-Nov-20 2:02 PM
 */
class PP2_2 {
  public static final int WIDTH = 6;

  public static void main(String[] args) {
    printLine();
    printV(true);
    printV(true);
    printLine();
    printV(false);
    printV(false);
    printLine();
  }

  public static void printLine() {
    System.out.print("+");
    for (int i = 0; i < WIDTH; i++)
      System.out.print("-");
    System.out.print("+\n");
  }

  public static void printV(boolean inverted) {
    if (!inverted) {
      for (int i = 0; i < 3; i++) {
        System.out.print("|");
        for (int j = 0; j < i; j++)
          System.out.print(" ");
        System.out.print("v");
        for (int j = 0; j < -2 * i + 4; j++)
          System.out.print(" ");
        System.out.print("v");
        for (int j = 0; j < i; j++)
          System.out.print(" ");
        System.out.print("|\n");
      }
    } else {
      for (int i = 2; i >= 0; i--) {
        System.out.print("|");
        for (int j = 0; j < i; j++)
          System.out.print(" ");
        System.out.print("^");
        for (int j = 0; j < -2 * i + 4; j++)
          System.out.print(" ");
        System.out.print("^");
        for (int j = 0; j < i; j++)
          System.out.print(" ");
        System.out.print("|\n");
      }
    }

  }

}
