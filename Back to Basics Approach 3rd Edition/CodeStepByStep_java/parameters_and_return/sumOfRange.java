package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/sumOfRange
 *
 * Write a method named sumOfRange method that accepts two integer
 * parameters min and max and returns the sum of the integers from
 * min through max inclusive.
 * If min is greater than max, return 0.
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 10:30 PM
 */
/*public*/ class sumOfRange {
  public static void main(String[] args) {
    System.out.println(sumOfRange(3, 3));
  }

  public static int sumOfRange(int min, int max) {
    if (min > max) {
      return 0;
    }

    return max * (max + 1) / 2 - (min - 1) * min / 2;
  }
}
