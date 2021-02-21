package CodeStepByStep_java.console_output;

/**
 * Write a method named numberSquare that accepts two integer parameters,
 * a min and a max, and prints the numbers in the range from min to max
 * inclusive in a square pattern.
 * Each line of the square consists of a wrapping sequence of integers
 * increasing from min and max.
 * The first line begins with min, the second line begins with min + 1, and so on.
 * When the sequence in any line reaches max, it wraps around back to min.
 * You may assume that min is less than or equal to max.
 * For example, the call of numberSquare(1, 5); should print:
 *
 * 12345
 * 23451
 * 34512
 * 45123
 * 51234
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 9:15 PM
 */
/*public*/ class numberSquare {
  public static void main(String[] args) {
    numberSquare(1, 5);
  }

  public static void numberSquare(int min, int max) {
    for (int i = min; i <= max; i++) {
      for (int j = i; j <= max; j++)
        System.out.print(j);
      for (int j = min; j < i; j++)
        System.out.print(j);
      System.out.println();
    }
  }
}
