package org.mrdrprof.solutions.chapter5_Loops;

/**
 * 5.10 (Find numbers divisible by 3 and 4)
 * Write a program that displays all the numbers
 * from 100 to 1,000, ten per line, that are divisible by 3 and 4.
 * Numbers are separated by exactly one space.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 6:43 PM
 */
class Ex5_10_divisibleByNdM {

  // number that are divisible by n and m
  // is the lcm(n, m)
  // lcm(n, m) = (a * b) / hcf(a, b)

  public static void main(String[] args) {
    final int PER_LINE = 10;
    final int N        = 3;
    final int M        = 4;
    final int FROM     = 100;
    final int TO       = 1000;

    // first lowest number that is multiplier of n * m
    int i = FROM;
    while (i <= TO) {
      if (i % (N * M) == 0)
        break;
      i++;
    }

    for (int count = 0; i <= TO; i += (N * M)) {
      System.out.print(i);
      count++;

      if (count % PER_LINE == 0) {
        System.out.println();
      } else {
        System.out.print(" ");
      }
    }

    System.out.println();
  }
}
