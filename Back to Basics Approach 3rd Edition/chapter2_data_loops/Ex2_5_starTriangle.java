package chapter2_data_loops;

/**
 * 5. Write for loops to produce the following output:
 *
 * *
 * **
 * ***
 * ****
 * *****
 *
 * Created by ag on 30-Oct-20 2:02 PM
 */
class Ex2_5_starTriangle {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
