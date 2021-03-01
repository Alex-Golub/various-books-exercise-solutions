package CodeStepByStep_java.if_else;

/**
 * https://www.codestepbystep.com/problem/view/java/ifelse/fractionSum
 *
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 1:43 AM
 */
/*public*/ class fractionSum {
  public static double fractionSum(int n) {
    double sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += 1.0 / i;
    }

    return sum;
  }
}
