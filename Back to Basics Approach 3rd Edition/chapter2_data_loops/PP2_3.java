package chapter2_data_loops;

/**
 * 3. Write a program that produces the
 * following output using nested for loops:
 *
 * Created by ag on 04-Nov-20 3:01 PM
 */
 // +---------+
 // |    *    |
 // |   /*\   |
 // |  //*\\  |
 // | ///*\\\ |
 // | \\\*/// |
 // |  \\*//  |
 // |   \*/   |
 // |    *    |
 // +---------+
 // | \\\*/// |
 // |  \\*//  |
 // |   \*/   |
 // |    *    |
 // |    *    |
 // |   /*\   |
 // |  //*\\  |
 // | ///*\\\ |
 // +---------+

class PP2_3 {
  public static void main(String[] args) {
    printLine();
    printTent();
    printInvertedTent();
    printLine();
    printInvertedTent();
    printTent();
    printLine();
  }

  public static void printLine() {
    System.out.print("+");
    for (int i = 0; i < 9; i++)
      System.out.print("-");
    System.out.println("+");
  }

  public static void printInvertedTent() {
    for (int i = 0; i < 4; i++) {
      System.out.print("|");
      for (int j = 0; j < i + 1; j++)
        System.out.print(" ");
      for (int j = 0; j < -i + 3; j++)
        System.out.print("\\");

      System.out.print("*");

      for (int j = 0; j < -i + 3; j++)
        System.out.print("/");
      for (int j = 0; j < i + 1; j++)
        System.out.print(" ");
      System.out.println("|");
    }
  }

  public static void printTent() {
    for (int i = 0; i < 4; i++) {
      System.out.print("|");
      for (int j = 0; j < -i + 4; j++)
        System.out.print(" ");
      for (int j = 0; j < i; j++)
        System.out.print("/");

      System.out.print("*");

      for (int j = 0; j < i; j++)
        System.out.print("\\");
      for (int j = 0; j < -i + 4; j++)
        System.out.print(" ");
      System.out.println("|");
    }
  }
}
