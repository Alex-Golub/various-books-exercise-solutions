package chapter2_data_loops;

/**
 * 11. Modify your code from the previous exercise so that it could easily
 * be modified to display a different range of
 * numbers (instead of 1234567890) and a different number of repetitions of
 * those numbers (instead of 60 total characters), with the vertical bars
 * still matching up correctly.
 *
 * Created by ag on 30-Oct-20 2:57 PM
 */
class Ex2_11_numbersOutputConstant {
  public static final int RANGE       = 6;
  public static final int REPETITIONS = 10;

  public static void main(String[] args) {

    for (int i = 1; i <= REPETITIONS; i++) {
      for (int j = 1; j < RANGE; j++) {
        System.out.print(" ");
      }
      System.out.print("|");
    }

    System.out.println();

    for (int i = 1; i <= REPETITIONS * RANGE; i++) {
      System.out.print(i % RANGE);
    }
  }
}
