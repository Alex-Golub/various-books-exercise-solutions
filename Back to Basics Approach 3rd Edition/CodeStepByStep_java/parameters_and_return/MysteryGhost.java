package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/MysteryGhost
 *
 * NOTE: Trace first and only then compare your answer to program result
 *
 * @author Mr.Dr.Professor
 * @since 26-Feb-21 10:43 PM
 */
/*public*/ class MysteryGhost {
  public static void main(String[] args) {
    ghost(13);
  }

  private static void ghost(int x) {
    int y = 0;
    for (int i = 1; i < x; i *= 2) {
      y = witch(y, skeleton(x, i));
    }
    System.out.printf("ghost: x = %d, y = %d\n", x, y);
  }

  private static int witch(int x, int y) {
    x = 10 * x + y;
    System.out.printf("witch: x = %d, y = %d\n", x, y);
    return x;
  }

  private static int skeleton(int x, int y) {
    return x / y % 2;
  }
}
