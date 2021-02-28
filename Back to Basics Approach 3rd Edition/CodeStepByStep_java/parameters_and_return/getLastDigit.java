package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/getLastDigit
 *
 * Write a method named getLastDigit that returns the last digit of an integer.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 7:09 PM
 */
/*public*/ class getLastDigit {
  public static int getLastDigit(int n) {
    return Math.abs(n) % 10;
  }
}
