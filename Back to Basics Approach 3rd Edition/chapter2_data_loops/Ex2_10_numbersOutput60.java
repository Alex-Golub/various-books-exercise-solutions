package chapter2_data_loops;

/**
 * 10.  With this in mind, write nested for loops to produce the
 * following output, with each line 60 characters wide:
 *
 *          |         |         |         |         |         |
 * 123456789012345678901234567890123456789012345678901234567890
 *
 * Created by ag on 30-Oct-20 2:47 PM
 */
class Ex2_10_numbersOutput60 {
  public static void main(String[] args) {
    final int SEGMENT_LENGTH = 10;
    final int SEGMENTS = 6;

    for (int i = 1; i <= SEGMENTS; i++) {
      for (int j = 1; j < SEGMENT_LENGTH; j++) {
        System.out.print(" ");
      }
      System.out.print("|");
    }

    System.out.println();

    for (int i = 1; i <= SEGMENTS * SEGMENT_LENGTH; i++) {
      System.out.print(i % SEGMENT_LENGTH);
    }
  }
}
