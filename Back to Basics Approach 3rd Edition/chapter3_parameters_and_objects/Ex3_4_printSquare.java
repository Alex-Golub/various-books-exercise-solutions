package chapter3_parameters_and_objects;

/**
 * 4. Write a method called printSquare that accepts a minimum and maximum
 * integer and prints a square of lines of increasing numbers.
 * The first line should start with the minimum, and each line that
 * follows should start with the next-higher number.
 * The sequence of numbers on a line wraps back to the minimum after it
 * hits the maximum.
 *
 * NOTE: You may assume the caller of the method will pass a min and a max
 * parameter such that min is less than or equal to max.
 * If the maximum passed is less than the minimum, the method produces no output.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 3:17 PM
 */
class Ex3_4_printSquare {
  public static void main(String[] args) {
    printSquare(1, 5);
    System.out.println("---------");
    printSquare(3, 9);
    System.out.println("---------");
    printSquare(0, 3);
    System.out.println("---------");
    printSquare(5, 5);
    System.out.println("---------");
    printSquare(5, 4);
  }

  // Each line prints a different permutation of this sequence.
  public static void printSquare(int min, int max) {
    for (int i = min; i <= max; i++) {
      for (int j = i; j <= max; j++) System.out.print(j);
      for (int j = min; j < i; j++)  System.out.print(j);

      System.out.println();
    }
  }
}
