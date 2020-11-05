package chapter2_data_loops;

/**
 * 1. Write a program that produces the following output using nested for loops:
 *
 * ****** //////////// ******
 * *****  //////////\\ *****
 * ****   ////////\\\\ ****
 * ***    //////\\\\\\ ***
 * **     ////\\\\\\\\ **
 * *      //\\\\\\\\\\ *
 *        \\\\\\\\\\\\
 *
 * Created by ag on 04-Nov-20 1:42 PM
 */
class PP2_1 {
  public static final int HEIGHT = 6;

  public static void main(String[] args) {
    for (int i = 0; i <= HEIGHT; i++) {
      repeatCharacter('*', -i + HEIGHT);
      repeatCharacter(' ', i + 1);
      repeatCharacter('/', -2 * i + HEIGHT * 2);
      repeatCharacter('\\', 2 * i);
      repeatCharacter(' ', i + 1);
      repeatCharacter('*', -i + HEIGHT);
      System.out.println();
    }
  }

  public static void repeatCharacter(char c, int n) {
    for (int i = 0; i < n; i++)
      System.out.print(c);
  }
}
