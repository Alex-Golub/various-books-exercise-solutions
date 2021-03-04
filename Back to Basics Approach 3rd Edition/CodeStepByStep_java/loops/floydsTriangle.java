package CodeStepByStep_java.loops;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/floydsTriangle
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 6:46 PM
 */
/*public*/ class floydsTriangle {
  public static void main(String[] args) {
    floydsTriangle(5);
  }

  public static void floydsTriangle(int k) {
    if (k <= 0) {
      return;
    }

    int n = 1;
    for (int i = 0; i < k; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(n++);
        System.out.print(j + 1 <= i ? " " : "\n");
      }
    }
  }
}
