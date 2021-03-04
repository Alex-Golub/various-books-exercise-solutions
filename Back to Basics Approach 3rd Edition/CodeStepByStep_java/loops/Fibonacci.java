package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/FibonacciConstant
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 5:13 PM
 */
/*public*/ class Fibonacci {
  public static final int MAX_TERM_VALUE = 10_000;

  public static void main(String[] args) {
    System.out.println("This program lists the Fibonacci sequence.");
    int f1 = 0, f2 = 1;
    System.out.println(f1);
    while (f2 < MAX_TERM_VALUE) {
      System.out.println(f2);
      f2 += f1;
      f1 = f2 - f1;
      // f1   f2
      // 0    1    1    2    3    5    8 ...
    }
  }
}
