package chapter2_data_loops;

/**
 * 7. Write nested for loops to produce the following output:
 *
 *     1
 *    2
 *   3
 *  4
 * 5
 *
 * Created by ag on 30-Oct-20 2:06 PM
 */
class Ex2_7_spacedNumbers {
  public static void main(String[] args) {
    final int HEIGHT = 5;
    for (int i = 1; i <= HEIGHT; i++) {
      for (int j = 1; j <= HEIGHT - i; j++) {
        System.out.print(" ");
      }
      System.out.println(i);
    }
  }
}
