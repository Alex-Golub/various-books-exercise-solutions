package chapter2_data_loops;

/**
 * 6. Write for loops to produce the following output:
 *
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 666666
 * 7777777
 *
 * Created by ag on 30-Oct-20 2:05 PM
 */
class Ex2_6_numberTriangle {
  public static void main(String[] args) {
    for (int i = 1; i <= 7; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
