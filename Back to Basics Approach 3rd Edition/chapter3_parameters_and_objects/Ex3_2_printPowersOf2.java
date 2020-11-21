package chapter3_parameters_and_objects;

/**
 * 2. Write a method called printPowersOf2 that accepts
 * a maximum number as an argument and prints each power of
 * 2 from 20 (1) up to that maximum power, inclusive.
 * You may assume that the value passed to printPowersOf2 is 0 or greater.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 2:56 PM
 */
class Ex3_2_printPowersOf2 {
  public static void main(String[] args) {
    printPowersOf2(0);
    printPowersOf2(3);
    printPowersOf2(10);
  }

  public static void printPowersOf2(int n) {
    int res = 1;
    for (int i = 0; i <= n; i++) {
      System.out.print(res + " ");
      res *= 2;
    }
    System.out.println();
  }
}
