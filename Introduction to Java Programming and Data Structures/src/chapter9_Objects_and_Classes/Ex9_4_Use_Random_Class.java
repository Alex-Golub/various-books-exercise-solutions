package chapter9_Objects_and_Classes;

import java.util.Random;

/**
 * *9.4 (Use the Random class)
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 12:23
 */
/*public*/ class Ex9_4_Use_Random_Class {
  public static void main(String[] args) {
    final int PER_LINE = 10;
    Random random = new Random(1000);

    for (int i = 0; i < 50; i++) {
      System.out.printf("%3d", random.nextInt(100));

      if ((i + 1) % PER_LINE == 0) {
        System.out.println();
      } else {
        System.out.print(" ");
      }
    }
  }
}
