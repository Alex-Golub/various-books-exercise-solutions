package chapter2_data_loops;

/**
 * 12. Write nested for loops that produce the following output:
 * 000111222333444555666777888999
 * 000111222333444555666777888999
 * 000111222333444555666777888999
 * <p>
 * Created by ag on 02-Nov-20 11:47 AM
 */
class Ex2_12_nestedNumbers {
  public static void main(String[] args) {
    final int LINES     = 3;
    final int MAX_VALUE = 9;
    for (int i = 1; i <= LINES; i++) {
      for (int j = 0; j <= MAX_VALUE; j++) {
        for (int k = 1; k <= LINES; k++) {
          System.out.print(j);
        }
      }
      System.out.println();
    }
  }
}
