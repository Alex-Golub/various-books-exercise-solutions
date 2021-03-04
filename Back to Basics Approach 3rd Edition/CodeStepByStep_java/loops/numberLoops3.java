package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/numberLoops3
 *
 * ....1
 * ...2.
 * ..3..
 * .4...
 * 5....
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 12:22 AM
 */
/*public*/ class numberLoops3 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print(".");
      }

      System.out.print(i);

      for (int j = 1; j < i; j++) {
        System.out.print(".");
      }
      System.out.println();
    }
  }
}
