package chapter2_data_loops;

/**
 * 8. Write nested for loops to produce the following output:
 *
 *     1
 *    22
 *   333
 *  4444
 * 55555
 *
 * Created by ag on 30-Oct-20 2:12 PM
 */
class Ex2_8_spacesAndNumbers {
  public static void main(String[] args) {
    final int HEIGHT = 5;
    for (int i = 1; i <= HEIGHT; i++) {
      for (int j = 1; j <= HEIGHT - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
