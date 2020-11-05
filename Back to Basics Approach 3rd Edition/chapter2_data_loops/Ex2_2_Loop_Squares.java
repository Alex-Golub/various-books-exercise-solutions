package chapter2_data_loops;

/**
 * 2. Write a for loop that produces the following output:
 * 1 4 9 16 25 36 49 64 81 100
 * For added challenge, try to modify your code so that it does not
 * need to use the * multiplication operator.
 *
 * Created by ag on 30-Oct-20 1:16 PM
 */
public class Ex2_2_Loop_Squares {
  final static int UP_TO = 100;

  public static void main(String[] args) {
    int diff = 1;
    for (int i = 1; i <= UP_TO; i += diff) {
      diff += 2;
      System.out.print(i + " ");
    }
  }
}
