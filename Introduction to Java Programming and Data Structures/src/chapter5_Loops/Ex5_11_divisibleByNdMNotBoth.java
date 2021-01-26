package chapter5_Loops;

/**
 * 5.11 (Find numbers divisible by 3 or 4, but not both)
 * Write a program that displays all the numbers from 100 to 200, ten per line,
 * that are divisible by 3 or 4, but not both.
 * Numbers are separated by exactly one space.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 7:16 PM
 */
class Ex5_11_divisibleByNdMNotBoth {
  public static void main(String[] args) {
    final int PER_LINE = 10;
    final int N        = 3;
    final int M        = 4;
    final int FROM     = 0;
    final int TO       = 100;

    // a b a ^ b
    // F F   F
    // F T   T
    // T F   T
    // T T   F
    for (int i = FROM, count = 0; i <= TO; i++) {
      if (i % M == 0 ^ i % N == 0) {
        System.out.printf("%3d", i);
        count++;

        if (count % PER_LINE == 0) {
          System.out.println();
        } else {
          System.out.print(" ");
        }
      }
    }
    System.out.println();
  }
}
