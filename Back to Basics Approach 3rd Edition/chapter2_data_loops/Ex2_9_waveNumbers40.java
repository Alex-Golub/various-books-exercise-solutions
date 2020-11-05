package chapter2_data_loops;

/**
 * 9. Write nested for loops to produce the following output,
 * with each line 40 characters wide:
 * ----------------------------------------
 * _-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
 * 1122334455667788990011223344556677889900
 * ----------------------------------------
 *
 * Created by ag on 30-Oct-20 2:17 PM
 */
class Ex2_9_waveNumbers40 {
  public static void main(String[] args) {
    final int LENGTH = 60;

    // Solid line
    for (int i = 0; i < LENGTH; i++) {
      System.out.print("-");
    }

    System.out.println();

    // Waves
    for (int i = 0; i < LENGTH / 4; i++) {
      System.out.print("_-^-");
    }

    System.out.println();

    // Numbers
    for (int i = 1; i <= LENGTH / 2; i++) {
      System.out.print(i % 10 + "" + i % 10);
    }

    System.out.println();

    // Solid line
    for (int i = 0; i < LENGTH; i++) {
      System.out.print("-");
    }
  }
}
