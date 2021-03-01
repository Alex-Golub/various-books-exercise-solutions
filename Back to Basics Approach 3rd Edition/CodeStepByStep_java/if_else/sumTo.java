package CodeStepByStep_java.if_else;

/**
 * https://www.codestepbystep.com/problem/view/java/ifelse/sumTo
 *
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 1:58 AM
 */
/*public*/ class sumTo {
  public static int sumTo(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
}
