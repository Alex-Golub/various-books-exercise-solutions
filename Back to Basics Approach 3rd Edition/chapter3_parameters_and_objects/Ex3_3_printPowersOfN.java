package chapter3_parameters_and_objects;

/**
 * 3. Write a method called printPowersOfN that accepts
 * a base and an exponent as arguments and prints each power of
 * the base from base^0 (1) up to that maximum power, inclusive.
 * NOTE: You may assume that the exponent passed to printPowersOfN
 * has a value of 0 or greater.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 3:13 PM
 */
class Ex3_3_printPowersOfN {
  public static void main(String[] args) {
    printPowersOfN(4, 3);
    printPowersOfN(5, 6);
    printPowersOfN(-2, 8);
  }

  public static void printPowersOfN(int base, int exp) {
    int res = 1;
    for (int i = 0; i <= exp; i++) {
      System.out.print(res + " ");
      res *= base;
    }
    System.out.println();
  }
}
