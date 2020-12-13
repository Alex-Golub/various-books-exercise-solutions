package chapter4_conditionals;

/**
 * 6. Write a method called printRange that accepts two integers as arguments
 * and prints the sequence of numbers between the two arguments, separated by spaces.
 * Print an increasing sequence if the first argument is smaller than the second;
 * otherwise, print a decreasing sequence.
 * If the two numbers are the same, that number should be printed by itself.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 1:56 PM
 */
class Ex4_6_printRange {
  public static void main(String[] args) {
    printRange(2, 7);
    printRange(19, 11);
    printRange(5, 5);
  }

  public static void printRange(int a, int b) {
    int n = Math.abs(b - a);
    if (a < b)
      for (int i = 0; i <= n; i++)
        System.out.print(a + i + " ");
    else
      for (int i = 0; i <= n; i++)
        System.out.print(a - i + " ");
    System.out.println();
  }
}
