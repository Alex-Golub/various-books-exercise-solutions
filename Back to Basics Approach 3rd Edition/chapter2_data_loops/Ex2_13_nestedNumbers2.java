package chapter2_data_loops;

/**
 * 13. Modify the code so that it now produces the following output:
 * 99999888887777766666555554444433333222221111100000
 * 99999888887777766666555554444433333222221111100000
 * 99999888887777766666555554444433333222221111100000
 * 99999888887777766666555554444433333222221111100000
 * 99999888887777766666555554444433333222221111100000
 * <p>
 * Created by ag on 02-Nov-20 12:07 PM
 */
class Ex2_13_nestedNumbers2 {
  public static void main(String[] args) {
    final int LINES  = 5;
    final int REPEAT = 5;
    for (int i = 1; i <= LINES; i++) {
      for (int j = 9; j >= 0; j--) {
        for (int k = 1; k <= REPEAT; k++) {
          System.out.print(j);
        }
      }
      System.out.println();
    }
  }
}
