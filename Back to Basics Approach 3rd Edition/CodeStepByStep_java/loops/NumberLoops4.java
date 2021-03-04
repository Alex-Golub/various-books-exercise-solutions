package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/numberLoops4constant
 *
 * SIZE = 5
 * ....1
 * ...2.
 * ..3..
 * .4...
 * 5....
 *
 * SIZE = 7
 * ......1
 * .....2.
 * ....3..
 * ...4...
 * ..5....
 * .6.....
 * 7......
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 12:27 AM
 */
/*public*/ class NumberLoops4 {
  static final int SIZE = 7;

  public static void main(String[] args) {
    for (int i = 1; i <= SIZE; i++) {
      for (int j = 1; j <= SIZE - i; j++) {
        System.out.print(".");
      }

      System.out.print(i);

      for (int j = 1; j <= i - 1; j++) {
        System.out.print(".");
      }
      System.out.println();
    }
  }
}
