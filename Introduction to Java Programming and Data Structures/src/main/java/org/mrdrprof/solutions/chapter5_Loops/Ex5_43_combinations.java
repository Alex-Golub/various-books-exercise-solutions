package org.mrdrprof.solutions.chapter5_Loops;

/**
 * *5.43 (Math: combinations)
 * NOTES:
 * 1. From n numbers choose r where a b is same as b a
 * 2. nCr = n! / r!(n - r)!
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 7:16 PM
 */
class Ex5_43_combinations {
  public static void main(String[] args) {
    final int FROM              = 1;
    final int TO                = 7;
    int       totalCombinations = 0; // n! / r! * (n - r)!

    for (int i = FROM; i < TO; i++) {
      for (int j = i + 1; j <= TO; j++) {
        System.out.println(i + " " + j);
        totalCombinations++;
      }
      System.out.println();
    }

    System.out.println("The total number of all combinations is "
                       + totalCombinations);
  }
}
