package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/factorial
 *
 * Write a method named factorial that accepts an integer n as a
 * parameter and returns the factorial of n, or n!.
 * A factorial of an integer is defined as the product of all integers
 * from 1 through that integer inclusive.
 *
 * For example, the call of factorial(4) should return 1 * 2 * 3 * 4, or 24.
 * The factorial of 0 and 1 are defined to be 1.
 * You may assume that the value passed is non-negative
 * and that its factorial can fit in the range of type int.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 6:42 PM
 */
/*public*/ class factorial {
  public static void main(String[] args) {
    System.out.println(factorial(10));
  }
  public static int factorial(int n) {
    int res = 1;
    for (int i = 1; i <= n; i++) {
      res *= i;
    }

    return res;
  }
}
