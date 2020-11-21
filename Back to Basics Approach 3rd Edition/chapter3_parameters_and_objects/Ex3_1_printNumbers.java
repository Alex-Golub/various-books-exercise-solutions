package chapter3_parameters_and_objects;

/**
 * 1. Write a method called printNumbers that accepts a maximum number as an
 * argument and prints each number from 1 up to that maximum,
 * inclusive, boxed by square brackets.
 * You may assume that the value passed to printNumbers is 1 or greater.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 2:49 PM
 */
class Ex3_1_printNumbers {
  public static void main(String[] args) {
    printNumbers(15);
  }

  public static void printNumbers(int n) {
    for (int i = 1; i < n; i++)
      System.out.print("[" + i + "] ");
    System.out.println("[" + n + "]");
  }
}
