package CodeStepByStep_java.if_else;

/**
 * https://www.codestepbystep.com/problem/view/java/ifelse/printRange
 *
 * @author Mr.Dr.Professor
 * @since 01-Mar-21 1:52 AM
 */
/*public*/ class printRange {
  public static void main(String[] args) {
  printRange(2, 7);
  printRange(19, 11);
  }

  public static void printRange (int a, int b) {
    if (a <= b) {
      System.out.print(a++);
      while (a <= b) {
        System.out.print(" " + a++);
      }
    } else {
      System.out.print(a--);
      while (a >= b) {
        System.out.print(" " + a--);
      }
    }
    System.out.println();
  }
}
