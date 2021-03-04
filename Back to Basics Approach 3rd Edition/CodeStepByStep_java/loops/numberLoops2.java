package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/numberLoops2
 *
 * ....1
 * ...22
 * ..333
 * .4444
 * 55555
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 12:19 AM
 */
/*public*/ class numberLoops2 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print(".");
      }

      for (int j = 0; j < i; j++) {
        System.out.print(i);
      }

      System.out.println();
    }
  }
}
