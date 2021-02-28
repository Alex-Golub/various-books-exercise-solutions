package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/getFirstDigit
 *
 * Write a method named getFirstDigit that returns
 * the first digit of an integer.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 7:06 PM
 */
/*public*/ class getFirstDigit {
  public static int getFirstDigit(int n) {
   n = Math.abs(n);
   while (n > 9) { // length of n is more then 2 digits?
     n /= 10;
   }

   return n;
  }
}
