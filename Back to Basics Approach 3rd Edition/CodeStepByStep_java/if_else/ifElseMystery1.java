package CodeStepByStep_java.if_else;

/**
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 1:28 AM
 */
/*public*/ class ifElseMystery1 {
  public static void mystery(int n) {
    System.out.print(n + " ");
    if (n > 0) {
      n = n - 5;
    }
    if (n < 0) {
      n = n + 7;
    } else {
      n = n * 2;
    }
    System.out.println(n);
  }
}
