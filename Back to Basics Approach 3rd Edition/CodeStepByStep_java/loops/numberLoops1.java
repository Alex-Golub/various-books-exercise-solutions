package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/numberLoops1
 *
 * 1
 * 22
 * 333
 * 4444
 * 55555
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 12:17 AM
 */
/*public*/ class numberLoops1 {
  public static void main(String[] args) {
    int rows = 5;
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
