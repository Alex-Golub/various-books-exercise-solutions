package chapter2_data_loops;

/**
 * 14. Modify the code so that it now produces the following output:
 * 999999999888888887777777666666555554444333221
 * 999999999888888887777777666666555554444333221
 * 999999999888888887777777666666555554444333221
 * 999999999888888887777777666666555554444333221
 *
 * Created by ag on 02-Nov-20 12:11 PM
 */
class Ex2_14_nestedNumbers3 {
  public static void main(String[] args) {
    final int LINES = 4;
    for (int i = 1; i <= LINES; i++) {
      for (int j = 9; j >= 0; j--) {
        for (int k = 1; k <= j; k++) {
          System.out.print(j);
        }
      }
      System.out.println();
    }
  }
}
