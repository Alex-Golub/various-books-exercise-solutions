package chapter5_logic_and_loops;

/**
 * 9. Write a method called printFactors that accepts an
 * integer as its parameter and uses a fencepost loop to print the
 * factors of that number, separated by the word "and".
 * For example, the factors of the number 24 should print as the following:
 * 1 and 2 and 3 and 4 and 6 and 8 and 12 and 24
 * You may assume that the parameter’s value is greater than 0,
 * or you may throw an exception if it is 0 or negative.
 * Your method should print nothing if the empty string ("") is passed.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 11:52 AM
 */
class Ex5_9_printFactors {
  public static void main(String[] args) {
    printFactors(1);
    printFactors(2);
    printFactors(24);
    printFactors(120);
    printFactors(0);
  }

  public static void printFactors(int n) {
    if (n <= 0)
      throw new IllegalArgumentException(n + " is zero or negative");

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < n; i++) {
      if (n % i == 0)
        sb.append(i).append(" and ");
    }
    sb.append(n);

    System.out.println(sb);
  }
}
